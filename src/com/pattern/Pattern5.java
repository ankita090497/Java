package com.pattern;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		System.out.println("print one sided triangle");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = scanner.nextInt();
		int i,j;
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println(""); 
		}

	}

}
