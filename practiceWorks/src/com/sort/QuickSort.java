package com.sort;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by One on 2016/4/23.
 */
public class QuickSort {
    static int i=0;
    static int n=0;
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        n=sc.nextInt();
        int str[] = new int[n];
        for(int i=0;i<n;i++){
            str[i]=rand.nextInt(100);
        }
//        n=6;
//        int str[]={19,18,23,45,7,28};
        System.out.print("Old array:  ");
        for(int j=0;j<n;j++){
            System.out.print( str[j] + "\t");
        }
        QuickSort quickSort=new QuickSort();
        quickSort.sort(str,n);
        print(str,n);
    }
    public static void sort(int str[],int n){
        if (str == null || n == 0){
            return;
        }
        quikeSort(str,0,n-1);
    }
    //快速排序
    public static void quikeSort(int str[],int left,int right){
        if (left>=right)
            return;
        //int pivotPos = partition(str,left,right);
        int pivotPos = partitionGood(str,left,right);
//        i++;
//        System.out.print("分界线-"+i+"-"+pivotPos+"\t");
        quikeSort(str,left,pivotPos-1);
        quikeSort(str,pivotPos+1,right);
    }
    //第一种
    public static int partition(int []str,int left,int right){
        int pivotKey=str[left];
        int pivotPointer=left;

        while(left < right){

            while(left < right && str[right]>=pivotKey)
                right--;
            while(left < right && str[left]<=pivotKey)
                left++;
            swap(str,left,right);
        }
        i++;
        swap(str,pivotPointer,left);
        System.out.print("\n"+"第"+i+"次");
        print(str,n);
        return left;
    }
    //优化,节省空间
    public static int partitionGood(int []str,int left,int right){
        int pivotKey=str[left];

        while(left < right){

            while(left < right && str[right]>=pivotKey)
                right--;
            str[left]=str[right];
            while(left < right && str[left]<=pivotKey)
                left++;
            str[right]=str[left];
        }
        str[left]=pivotKey;
        return left;
    }
    public static void swap(int str[],int left,int right){
        int temp = str[left];
        str[left] = str[right];
        str[right] = temp;
    }
    public static void print(int str[],int n){
        System.out.print("\n"+"New Array:  ");
        for(int j=0;j<n;j++){
            System.out.print(str[j]+"\t");
        }
    }
}
