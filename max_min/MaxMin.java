package com.max_min;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        test(1,2,3);
        test(2,3,1);
        test(3,1,2);
    }

    /*
    @desc: find maximum value among three numbers
    @params:a,b,c (three integers)
    @return: max(a,b,c)
     */
    public static int findMaxValue(int a,int b,int c){
        int res = a;
        if(res  < b){
            res = b;
        }
        if(res < c){
            res = c;
        }
        return res;
    }

    /*
    @desc: testing if findMaxValue method is working or not
    @params: a,b,c (three numbers)
    @return:
     */
    public static void test(int a,int b,int c){
        int maxVal = findMaxValue(a,b,c);
        System.out.printf("Max among %d, %d, %d is %d",a,b,c,maxVal);
        System.out.println();
    }
}
