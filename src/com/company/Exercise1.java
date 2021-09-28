package com.company;

public class Exercise1 {
    public static void main(String[] args) {
        boolean result = true;
        char letter = 'a';
        int number = 23;
        double decimal = 7.5;
        String word = "hi";

        System.out.println("Boolean + boolean can't be done.");
        System.out.println("Boolean + char can't be done.");
        System.out.println("Boolean + int can't be done.");
        System.out.println("Boolean + double can't be done.");
        System.out.println("Boolean + string = " + result + word);
        System.out.println(" ");

        System.out.println("Char + Boolean can't be done.");
        System.out.println("Char + char = " + letter + letter);
        System.out.println("Char + int = " + letter + number);
        System.out.println("Char + double = " + letter + decimal);
        System.out.println("Char + string = " + letter + word);
        System.out.println(" ");

        System.out.println("Int + boolean can't be done.");
        System.out.println("Int + char = " + number + letter);
        System.out.println("Int + int = " + number + number);
        System.out.println("Int + double = " + number + decimal);
        System.out.println("Int + string = " + number + word);
        System.out.println(" ");

        System.out.println("Double + boolean can't be done.");
        System.out.println("Double + char = " + decimal + letter);
        System.out.println("Double + int = " + decimal + number);
        System.out.println("Double + double = " + decimal + decimal);
        System.out.println("Double + string = " + decimal + word);
        System.out.println(" ");

        System.out.println("String + boolean = " + word + result);
        System.out.println("String + char = " + word + letter);
        System.out.println("String + int = " + word + number);
        System.out.println("String + double = " + word + decimal);
        System.out.println("String + string = " + word + word);
    }
}
