package com.learn.binary;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

	public static void main(String[] args) {
		String str = "(((((((((((((((((((((((((((((((((((((((((((((((((((((((((((())))))())))))))))))))))))))))))))))))))(())";
		int count = superBalancedCount(str);
		System.out.println(count);
		/*Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		while(testCases>0){
	    String str = scan.nextLine();
		int count = superBalancedCount(str);
		System.out.println(count);
		testCases--;
		}*/
	}

	private static int superBalancedCount(String str) {
		int mid = str.length() / 2;
		int openCount = 0;
		int closeCount = 0;
		for (int i = 0; i < mid; i++) {
			if (str.charAt(i) == '(') {
				openCount++;
			} else {
				closeCount++;
			}
		}
		int remainingCloseCount = str.length()/2 - closeCount;
		int diff = openCount-remainingCloseCount;
		if (diff >= 0) {
			return 2 * (openCount-diff);
		}
		return 0;
	}

}
