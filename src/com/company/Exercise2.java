package com.company;

import java.math.BigInteger;

public class Exercise2 {

    public static void main(String[] args) {
        int n = 30;
        BigInteger sum = new BigInteger("1");

        for (int i = 1; i <= n; i++) {
            sum = sum.multiply(BigInteger.valueOf(i));
            System.out.println("The factorial number of " + i + " is " + sum);

            // The reason that the number is wrong after n = 15 is because int is going to a certain amount.
            // When we bypass that amount, the calculation will be wrong.
            // Therefore, we will have to make the int into a BigInteger.
        }
    }
}
