package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class CountUniqueValues_Hashset {

    public static void countdistinct(Integer[] arr,int len)
    {
        HashSet<Integer> distinctval=new HashSet<Integer>();

        for(int i=0;i<len;i++)
        {
            distinctval.add(arr[i]);
        }

        System.out.println("Original Array length - "+len +" New Array containing unique - "+distinctval + " - "+distinctval.size());
    }
    public static void main(String args[]) throws Exception
    {
        int n=Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());

        Integer[] arr=new Integer[n];

        for (int i=0;i<n;i++)
            arr[i]=Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());

        int len=arr.length;
        countdistinct(arr,len);
    }
}
