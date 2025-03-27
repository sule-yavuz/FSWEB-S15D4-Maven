package org.example;

import java.util.Stack;

public class Main {

    // checkForPalindrome metodu
    public static boolean checkForPalindrome(String input) {
        // String'i temizleme (küçük harfe çevirme ve noktalama işaretlerini çıkarma)
        String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

        // Stack'e string karakterlerini ekleyelim
        for (int i = 0; i < cleanedInput.length(); i++) {
            stack.push(cleanedInput.charAt(i));
        }

        // String'in tersten okunduğunu kontrol edelim
        for (int i = 0; i < cleanedInput.length(); i++) {
            if (cleanedInput.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    // Decimal'den Binary'ye dönüştürme metodu
    public static String convertDecimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    public static void main(String[] args) {
        // Test amaçlı kullanılabilir
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(convertDecimalToBinary(5));
    }
}
