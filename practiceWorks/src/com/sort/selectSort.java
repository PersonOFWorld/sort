package com.sort;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by One on 2016/4/23.
 */
public class selectSort {

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
        selectSort selectSort=new selectSort();
        selectSort.selectSort(str,n);
    }
    //选择排序，每次排序后都会在i位置放上最符合要求的元素
    public void selectSort(int str[],int n){
        int str1[]=str;
        for(int i=0;i<n;i++){
            int min=i;
            for(int t=i+1;t<n;t++){
                if(str1[min]>str1[t]) {
                    min = t;
                }
            }
            int temp=str1[min];
            str1[min]=str1[i];
            str1[i]=temp;
        }
        System.out.print("\n"+"选择排序:   ");
        print(str1,n);
    }
    public void print(int str[],int n){
        System.out.print("New Array:  ");
        for(int j=0;j<n;j++){
            System.out.print(str[j]+"\t");
        }
    }
}
