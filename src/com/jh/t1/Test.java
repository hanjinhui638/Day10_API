package com.jh.t1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//스캐너를 사용..
		//주민등록번호 입력 991122-1234567 

		//나이 
		//계절 
		//성별 

		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호 입력 ");
		String num = sc.next();

		String a = num.substring(0,2);
		int year = 1900+ Integer.parseInt(a);
		System.out.println(2019 - year);

		a = num.substring(2,4);
		year = Integer.parseInt(a);
		if(year>=3 && year<=5) {
			System.out.println("봄");
		}else if(year>=6 && year<=8) {
			System.out.println("여름");
		}else if(year>=9 && year<=11) {
			System.out.println("가을");
		}else {
			System.out.println("겨울");
		}

		//a = num.substring(7,8);a.equals("1")
		//char ch = num.charAt(7);ch =='1' || ch == '3'
		
		a = num.substring(7,8);
		year = Integer.parseInt(a);
		if(year%2 == 1) {
			System.out.println("남자");
		}else 
			System.out.println("여자");
		}

		//if(b1>=03 && b1<=05){
		//	System.out.println("봄");
		//}else if(b1>=06 && b1<=08){
		//	System.out.println("여름");
		//}



	}


