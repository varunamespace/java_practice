package org.example;

import java.util.ArrayList;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main{
    public static void main(String[] args) {
        System.out.println("arraaaayss");
        ArrayList<Integer> arr = new ArrayList<>();
        int[] arr1 = new int[5];
        for(int i=0;i<5;i++){
            arr.add(i);
        }
        System.out.println(arr);
        int[] s = new int[1];
        s[0]  = 1;
        //printing arrays
        System.out.println(Arrays.toString(s));
        String[] strarr = new String[1];
        strarr[0] = "hello";
        Integer[] intaarr = new Integer[1];
        System.out.println(Arrays.toString(strarr));
        intaarr[0] = 9;
        System.out.println(Arrays.toString(intaarr));

        //Declaration of twd dimensional array
        int [][] twod = new int [3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                twod[i][j] = j;
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println(twod[i][j]);
            }
        }
    }
}
