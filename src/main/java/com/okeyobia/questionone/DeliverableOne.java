package com.okeyobia.questionone;

import java.util.Scanner;

public class DeliverableOne {

    public static void main(String[] args) {
        String result = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("What kind of trip would you like to go on\n " +
                "musical tropical or adventurous?");
        String vacationType = scanner.next();
        System.out.println("How many are in your group?");
        int groupSize = scanner.nextInt();

        String destination;
        String travelSuggestion;
        destination = getDestination(vacationType);
        travelSuggestion = getFlightType(groupSize);
        result = getResult(vacationType, groupSize, destination, travelSuggestion);

        System.out.println(result);
        scanner.close();

    }

    public static String getFlightType(int groupSize) {
        String flightType = "";
        if (groupSize == 1 || groupSize == 2){
            flightType = "First Class";
        }else if (groupSize >=3 && groupSize <= 5) {
            flightType = "Helicopter";
        } else if (groupSize >= 6) {
            flightType = "Charter Flight";
        }
        return flightType;
    }

    public static String getDestination(String vacationType) {
        String destination = "";
        if (vacationType.equalsIgnoreCase(VacationType.Musical.toString())) {
            destination = "New Orleans";
        }else if (vacationType.equalsIgnoreCase(VacationType.Tropical.toString())) {
            destination = "Beach Vacation in Mexico";
        }else if (vacationType.equalsIgnoreCase(VacationType.Adventurous.toString())){
            destination = "Whitewater Rafting the Grand Canyon";
        } else {
            System.out.println("Please enter the correct Vacation Type.");
        }
        return destination;
    }

    public static String getResult(String vacationType, int groupSize, String destination, String travelSuggestion) {
        String result;
        result = "Since you’re a group of " + groupSize + " going on a " + vacationType + " vacation, you\n" +
                "should take a " + travelSuggestion + " to " + destination;
        return result;
    }

    enum VacationType {
        Musical, Tropical, Adventurous;
    }

}
