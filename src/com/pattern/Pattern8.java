package com.pattern;

import java.util.Scanner;

public class Pattern8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number ");
		int n = scanner.nextInt();
		int i,j;
		for(i=n;i>=1;i--) {
			
			for(j=i;j<n;j++) {
				System.out.print("  ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}
