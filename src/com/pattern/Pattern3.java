package com.pattern;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		System.out.println("Print * in horizontal line ");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = scanner.nextInt();
		for(int i =1; i<=n;i++) {
			System.out.print("* ");
		}
	}

}
