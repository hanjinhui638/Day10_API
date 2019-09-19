package com.jh.t1;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		//주민등록 번호입력 991222-1234567
		//    9  7 1 2  2  2  1  2 3  4  5  6  7 (검증용번호)
		//1. *2  3 4 5  6  7  8  9 2  3  4  5 
		//2. 18+21+4+10+12+14+8+18+6+12+20+30=179
		//3.  179 / 11 --몫16 나머지 3 

		//4. 11 - 3(나머지) -- 8(결과값)
		//4_1. 결과값이 두자리라면 
		//     결과값/10 ----나머지 결과값으로 
		//5. 결과값 == 검증용번호 

		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 입력 ");
		String jumin = sc.next();
		
	
		for(int i=0;i<jumin.length();i++){
			char ch = jumin.charAt(i);
			System.out.println(ch);
			String str2= new String
			String a3 = ch.tostring
			
			int a2 =Integer.valueOf(ch);
			System.out.println(a2);
		
			
		}
	
		
		
		
		
		
		
		//for(int j=2;j<10;j++) {
			
	//	}




	}

}
