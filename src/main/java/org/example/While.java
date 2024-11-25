package org.example;

public class While {
    public static void main(String[] args) {
        String text = "She had the most mesmerizing blue eyes";

        int index = 2;

        while (index < text.length()) {
            char currentChar = text.charAt(index);

            System.out.println("მესამე სიმბოლო: " + currentChar);

            if (currentChar == 'z') {
                System.out.println("'z' სიმბოლო ნაპოვნია, ციკლი შეწყდა.");
                break;
            }

            index += 3;
        }
    }
}


