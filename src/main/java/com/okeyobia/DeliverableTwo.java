package com.okeyobia;

import java.util.Random;

public class DeliverableTwo {

    public static void main(String[] args) {

    }


    private enum Coin {
        Head, Tail
    };

    private Coin flipCoin() {
        Random random = new Random();
        int value = random.nextInt(2);
        return value == 1 ? Coin.Head : Coin.Tail;
    }

}
