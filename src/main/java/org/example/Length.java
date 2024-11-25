package org.example;

public class Length {

    private String text;

    public Length(String text) {
        this.text = text;
    }

    public void checkLength() {
        if (text.length() % 2 == 0) {
            System.out.println("სტრიქონის სიგრძე არის ლუწია.");
        } else {
            System.out.println("სტრიქონის სიგრძე არის კენტია.");
        }
    }

    public static void main(String[] args) {

        Length length = new Length("sound mind sound body");

        length.checkLength();
    }
}

