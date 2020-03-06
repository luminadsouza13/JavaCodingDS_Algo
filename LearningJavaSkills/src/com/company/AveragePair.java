package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AveragePair {

    public static boolean findAveragePair(Integer[] arr,int len,double averagepair)
    {

        if(len==0) return false;

        int left=0,right=len-1;

        double tempavg=0;
        while (left<right)
        {
            tempavg=(arr[left]+arr[right])/2.0;
            if(tempavg == averagepair) return true;
            else if (tempavg > averagepair)
            {
                right--;
            }
            else
            {
                left++  ;
            }

        }

        return false;

    }
    public static void main(String[] args) throws Exception
    {

        double averagepair=4.1;
        Integer[] arr={-1,0,3,4,5,6};

        int len=arr.length;
        boolean res=findAveragePair(arr,len,averagepair);

        System.out.println(res);

    }

}
