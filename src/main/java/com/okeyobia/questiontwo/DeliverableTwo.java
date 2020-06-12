package com.okeyobia.questiontwo;

import java.util.Random;
import java.util.Scanner;

public class DeliverableTwo {

    public static void main(String[] args) {
        int correctCount =0;
        Scanner readValue = new Scanner(System.in);
        System.out.println("Guess which will have more: heads or tails?");
        String headsOrTailGuess = readValue.next();
        System.out.println("How many times shall we flip a coin?");
        int numberOfFlips = readValue.nextInt();
        DeliverableTwo dt = new DeliverableTwo();


        for (int i = 1; i <= numberOfFlips; i++) {
            if (dt.flipCoin().toString().equalsIgnoreCase(headsOrTailGuess)) {
                System.out.println(headsOrTailGuess);
                correctCount++;
            }else
                System.out.println(getValue(headsOrTailGuess));
        }
        double result = (double) (correctCount * 100) / numberOfFlips;
        System.out.println(result + "%");
    }

    private static String getValue(String str){
        return (str.equalsIgnoreCase("heads")) ? "Tails" : "Heads";
    }

    private enum Coin {
        Heads, Tails
    };

    private Coin flipCoin() {
        Random random = new Random();
        int value = random.nextInt(2);
        return value == 1 ? Coin.Heads : Coin.Tails;
    }

}
