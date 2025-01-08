import java.io.*;

public class MinCircle2D {
    private Vector2D mCenter;
    private double mRadius;

    // Inner class for 2D vector operations
    public static class Vector2D {
        public double x, y;

        public Vector2D(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public Vector2D add(Vector2D other) {
            return new Vector2D(this.x + other.x, this.y + other.y);
        }

        public Vector2D mul(double scalar) {
            return new Vector2D(this.x * scalar, this.y * scalar);
        }

        public double lengthSquared() {
            return x * x + y * y;
        }

        public double distance(Vector2D other) {
            return Math.sqrt(Math.pow(x - other.x, 2) + Math.pow(y - other.y, 2));
        }
    }

    // Constructor
    public MinCircle2D(Vector2D center, double radius) {
        this.mCenter = center;
        this.mRadius = Math.abs(radius);
    }

    public boolean contains(Vector2D pt, double tolerance) {
        return mCenter.distance(pt) <= mRadius + tolerance;
    }

    public static MinCircle2D createCircumcircle(Vector2D a, Vector2D b, Vector2D c) {
        double a2 = a.lengthSquared();
        double b2 = b.lengthSquared();
        double c2 = c.lengthSquared();

        double adet = 1.0 / determinant(
                a.x, a.y, 1.0,
                b.x, b.y, 1.0,
                c.x, c.y, 1.0
        );

        Vector2D center = new Vector2D(
                adet * 0.5 * determinant(a2, a.y, 1.0, b2, b.y, 1.0, c2, c.y, 1.0),
                adet * 0.5 * determinant(a.x, a2, 1.0, b.x, b2, 1.0, c.x, c2, 1.0)
        );

        return new MinCircle2D(center, center.distance(a));
    }

    public static MinCircle2D createFromDiameter(Vector2D a, Vector2D b) {
        Vector2D center = a.add(b).mul(0.5);
        return new MinCircle2D(center, center.distance(a));
    }

    private static MinCircle2D minBoundingCircle (Vector2D[] points, int start, int end, Vector2D pin1, Vector2D pin2) {
        int current = start;
        MinCircle2D circ;
        if (pin1 != null && pin2 != null) {
            circ = MinCircle2D.createFromDiameter(pin1, pin2);
        } else if (pin1 != null) {
            circ = MinCircle2D.createFromDiameter(points[current++], pin1);
        } else {
            circ = MinCircle2D.createFromDiameter(points[current], points[current + 1]);
            current += 2;
        }

        while (current < end) {
            if (!circ.contains(points[current], 0.0)) {
                if (pin1 != null && pin2 != null) {
                    circ = MinCircle2D.createCircumcircle(pin1, pin2, points[current]);
                } else if (pin1 != null) {
                    minBoundingCircle(points, start, current, pin1, points[current]);
                } else {
                    minBoundingCircle(points, start, current, points[current], null);
                }
            }
            current++;
        }

        return circ;
    }

    // Helper method to compute the determinant of a 3x3 matrix
    private static double determinant(
            double a1, double a2, double a3,
            double b1, double b2, double b3,
            double c1, double c2, double c3
    ) {
        return a1 * (b2 * c3 - b3 * c2)
                - a2 * (b1 * c3 - b3 * c1)
                + a3 * (b1 * c2 - b2 * c1);
    }

    public static void main(String[] args) throws IOException {
        // Reading input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Vector2D[] points = new Vector2D[N];

        for (int i = 0; i < N; i++) {
            String[] m = br.readLine().split(" ");
            Vector2D meteor = new Vector2D(Double.parseDouble(m[0]), Double.parseDouble(m[1]));
            points[i] = meteor;
        }

        double R = Double.parseDouble(br.readLine());

        br.close();

        // Find the minimum bounding circle of the given meteors
        MinCircle2D minCircle = minBoundingCircle(points, 0, points.length, null, null);

        // Output result
        System.out.println(minCircle.mRadius);
        if (minCircle.mRadius <= R)
            System.out.println("KABOOM");
        else
            System.out.println("RECHART COURSE");

    }
}
