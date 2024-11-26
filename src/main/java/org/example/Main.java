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
    static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("დადებითი");
        } else if (number < 0) {
            System.out.println("უარყოფითი");
        } else {
            System.out.println("ნული");
        }
    }
    static void hasTeen(int a, int b, int c) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

