package com.bridgelabz.com;

import java.util.Arrays;

public class MaxNumber<T extends Comparable<T>> {

    public static <T extends Object & Comparable<T>> T maxNumber(T x, T y, T z) {
        T max=x;
        if(y.compareTo(max) > 0 )
        {
            max=y;
        }
        if(z.compareTo(max) > 0)
        {
            max=z;
        }
        return max;
    }

    public static <T extends Object & Comparable<T>> T maxNumber(T... elements) {
        Arrays.sort(elements);
        T max = elements[0];
        for (T element : elements) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }

        return printMax(max);
    }

    private static <T> T printMax(T max) {
        System.out.println(max);
        return max;
    }

}
