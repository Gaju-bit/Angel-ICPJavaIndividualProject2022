package Angel_individual_project;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Route {
    String airlineroutes = "C:\\Users\\Gaju Manzi\\IdeaProjects\\Angel_individual_project\\src\\routes.csv";
    String delimiter = ",";
    String gotoline;
    Airport startingpoint = new Airport();
    int stops;
    int totalStops;
    public String sourceAirportID;
    public String souceCode;
    public String destinationAirportID;
    public String destinationCode;
    List<List<String>> sourceAirlines = new ArrayList();
    List<List<String>> destinationAirlines = new ArrayList();
    public List<List<String>> finalData = new ArrayList();


    /**create setters  the start route of the user
     *using the start and destination from the airport class
     * getting data from the route.csv file
     * then using the airport ID for start and destination with and statement
     * and the start and destination airport ID to compare with the start and destination Airport ID from the route file
     * i then got the airports route from start airport to the destination Airport
     * also got the number of stops from the route file and using a four loop i got the total number of stops for all the route
     * */
    public void getAirlineID() throws FileNotFoundException {
        this.startingpoint.runCode();
        this.startingpoint.sourceData.forEach((temp) -> {
            this.sourceAirportID = (String)temp.get(0);
            System.out.println(this.sourceAirportID);
        });
        this.startingpoint.destinationData.forEach((temp1) -> {
            this.destinationAirportID = (String)temp1.get(0);
            System.out.println(this.destinationAirportID);
        });

        try {
            BufferedReader br = new BufferedReader(new FileReader(this.airlineroutes));

            try {
                label78:
                while(true) {
                    List currentValues;
                    do {
                        do {
                            do {
                                do {
                                    if ((this.gotoline = br.readLine()) == null) {
                                        System.out.println("Printing final Data");
                                        this.finalData.forEach((l) -> {
                                            System.out.println(l);
                                        });
                                        this.finalData.forEach((out) -> {
                                            PrintStream var10000 = System.out;
                                            String var10001 = (String)out.get(0);
                                            var10000.println(var10001 + " from " + (String)out.get(2) + " to " + (String)out.get(4) + " " + (String)out.get(7) + " stops");
                                        });
                                        System.out.println("Total flights: " + this.finalData.size());
                                        this.finalData.forEach((st) -> {
                                            this.totalStops += Integer.parseInt((String)st.get(7));
                                        });
                                        System.out.println("Total additional stops: " + this.totalStops);
                                        
                                        FileWriter writer = new FileWriter("output.txt");
                                        finalData.forEach(out -> {
                                            try {
                                                writer.write(out.get(0) + " from "+  out.get(2) + " to " + out.get(4) + " "+ out.get(7) + " stops \n");
                                                writer.write("Total flights: " + finalData.size() + "\n");
                                                writer.write("Total additional stops: " + totalStops + "\n");
                                            } catch (IOException e) {
                                                e.printStackTrace();
                                            }
                                        });
                                        writer.close();
                                        break label78;
                                    }

                                    currentValues = Arrays.asList(this.gotoline.split(this.delimiter));
                                } while(this.startingpoint.sourceAirportID == null);
                            } while(currentValues.get(3) == null);
                        } while(this.startingpoint.destinationAirportID == "");
                    } while(currentValues.get(5) == "");

                    String sourceoutput = (String)currentValues.get(3);
                    String destinationoutput = (String)currentValues.get(5);
                    int lengthofsourceairport = this.startingpoint.ListofsourceAirportID.size();
                    int lengthofdestinationairport = this.startingpoint.DestinationAirportID.size();
                    if (lengthofsourceairport <= lengthofdestinationairport) {
                        ;
                    }

                    for(int j = 0; j < lengthofsourceairport; ++j) {
                        if (((String)this.startingpoint.ListofsourceAirportID.get(j)).equals(sourceoutput)) {
                            for(int k = 0; k < lengthofdestinationairport; ++k) {
                                if (((String)this.startingpoint.DestinationAirportID.get(k)).equals(destinationoutput)) {
                                    this.finalData.add(currentValues);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable var11) {
                try {
                    br.close();
                } catch (Throwable var10) {
                    var11.addSuppressed(var10);
                }

                throw var11;
            }

            br.close();
        } catch (Exception var12) {
            System.out.println(var12);
        }

    }


    public void codetorun() throws FileNotFoundException {
        this.getAirlineID();
    }
}
