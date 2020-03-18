package com.pattern;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n = scanner.nextInt();
		int i,j;
		for(i=1;i<=n;i++) {
			for(j=i;j<n;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		

	}

}

/*for( i=0; i<n; i++) {
	for( j=n-i; j>1; j--) {
		
		System.out.print(" "); // other solution
	}
	for( j=0; j<=i; j++) {
		System.out.print("* ");
	}
	System.out.println("");
}*/