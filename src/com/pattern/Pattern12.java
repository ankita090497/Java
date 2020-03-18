package com.pattern;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number ");
		int n = scanner.nextInt();
		int i,j;
		
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println("");
		}
	}

}
