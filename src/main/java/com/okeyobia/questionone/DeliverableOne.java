package com.okeyobia.questionone;

import com.okeyobia.util.ReadNumber;

import java.util.Scanner;

public class DeliverableOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What kind of trip would you like to go on\n" +
                "musical tropical or adventurous?");
        String vacationType = getTrip(scanner);
        System.out.println("How many are in your group?");
        int groupSize = ReadNumber.readIntegerValue(scanner);
        String destination = getDestination(vacationType);
        String travelSuggestion = getFlightType(groupSize);
        String result = getResult(vacationType, groupSize, destination, travelSuggestion);
        System.out.println(result);
        scanner.close();

    }

    private static String getTrip(Scanner scanner){
        String tripType;
        while (true) {
            tripType = scanner.next();
            if (tripType.equalsIgnoreCase("musical")
                    || tripType.equalsIgnoreCase("tropical")
                    || tripType.equalsIgnoreCase("adventurous") )
                break;
            System.out.println("Please enter the right trip:\nmusical\ntropical\nadventurous" );
        }
        return tripType;
    }


    public static String getFlightType(int groupSize) {
        String flightType = "";
        if (groupSize >= 1 && groupSize <= 2){
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
           destination = "invalid";
        }
        return destination;
    }

    public static String getResult(String vacationType, int groupSize, String destination, String travelSuggestion) {
        String result;
        if (getDestination(vacationType).equals("invalid"))
            return result ="Please enter the correct trip.";
        result = "Since you’re a group of " + groupSize + " going on a " + vacationType + " vacation, you\n" +
                "should take a " + travelSuggestion + " to " + destination;
        return result;
    }

    enum VacationType {
        Musical, Tropical, Adventurous;
    }

}
