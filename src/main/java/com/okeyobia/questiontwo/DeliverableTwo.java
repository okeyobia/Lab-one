package com.okeyobia.questiontwo;

import java.util.Random;
import java.util.Scanner;

public class DeliverableTwo {

    public static void main(String[] args) {
        Scanner readValue = new Scanner(System.in);
        int correctCount =0;
        System.out.println("Guess which will have more: heads or tails?");
        String headsOrTailGuess = readValue.next();
        System.out.println("How many times shall we flip a coin?");
        int numberOfFlips = readValue.nextInt();
        CoinToss toss = new CoinToss();

        for (int i = 1; i <= numberOfFlips; i++) {
            if (toss.flipCoin().toString().equalsIgnoreCase(headsOrTailGuess)) {
                System.out.println(headsOrTailGuess);
                correctCount++;
            }else
                System.out.println(toss.getValue(headsOrTailGuess));
        }
        double result = calculateStatistics(numberOfFlips, correctCount);
        String stringResult =String.format("%.2f", result);
        System.out.println("Your guess, " +  headsOrTailGuess +", came up "+ correctCount + " time(s).\n"   +  "That's "+ stringResult + "%");
        readValue.close();
    }

    private static double calculateStatistics(int numberOfFlips, int correctCount) {
         return (double) (correctCount * 100) / numberOfFlips;
    }

}
