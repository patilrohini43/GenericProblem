package com.bridgelabz.com;
public class MaxNumber {

    public static int findMaxNumber(int x, int y, int z) {
        int max=x;
        if(y > max )
        {
            max=y;
        }
        if(z > max)
        {
            max=z;
        }
        return max;
    }


    public static float findFloatMaxNumber(float x, float y, float z) {
        float max=x;
        if(y > max )
        {
            max=y;
        }
        if(z > max)
        {
            max=z;
        }
        return max;
    }
}
