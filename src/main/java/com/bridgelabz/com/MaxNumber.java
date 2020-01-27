package com.bridgelabz.com;
public class MaxNumber {

    public static void main(String args[])
    {
        int x=10;
        int y=20;
        int z=5;
        findMaxNumber(x,y,z);
    }

    private static int findMaxNumber(int x, int y, int z) {
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
}
