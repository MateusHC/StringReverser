package com.stringreverser;

import com.stringreverser.reversers.IStringReverser;
import com.stringreverser.reversers.ReverseStringWithArray;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        reverseString(new ReverseStringWithArray());
    }

    public static void reverseString(IStringReverser stringReverser) {
        stringReverser.reverseString(getInput());
    }

    private static String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}

