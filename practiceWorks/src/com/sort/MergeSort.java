package com.sort;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by One on 2016/4/23.
 */
public class MergeSort {
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
        MergeSort mergeSort = new MergeSort();
        mergeSort.mSort(str,0,n-1);
        print(str,n);
    }
    //分组
    public static void mSort(int str[], int left, int right){
        if (left >= right)
            return;
        int mid = (left + right)/2;

        mSort(str,left,mid);
        mSort(str,mid+1,right);
        merge(str,mid,left,right);
    }
    //归并
    public static void merge(int str[],int mid, int left,int right){
        int [] ss=new int[right-left+1];//新数组

        int i = left;
        int j = mid + 1;
        int k = 0;

        while(i <= mid && j <= right){
            if(str[i]<=str[j])
                ss[k++]=str[i++];
            else
                ss[k++]=str[j++];
        }

        while (i <= mid){
            ss[k++] = str[i++];
        }

        while (j <= right){
            ss[k++] = str[j++];
        }
        System.out.print("\n"+ss.length+"\t");
        for(int p=0; p < ss.length; p++){
            str[left + p] = ss[p];
            System.out.print(ss[p]+"\t");
        }

    }
    public static void print(int str[],int n){
        System.out.print("\n"+"New Array:  ");
        for(int j=0;j<n;j++){
            System.out.print(str[j]+"\t");
        }
    }
}
