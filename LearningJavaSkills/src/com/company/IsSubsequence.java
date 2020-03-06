package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IsSubsequence {

    public static boolean isSubSequence(String s1,int len1,String s2,int len2)
    {

        if(len1==0 || len2==0) {
            return false;
        }

        int i=0;
        int j=0;
        while(j<len2)
        {
            if(s2.charAt(j)==s1.charAt(i)) i++;

            if (i==len1) return true;
            j++;
        }

        return false;
    }

    public static void main(String[] args) throws Exception
    {

        String s1="Wo!";
        String s2="Hello World!";
        int len1=s1.length(),len2=s2.length();

        boolean flag=isSubSequence(s1,len1,s2,len2);

        System.out.println(flag);

    }


}
