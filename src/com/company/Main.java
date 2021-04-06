package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	    String s = "leeeegttttcccodeleabsda";
	    int ans = getFirstChar(s);
	    System.out.println(ans);
    }

    public static int getFirstChar(String s){
        HashMap<Character, Integer> first = new HashMap<>();
        int n = s.length();
        for (int i=0; i<n; i++){
            char c = s.charAt(i);
            first.put(c, first.getOrDefault(c,0)+1);
        }
        for (int i=0; i<n; i++){
            if (first.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}
