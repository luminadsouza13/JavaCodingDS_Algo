package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CountDistinctValues {

    //1,2,2,3,4,5,5 =>
    public static int countdistinct(Integer[] arr,int len)
    {
        Arrays.sort(arr);

        int i=0,temp=0;

        if(arr.length==0) {
            return 0;
        }

        for(int j=1;j<len;j++)
        {
            if(arr[i]!=arr[j])
            {
                i=i+1;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }


        for(int j=0;j<arr.length;j++)
        System.out.print(arr[j]+" ");

        return i+1;
    }
    public static void main(String[] args) throws Exception
    {
        int n=Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());

        Integer[] arr=new Integer[n];

        for (int i=0;i<n;i++)
            arr[i]=Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());

        int len=arr.length;
        int val=countdistinct(arr,len);
        System.out.println("countdistinct - "+val);
    }
}
