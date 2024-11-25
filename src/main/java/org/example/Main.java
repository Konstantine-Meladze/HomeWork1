package org.example;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 5, 7, 9, 10};

        int evenCount = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            }
        }

        if (evenCount == 0) {
            System.out.println("მასივში არ არის ლუწი რიცხვი");
        } else {
            System.out.println("ამ მასივში არის " + evenCount + " ლუწი რიცხვი");
        }
    }
}

