package com.bridgelabz.com;
public class MaxNumber {

    public static int findMaxNumber(Integer x, Integer y, Integer z) {
        Integer max=x;
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


    public static float findFloatMaxNumber(Float x, Float y, Float z) {
        Float max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }
}
