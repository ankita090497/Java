package com.pattern;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		System.out.println("Print the square using * ");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number : " );
		int n = scanner.nextInt();
		int i,j;
		
		for(i=1; i<=n; i++) {
			for(j=1; j<=n; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
