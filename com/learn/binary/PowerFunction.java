package com.learn.binary;

import java.math.BigInteger;

public class PowerFunction {

	public static void main(String[] args) {
		PowerFunction pf = new PowerFunction();
		System.out.println(pf.pow(71045970,41535484,64735492));
		//.out.println(Math.pow(25, 120));
		//System.out.println(Math.pow(25,120)%11);
	}

	public int pow(int x, int n, int d) {
		int result = 1;
		if(x%d == 0){
		   result = 0;
		}else if(n==1){
			result = x%d;
		}else{
		long out = 1l;
		long a = x;
		while(n>0){
			if(n % 2==1){
				out*=a;
				out%=d;
			}
			a*=a;
			a%=d;
			n = n>>1;
		}
		result = (int)out;
		}
		return result;
		
	}
}
