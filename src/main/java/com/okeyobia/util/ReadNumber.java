package com.okeyobia.util;

import java.util.Scanner;

public class ReadNumber {

    public static int readIntegerValue(Scanner readValue) {
        int capacity = 0;
        try {
            capacity = readValue.nextInt();
        }
        catch(Exception e) {
            System.out.println("only numbers are allowed");
            readValue.nextLine();
            capacity = readIntegerValue(readValue);
        }
        return capacity;
    }
}
