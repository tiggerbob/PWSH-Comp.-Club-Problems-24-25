import java.io.*;
import java.util.*;

public class MinCircle {
    // Helper inner classes for organization
    static class Circle {
        private static final double MULTIPLICATIVE_EPSILON = 1 + 1e-14;

        public final Point c;   // center
        public final double r;  // radius

        public Circle(Point c, double r) {
            this.c = c;
            this.r = r;
        }

        public boolean contains(Point p) {
            return c.distance(p) <= r * MULTIPLICATIVE_EPSILON;
        }
    }

    static class Point {
        public final double x;
        public final double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public Point subtract(Point p) {
            return new Point(x - p.x, y - p.y);
        }

        public double distance(Point p) {
            return Math.hypot(x - p.x, y - p.y);
        }

        public double cross(Point p) {
            return x * p.y - y * p.x;
        }
    }

    public static Circle makeCircle(List<Point> points) {
        // Shuffle points to maintain approximate O(n)
        List<Point> shuffled = new ArrayList<>(points);
        Collections.shuffle(shuffled, new Random());

        // Progressively add points to circle or recompute circle
        Circle c = null;
        for (int i = 0; i < shuffled.size(); i++) {
            Point p = shuffled.get(i);
            if (c == null || !c.contains(p))
                c = makeCircleOnePoint(shuffled.subList(0, i + 1), p);
        }
        return c;
    }

    // One boundary point known
    private static Circle makeCircleOnePoint(List<Point> points, Point p) {
        Circle c = new Circle(p, 0);
        for (int i = 0; i < points.size(); i++) {
            Point q = points.get(i);
            if (!c.contains(q)) {
                if (c.r == 0)
                    c = makeDiameter(p, q);
                else
                    c = makeCircleTwoPoints(points.subList(0, i + 1), p, q);
            }
        }
        return c;
    }

    // Two boundary points known
    private static Circle makeCircleTwoPoints(List<Point> points, Point p, Point q) {
        Circle circ = makeDiameter(p, q);
        Circle left  = null;
        Circle right = null;

        // For each point not in the two-point circle
        Point pq = q.subtract(p);
        for (Point r : points) {
            if (circ.contains(r))
                continue;

            // Form a circumcircle and classify it on left or right side
            double cross = pq.cross(r.subtract(p));
            Circle c = makeCircumcircle(p, q, r);
            if (c == null)
                continue;
            else if (cross > 0 && (left == null || pq.cross(c.c.subtract(p)) > pq.cross(left.c.subtract(p))))
                left = c;
            else if (cross < 0 && (right == null || pq.cross(c.c.subtract(p)) < pq.cross(right.c.subtract(p))))
                right = c;
        }

        // Select which circle to return
        if (left == null && right == null)
            return circ;
        else if (left == null)
            return right;
        else if (right == null)
            return left;
        else
            return left.r <= right.r ? left : right;
    }

    static Circle makeDiameter(Point a, Point b) {
        Point c = new Point((a.x + b.x) / 2, (a.y + b.y) / 2);
        return new Circle(c, Math.max(c.distance(a), c.distance(b)));
    }

    static Circle makeCircumcircle(Point a, Point b, Point c) {
        double ox = (Math.min(Math.min(a.x, b.x), c.x) + Math.max(Math.max(a.x, b.x), c.x)) / 2;
        double oy = (Math.min(Math.min(a.y, b.y), c.y) + Math.max(Math.max(a.y, b.y), c.y)) / 2;
        double ax = a.x - ox,  ay = a.y - oy;
        double bx = b.x - ox,  by = b.y - oy;
        double cx = c.x - ox,  cy = c.y - oy;
        double d = (ax * (by - cy) + bx * (cy - ay) + cx * (ay - by)) * 2;
        if (d == 0)
            return null;
        double x = ((ax*ax + ay*ay) * (by - cy) + (bx*bx + by*by) * (cy - ay) + (cx*cx + cy*cy) * (ay - by)) / d;
        double y = ((ax*ax + ay*ay) * (cx - bx) + (bx*bx + by*by) * (ax - cx) + (cx*cx + cy*cy) * (bx - ax)) / d;
        Point p = new Point(ox + x, oy + y);
        double r = Math.max(Math.max(p.distance(a), p.distance(b)), p.distance(c));
        return new Circle(p, r);
    }

    public static void main(String[] args) throws IOException {
        // Reading input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Point> points = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String[] m = br.readLine().split(" ");
            Point meteor = new Point(Double.parseDouble(m[0]), Double.parseDouble(m[1]));
            points.add(meteor);
        }

        double R = Double.parseDouble(br.readLine());

        br.close();

        // Find the minimum bounding circle of the given meteors
        Circle minCircle = makeCircle(points);

        // Output result
        // System.out.println(minCircle.r);
        if (minCircle.r <= R)
            System.out.println("KABOOM");
        else
            System.out.println("RECHART COURSE");
    }
}
