package com.pattern;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		System.out.println("Print number in reverse order pattern : ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number :- ");
		int n = sc.nextInt();
		for(int i=n;i>=1;i--){
			System.out.print(i+" ");
			
		}
	}

}