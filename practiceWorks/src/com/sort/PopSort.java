package com.sort;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by One on 2016/4/23.
 */
public class PopSort {

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
        PopSort popSort=new PopSort();
        popSort.pupleSort(str,n);

    }
    //冒泡排序,首先会把最符合规则的元素放在数组最后
    public void pupleSort(int str[],int n){
        int ss[]=str;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                int temp=0;
                if(ss[j]>ss[j+1]){
                    temp=ss[j];
                    ss[j]=ss[j+1];
                    ss[j+1]=temp;
                }
            }
        }
        System.out.print("\n"+"冒泡排序:   ");
        print(ss,n);
    }
    public void print(int str[],int n){
        System.out.print("New Array:  ");
        for(int j=0;j<n;j++){
            System.out.print(str[j]+"\t");
        }
    }
}
