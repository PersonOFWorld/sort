package com.sort;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by One on 2016/4/23.
 */
public class ShellSort {
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
        ShellSort shellSort=new ShellSort();
        shellSort.shellSort(str,n);
    }

    //希尔排序，每次以数组长度的一半,然后依次减半，继续循环
    public void shellSort(int str[],int n){
        int ss[]=str;
        for (int gap=n/2;gap>0;gap/=2){
            System.out.println("\n"+"步长："+gap);
            for(int i=gap;i<n;i++){
                for(int j=i-gap;j>=0;j-=gap){
                    if(ss[j]>ss[j+gap]){
                        int temp=ss[j];
                        ss[j]=ss[j+gap];
                        ss[j+gap]=temp;
                    }
                }
            }
            System.out.print("\n"+"第"+gap+"希尔排序:   ");
            print(ss,n);
        }
        System.out.print("\n"+"希尔排序:   ");
        print(ss,n);
    }
    public void print(int str[],int n){
        System.out.print("New Array:  ");
        for(int j=0;j<n;j++){
            System.out.print(str[j]+"\t");
        }
    }
}
