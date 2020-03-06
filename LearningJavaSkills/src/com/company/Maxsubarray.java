package com.company;

public class Maxsubarray {

    public static Object maxsubarraysum(Integer[] arr,int len,int n) throws Exception
    {

        if(len<n)
        {
            return "null";
        }

        int  maxsumarray=0,tempmaxsumarray=0;
        for(int i=0;i<n;i++)
        {
            maxsumarray+=arr[i];

        }
        tempmaxsumarray=maxsumarray;

        //solution to find and traverse over loop and do max comparision
        for(int i=n;i<len;i++)
        {

            tempmaxsumarray=tempmaxsumarray + arr[i] - arr[i-n];

            maxsumarray=Math.max(tempmaxsumarray,maxsumarray);
        }

        return maxsumarray;
    }
    public static void main(String[] args) throws Exception
    {
        //given inputs are array of integers and a number
        //function maxsubarraysum
        //ooutput =

        Integer[] arr={3,-2,7,-4,1,4,-2,1};
        int n=2;
        int len=arr.length;
        System.out.println(maxsubarraysum(arr,len,n));
    }
}
