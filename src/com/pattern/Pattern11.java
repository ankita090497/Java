package com.pattern;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number ");
		int n = scanner.nextInt();
		int i,j;
		
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println("");
		}
		
	}

}
