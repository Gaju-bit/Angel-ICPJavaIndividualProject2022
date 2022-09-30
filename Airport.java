package Angel_individual_project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Airport {

    /**declare variables*/
    public String destination_country;
    public String destination_city;
    public String current_country;
    public String current_city;
    public String destinationICAOCode;
    public String sourceICAOCode;
    public String destinationIATACode;
    public String sourceIATACode;
    public String sourceAirportID;
    public String destinationAirportID;

    /**Create arraylists of lists for the data*/
    List<List<String>> lines = new ArrayList();
    List<List<String>> sourceData = new ArrayList();
    List<List<String>> destinationData = new ArrayList();
    List<String> ListofsourceAirportID = new ArrayList();
    List<String> DestinationAirportID = new ArrayList();
    String file = "C:\\Users\\Gaju Manzi\\IdeaProjects\\Angel_individual_project\\src\\airports.csv";
    String delimiter = ",";
    String line;

    /**create setters  the start route of the user
     *
     * taking inputs as parameters that is the country and city
     * and then setting them to the global variable current country and current city
     * */
    public void setCurrentRoute(String country, String city) {
        //Scanner myObj = new Scanner(System.in);
        //System.out.println("Enter the start country");
        //String country = myObj.nextLine();
        this.current_country = country;
        //System.out.println("Enter the start city");
        //String city = myObj.nextLine();
        this.current_city = city;
    }

    /**create setters  the destination route of the user
     *
     * taking inputs as parameters that is the country and city
     * and then setting them to the global variable destination country and destination city
     * */
    public void setDistination(String country, String city) {
//        Scanner myObj = new Scanner(System.in);
//        System.out.println("Enter the Destination country");
//        String country = myObj.nextLine();
        this.destination_country = country;
//        System.out.println("Enter the Destination city");
//        String city = myObj.nextLine();
        this.destination_city = city;
    }


    /**create getter to get the list of all Airports
     *
     * getting the airports from the country and city that the current user is currently located at
     * also getting all the airports at the country and city where the user is going to
     * also getting the IATA and IAOC code
     * getting the Airport ID for both the start and destination airport
     * */
    public void getAirportData() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(this.file));

            try {
                while(true) {
                    if ((this.line = br.readLine()) == null) {
                        System.out.println("Printing Destination Country");
                        this.destinationData.forEach((l) -> {
                            System.out.println(l);
                        });
                        System.out.println("Printing source Country");
                        this.sourceData.forEach((l) -> {
                            System.out.println(l);
                        });
                        System.out.println("Printing IATA code for destination");
                        System.out.println(this.destinationIATACode);
                        System.out.println("Printing ICAO code for destination");
                        System.out.println(this.destinationICAOCode);
                        System.out.println("Printing IATA code for source");
                        System.out.println(this.sourceIATACode);
                        System.out.println("Printing ICAO code for source");
                        System.out.println(this.sourceICAOCode);
                        break;
                    }

                    List<String> values = Arrays.asList(this.line.split(this.delimiter));
                    if (this.destination_country.equalsIgnoreCase((String)values.get(3)) && this.destination_city.equalsIgnoreCase((String)values.get(2))) {
                        this.destinationIATACode = (String)values.get(4);
                        this.destinationICAOCode = (String)values.get(5);
                        this.destinationAirportID = (String)values.get(0);
                        this.DestinationAirportID.add(this.destinationAirportID);
                        this.destinationData.add(values);
                    }

                    if (this.current_country.equalsIgnoreCase((String)values.get(3)) && this.current_city.equalsIgnoreCase((String)values.get(2))) {
                        this.sourceIATACode = (String)values.get(4);
                        this.sourceICAOCode = (String)values.get(5);
                        this.sourceAirportID = (String)values.get(0);
                        this.ListofsourceAirportID.add(this.sourceAirportID);
                        this.sourceData.add(values);
                    }

                    this.lines.add(values);
                }
            } catch (Throwable var5) {
                try {
                    br.close();
                } catch (Throwable var4) {
                    var5.addSuppressed(var4);
                }

                throw var5;
            }

            br.close();
        } catch (Exception var6) {
            System.out.println(var6);
        }

    }


    /**create setters  the start route of the user
     *
     * a function to combine all the functions in the airport class and run them in one go
     * */
    public void runCode() {
        this.setCurrentRoute("Russia", "Astrakhan");
        this.setDistination("Russia", "Kazan");
        this.getAirportData();
    }
}
