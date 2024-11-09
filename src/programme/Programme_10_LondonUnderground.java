package programme;
/**
 * . Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name
 *
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Programme_10_LondonUnderground {

    public static void main(String[] args) {


        // Create a HashMap to store stations and the lines that pass through them
        Map<String, String[]> stationLines = new HashMap<>();

        // Add Zone 1 stations and the lines that pass through them


        stationLines.put("Baker Street", new String[]{"Bakerloo", "Circle", "Hammersmith & City", "Jubilee"});
        stationLines.put("Oxford Circus", new String[]{"Bakerloo", "Central", "Victoria"});
        stationLines.put("Victoria", new String[]{"Victoria", "Circle", "District"});
        stationLines.put("Liverpool Street", new String[]{"Central", "Circle", "Hammersmith & City", "Metropolitan"});
        stationLines.put("King's Cross", new String[]{"Northern", "Victoria", "Piccadilly", "Hammersmith & City"});
        stationLines.put("London Bridge", new String[]{"Jubilee", "Northern"});
        stationLines.put("Waterloo", new String[]{"Bakerloo", "Jubilee", "Northern"});
        stationLines.put("Paddington", new String[]{"Bakerloo", "Circle", "District", "Hammersmith & City"});
        stationLines.put("Piccadilly Circus", new String[]{"Bakerloo", "Piccadilly"});
        stationLines.put("Euston", new String[]{"Victoria", "Northern"});

        // Create a scanner
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a station
        System.out.println("Enter a Zone 1 station name to find out which lines pass through it:");
        String station = scanner.nextLine().trim();

        // Check if the station exists in the map and print the result
        if (stationLines.containsKey(station)) {
            String[] lines = stationLines.get(station);
            System.out.println("The following lines pass through " + station + ":");
            for (String line : lines) {
                System.out.println("- " + line);
            }
        } else {
            System.out.println("Station not found. Please make sure you entered a Zone 1 station.");
        }

        // Close  scanner
        scanner.close();
    }
}

