package com.sort;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by wang on 14/04/16.
 */
public class insertSort {
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
        insertSort sort=new insertSort();
        sort.insertSort(str,n);
    }
    //插入排序，会将i之前的元素先排好顺序
    public void insertSort(int str[],int n){
        int ss[]=str;
        for(int i=1;i<n;i++){
            int temp=ss[i];
            for(int j=i;j>0;j--){
                if(ss[i]<ss[j-1]){
                    ss[i]=ss[j-1];
                    ss[j-1]=temp;
                }
            }
        }
        System.out.print("\n"+"插入排序:   ");
        print(ss,n);
    }
    public void print(int str[],int n){
        System.out.print("New Array:  ");
        for(int j=0;j<n;j++){
            System.out.print(str[j]+"\t");
        }
    }
}
