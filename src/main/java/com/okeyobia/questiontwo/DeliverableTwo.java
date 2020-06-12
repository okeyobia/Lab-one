package com.okeyobia.questiontwo;

import com.okeyobia.util.ReadNumber;
import java.util.Scanner;

public class DeliverableTwo {
    private static String getHeadOrTail(Scanner scanner){
        String headOrTail;
        while (true) {
            headOrTail = scanner.next();
            if (headOrTail.equalsIgnoreCase("heads")
                    || headOrTail.equalsIgnoreCase("tails"))
                break;
            System.out.println("Please enter the:\nheads or tails" );
        }
        return headOrTail;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CoinToss toss = new CoinToss();
        System.out.println("Guess which will have more: heads or tails?");
        String headsOrTailGuess = getHeadOrTail(scanner);
        System.out.println("How many times shall we flip a coin?");
        int numberOfFlips = ReadNumber.readIntegerValue(scanner);

        int correctCount = getCorrectCount(headsOrTailGuess, numberOfFlips, toss);
        double result = calculateStatistics(numberOfFlips, correctCount);
        String stringResult = String.format("%.2f", result);
        System.out.println();
        System.out.println("Here is Your Results");
        System.out.println("===================================");
        System.out.println();
        System.out.println("Your guess, " +  headsOrTailGuess.toUpperCase() +", came up "+ correctCount + " time(s).\n"   +  "That's "+ stringResult + "%");
        scanner.close();
    }

    private static int getCorrectCount(String headsOrTailGuess, int numberOfFlips, CoinToss toss) {
        int correctGuess = 0;
        for (int i = 1; i <= numberOfFlips; i++) {
            if (toss.flipCoin().toString().equalsIgnoreCase(headsOrTailGuess)) {
                System.out.println(headsOrTailGuess);
                correctGuess++;
            }else
                System.out.println(toss.reverseHeadsOrTails(headsOrTailGuess));
        }
        return correctGuess;
    }

    public static double calculateStatistics(int numberOfFlips, int correctCount) {
         return (double) (correctCount * 100) / numberOfFlips;
    }

}
