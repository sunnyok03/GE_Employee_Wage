package com.assignment_day_2.String;

import java.util.Arrays;
import java.util.Scanner;
/*Convert to char array and then reverse
 and then again convert back to string*/
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] charArr = s.toCharArray();
        int i=0,j=s.length()-1;
        while(i<=j){
            char temp = charArr[i];
            charArr[i] = charArr[j];
            charArr[j] = temp;
            i++;
            j--;
        }
        s = new String(charArr);
        System.out.println(s);
    }
}
