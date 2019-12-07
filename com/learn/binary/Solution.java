package com.learn.binary;

import java.util.ArrayList;
import java.util.Collections;


public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
	
	public static void main(String[] args) {
		ArrayList<Integer> list = findPerm("DDDDI",6);
		for(Integer num: list){
			System.out.print(num+" ");
		}
	}
    public static ArrayList<Integer> findPerm(final String A, int B) {
        ArrayList<Integer> list = new ArrayList<Integer>(B);
        for(int i=1;i<=B;i++){
            list.add(i);
        }
        
        char[] charArr = A.toCharArray();
        for(int i=0;i<A.length();i++){
            char ch = charArr[i];
            int decStartIndex = -1;
            int decEndIndex = -1;
            if(ch == 'D'){
            	decStartIndex = i;
            	i++;
            	while(i<A.length() && charArr[i]=='D'){
                	i++;
                }
            	i--;
            	decEndIndex = i;
            	Collections.reverse(list.subList(decStartIndex, decEndIndex+2));
            }
        }
        return list;
    }
}
