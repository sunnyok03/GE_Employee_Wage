package com.extra_21_11_2023.String;

import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string A and B: ");
        String A = sc.next();
        String B = sc.next();
        char[] freqA = new char[256];
        char[] freqB = new char[256];
        if(A.length() !=  B.length()){
            System.out.println("No anagram is there.");
            return;
        }
        for(int i=0;i<A.length();i++){
            freqA[A.charAt(i)]++;
            freqB[B.charAt(i)]++;
        }
        for(int i=0;i<256;i++){
            if(freqA[i] != freqB[i]){
                System.out.println("No anagram is there.");
                return;
            }
        }
        System.out.println("Anagram is there.");
    }
}
