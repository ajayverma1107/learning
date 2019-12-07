package com.learn.binary;

import java.util.ArrayList;

public class FirstMissingPositive {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 0 };
		FirstMissingPositive obj = new FirstMissingPositive();
	//	System.out.println(obj.firstMissingPositive(A));
	}

	public int firstMissingPositive(ArrayList<Integer> A) {
        int N = A.size();
        int result = 0;
        for(int i=0;i<N;i++){
            int num = A.get(i);
            if(num>=1 && num<=(N+1)){
                A.set(i, i+1);
            }
        }
        
        for(int i=0;i<N;i++){
        	int num = A.get(i);
        	if(num!=(i+1)){
        		result = i+1;
        		break;
        	}
        }
        
        return result;
    }
}