package com.stringreverser.reversers;

public class ReverseStringWithArray implements IStringReverser{
    @Override
    public void reverseString(String s) {
        String[] array = s.split("");
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = array.length - 1; i >= 0; i--) {
            stringBuilder.append(array[i]);
        }
        System.out.println(stringBuilder.toString());
    }
}
