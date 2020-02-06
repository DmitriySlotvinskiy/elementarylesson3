package com.slotvinskiy;

//3*. Дана строка состоящая из любых символов.
// Не используя String.toLowerCase() перевести все большие латинские буквы в маленькие.

public class Task3 {

    public static void main(String[] args) {

        String originString = "REg1$tR@+iOn";
        String lowerCaseString = toLowerCase(originString);
        System.out.println(lowerCaseString);
    }

    private static String toLowerCase(String string) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);
            int difference = 'a' - 'A';
            if (currentChar > 'A' && currentChar < 'Z') {
                currentChar += difference;
            }
            sb.append(currentChar);
        }
        return sb.toString();
    }
}
