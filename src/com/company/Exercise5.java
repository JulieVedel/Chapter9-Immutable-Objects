package com.company;

import java.util.Arrays;
import java.lang.Math;

public class Exercise5 {
    public static void main(String[] args) {
        double[] a = {2.4, 1.0, 7.2, 5.8};
        int n = 7;
        System.out.println(Arrays.toString(powArray(a, n)));
    }
    public static double[] powArray(double[] array, int pow) {
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.pow(array[i], pow);
        }
        return array;
    }
}
