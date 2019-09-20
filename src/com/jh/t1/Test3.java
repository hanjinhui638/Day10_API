package com.jh.t1;

public class Test3 {

	public static void main(String[] args) {
		double d = Math.ceil(3.22); //올림 
		System.out.println(d);
		d=6.72;
		d = Math.floor(d);
		System.out.println(d);//내림 
		d=6.48;
		d=Math.round(d);
		System.out.println(d); //반올림 소수점 첫쨰자리 
		
		d = Math.random();
		
		System.out.println((int)(d*10));
		//0 ~9 
	}

}
