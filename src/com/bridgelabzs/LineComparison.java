package com.bridgelabzs;

import java.util.Scanner;

public class LineComparison {

	static int calculateLength(int x1, int y1, int x2, int y2) {
		int length = (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		return length;
	}

	static void equals(int length1, int length2) {
		if (length1 == length2) {
			System.out.println("Both lines are equal");
		} else {
			System.out.println("Both lines are not equal");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the X coordinates of the line1 ");
		int x1 = sc.nextInt();
		int x2 = sc.nextInt();
		System.out.print("Enter the Y coordinates  of the line1 ");
		int y1 = sc.nextInt();
		int y2 = sc.nextInt();
		System.out.print("Enter the X coordinates of the line2 ");
		int x3 = sc.nextInt();
		int x4 = sc.nextInt();
		System.out.print("Enter the Y coordinates  of the line2 ");
		int y3 = sc.nextInt();
		int y4 = sc.nextInt();

		int result1 = calculateLength(x1, y1, x2, y2);
		int result2 = calculateLength(x3, y3, x4, y4);
		System.out.println("Length of line1 is " + result1);
		System.out.println("Length of line2 is " + result2);
		equals(result1, result2);
	}
}