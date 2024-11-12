package edu.neu.mgen;

import java.util.Arrays;

public class Lab1P1 
{
    public static void main(String[] args) 
    {
        int[] x = {3, 7, 2, 8, 5};
        int[] y = {4, 5, 6, 1, 9};
        int[] z = new int[5];

        for (int i = 0; i < z.length; i++) 
        {
            z[i] = Math.max(x[i], y[i]);
        }

        System.out.println("Array x = " + Arrays.toString(x));
        System.out.println("Array y = " + Arrays.toString(y));
        System.out.println("Array z = x + y = " + Arrays.toString(z));
    }
}
