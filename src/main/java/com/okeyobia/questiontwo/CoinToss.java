package com.okeyobia.questiontwo;

import java.util.Random;

public class CoinToss {

    public enum Coin {
        heads, tails
    };

    public Coin flipCoin() {
        Random random = new Random();
        int value = random.nextInt(2);
        return value == 1 ? Coin.heads : Coin.tails;
    }

    public String reverseHeadsOrTails(String str){
        return (str.equalsIgnoreCase("heads")) ? "tails" : "heads";
    }
}
