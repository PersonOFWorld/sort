package com.sort;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by One on 2016/4/23.
 */
public class CountSort {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int n=sc.nextInt();
        int str[] = new int[n];
        for(int i=0;i<n;i++){
            str[i]=rand.nextInt(100);
        }
        System.out.print("Old array:  ");
        for(int j=0;j<n;j++){
            System.out.print( str[j] + "\t");
        }
        CountSort countSort = new CountSort();
        countSort.countSort(str);
        countSort.print(str,n);
    }

    public static void countSort(int []str){
        if (str == null || str.length == 0)
            return ;
        int max=max(str);

        int [] count=new int[max+1];
        Arrays.fill(count,0);

        for(int i=0; i < str.length; i++){
                count[str[i]]++;
        }

        int k = 0;
        for (int i=0; i<=max; i++){
            for(int j=0; j<count[i];j++)
                str[k++]=i;
        }
    }
    public static int max(int str[]){
        int max = Integer.MIN_VALUE;
        for (int i : str){
            if(i>max)
                max=i;
        }
        return max;
    }
    public void print(int str[],int n){
        System.out.print("\n"+"New Array:  ");
        for(int j=0;j<n;j++){
            System.out.print(str[j]+"\t");
        }
    }
}
