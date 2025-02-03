import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class inputgenerator {

    public static void main(String[] args) {
        String x = """
                Spaala mayonaise ham.
Lemonated Nirturian sausages.
Luxcit mostly vegetarian conchiglie.
Tinned B'irans fish.
Tamuts snail livers.
Meat-flavoured Nirkloren cream.
Seaweed-flavoured Catkid gems.
Ustrguns netro-bacon.
Baconated Nirurian locusts.
Re-flavored Spaain megaplums.
Be'urian marine meatfish.
Grelajoren parsnip spaghetti.
Ka'zon beef pudding.
Jadaturian aqua-beetle.
Olgorian space-nutrient.
Melted Binegan flakes.
Moato marine wellington.
"Smoked" Odorkro pancakes.
Darguns luna-nutrient.
Lemonated Klaajoren pudding.
Catkruts space-protein.
Diced Nelaik snacks.
Tameks snail sausages.
V'eds chilli shavings.
Catala octo-bacon.
Ke'ois snail flush.
Bonlit sloth chips.
Soorian bio-gammon.
Globegs cyclo-pork.
Meat-free Feruts burgers.
Adrzoks Earth-gammon.
Powdered Luraela curry.
Tamerkid duckling batons.
Dry Luruts shards.
Dolphin-friendly Ke'aveola meatfish.
Jadacit hair burgers.
Klaetti Chinese steak.
Chlorinated Bonertoni pancakes.
Olkorn cabbage snacks.
Boiled Bolorian dust.
Ba'kruts mollusc hotwings.
Bos'zed hair paste.
Klaertoni flavour shapes.
Freeze-dried Vrokertoni sweets.
                """;
        PrintWriter writer = new PrintWriter(System.out);
        Scanner scan = new Scanner(x);
        List<String> food = new ArrayList<String>();
        while(scan.hasNextLine()){
            food.add(scan.nextLine());
        }
        scan.close();
        Map<String, Double> curencies = new HashMap<String, Double>() {{
            put("Moobie", 17.00);
            put("Kryp", .01);
            put("Piddle", 8.00);
            put("Snoodie", 2.00);
            put("Flux", 22.00);
        }};
        List<Map.Entry<String, Double>> curenciesCollec = new ArrayList<Map.Entry<String, Double>>(curencies.entrySet());
        for(int i = 3; i < 33 ; i++){

            try{
                    writer = new PrintWriter(new FileWriter("input" + i + ".txt"));
                }
            catch(Exception e){
                    System.out.println("no printwriter");
                }
            int times = (int)(Math.random() * 100 + 1);
            for(int e = 0; e < times; e++){


                try{
                
                Collections.shuffle(curenciesCollec);
                            // Write some text to the file
                            writer.print( (Math.random() * 1000 + 1 ));
                            writer.print(" ");
                            writer.print(curencies.keySet().toArray()[(int)Math.random() * curencies.keySet().toArray().length + 1]);
                            writer.print(" ");
                       
                            writer.println(food.get((int)(Math.random() * food.size())));
                
                            // Close the writer to ensure the data is written to the file
                            writer.close();
                }
                catch(Exception f){
                    f.printStackTrace();
                }
            }
            writer.close();

         }

        
        
        

    }
}
