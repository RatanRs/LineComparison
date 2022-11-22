package com.bridgelabzs;

import java.util.Scanner;

public class LineComparison {

	public static void main(String args[]) {
		Scanner object = new Scanner(System.in);
		System.out.println("Enter the Co-ordinates of X");
		int x1 = object.nextInt();
		int x2 = object.nextInt();
		System.out.println("enter the co-ordinates of Y");
		int y1 = object.nextInt();
		int y2 = object.nextInt();
		int length = (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.println("Length of Line = " + length);
	}
}