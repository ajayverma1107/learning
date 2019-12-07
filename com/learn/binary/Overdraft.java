package com.learn.binary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Overdraft {
	
	public static void main(String[] args) throws IOException{
		
		InputStreamReader inputStreamReader = new InputStreamReader(System.in,StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(inputStreamReader);
		List<Double> elementsList = new ArrayList<Double>();
	    Double negativeSum = 0D;
	    Double positiveSum = 0D;
		String line;
		boolean firstLoop = true;
		while(!(line= in.readLine()).equals("")){
			Double input = Double.valueOf(line);
			if(input>=0){
				positiveSum+=input;
			}else{
				//Exlcuding as this could be the balance.
				if(!firstLoop){
				elementsList.add(input);
				}
				negativeSum+=input;
			}
			firstLoop = false;
		}
		Collections.sort(elementsList);
		
		int count = 0;
		double diff = negativeSum+positiveSum;
		for(int i=0;i<elementsList.size();i++){
			if(diff>=0){
				break;
			}
			count++;
			diff = diff-elementsList.get(i);
		}
		System.out.println(count);
	}
	

}
