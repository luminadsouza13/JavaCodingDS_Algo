package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class FrequencyCountingPattern1 {

    static HashMap<Integer,Integer> hmmap=new HashMap<Integer,Integer>();
    static HashMap<Integer,Integer> hmmap2=new HashMap<Integer,Integer>();
    static boolean flag=false;

    public static boolean countFreq(Integer[] arr1,int s1,Integer[] arr2,int s2)
    {
        if(arr1.length != arr2.length)
        {
            System.out.println("Size not matching");
            return false;
        }

        int i;
        for(i=0;i<s1;i++)
        {
            if(hmmap.containsKey(arr1[i]))
            {
                hmmap.put(arr1[i],hmmap.get(arr1[i])+1);
            }
            else
            {
                hmmap.put(arr1[i],1);

            }
        }

        for(i=0;i<s2;i++ )
        {
            if(hmmap2.containsKey(arr2[i]))
            {
                hmmap2.put(arr2[i],hmmap2.get(arr2[i])+1);
            }
            else
            {
                hmmap2.put(arr2[i],1);
            }
        }

        System.out.println("hmmap "+ hmmap);
        System.out.println("hmmap2 "+ hmmap2);

        for(Integer keys : hmmap.keySet())
        {

            if(!(hmmap2.keySet().contains(keys*keys))) return false;

            if(hmmap.get(keys)!=hmmap2.get(keys*keys))
            {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) throws Exception{
	// write your code here
        Integer[] a1={3,2,5,2,6};
        Integer[] a2={9,4,25,4,36};

        int s1=a1.length;
        int s2=a2.length;

        flag=countFreq(a1,s1,a2,s2);

        System.out.println("Value is "+ flag);

    }
}
