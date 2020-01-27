package com.bridgelabz.com;
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

}
