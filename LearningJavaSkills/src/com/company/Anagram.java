package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Anagram {

    public static HashMap<Character,Integer> freq1=new HashMap<Character,Integer>();
    public static HashMap<Character,Integer> freq2=new HashMap<Character,Integer>();



    public static boolean anagrams(String s1, Integer len1, String s2, Integer len2)
    {

        if(len1!=len2)
        {
            System.out.println("Length Not matching");
            return false;
        }
        for(int i=0;i<len1;i++)
        {
            if(!(freq1.keySet().contains(s1.charAt(i))))
            {
                freq1.put(s1.charAt(i),1);
            }
            else {
                freq1.put(s1.charAt(i), freq1.get(s1.charAt(i)) + 1);
            }
        }

        for(int i=0;i<len2;i++)
        {
            if(!(freq2.keySet().contains(s2.charAt(i))))
            {
                freq2.put(s2.charAt(i),1);
            }
            else {
                freq2.put(s2.charAt(i),freq2.get(s2.charAt(i))+1);
            }
        }

        System.out.println(freq1);
        System.out.println(freq2);

        for(Character keys: freq1.keySet())
        {
            if(!freq2.containsKey(keys))
            {
                System.out.println("Not an Anagram, does not contains key ");
                return false;
            }
            if(( freq2.get(keys) == freq1.get(keys) )) {
            }
            else {
                System.out.println("Not an Anagram");
            }

        }

        return true;
    }
    public static void main(String[] args) throws Exception
    {
        String s1= new BufferedReader(new InputStreamReader(System.in)).readLine();
        String s2= new BufferedReader(new InputStreamReader(System.in)).readLine();

        Integer len1=s1.length();
        Integer len2=s2.length();

        System.out.println(anagrams(s1,len1,s2,len2));

    }

}
