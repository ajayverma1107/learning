package com.learn.binary;

public class AllSubSetsofSet {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		int[] subSet = new int[arr.length];
		subSet(arr,subSet,0);
	}
	
	static void subSet(int[] arr,int[] subSet,int i){
		if(i==arr.length){
			print(subSet);
		}else{
			subSet[i] = -1;
			subSet(arr,subSet,i+1);
			subSet[i] = arr[i];
			subSet(arr,subSet,i+1);
		}
	}

	private static void print(int[] subSet) {
		for(Integer val : subSet){
			if(val > 0)
			System.out.print(val+",");
		}
		System.out.println();
		
	}

}
