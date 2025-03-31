package org.example;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        System.out.println(convertDecimalToBinary(13));
    }

    public static boolean checkForPalindrome(String text) {
        String cleanedStr = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        LinkedList<Character> charList = new LinkedList<>();
        for (char c : cleanedStr.toCharArray()) {
            charList.add(c);
        }

        while (charList.size() > 1) {
            if (!charList.pollFirst().equals(charList.pollLast())) {
                return false;
            }
        }

        return true;
    }

    public static String convertDecimalToBinary(int decimal) {
        LinkedList<Integer> binaryList = new LinkedList<>();
        while (decimal > 0) {
            int remainder = decimal % 2;
            binaryList.addFirst(remainder);
            decimal = decimal / 2;
        }

        StringBuilder binaryString = new StringBuilder();
        for (int digit : binaryList) {
            binaryString.append(digit);
        }

        return binaryString.toString();
    }
}