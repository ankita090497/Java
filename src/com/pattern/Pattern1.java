package com.pattern;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		System.out.println("Simple number pattern");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++){
			System.out.print(i+" ");
		}

	}

}