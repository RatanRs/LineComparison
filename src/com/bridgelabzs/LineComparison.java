package com.bridgelabzs;

import java.util.Scanner;

/***
 * 
 * @author Admin
 *
 */
public class LineComparison {
	/***
	 * 
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @return
	 */

	static int calculateLength(int x1, int y1, int x2, int y2) {
		int length = (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		return length;
	}

	void equals(int length1, int length2) {
		if (length1 == length2) {
			System.out.println("Both lines are equal");
		} else {
			System.out.println("Both lines are not equal");
		}
	}

	void compareTo(int length1, int length2) {
		if (length1 == length2) {
			System.out.println("Line1 is equal to Line2");
		} else if (length1 > length2) {
			System.out.println("Line1 is greater then Line2");
		} else {
			System.out.println("Line1 is less then Line2");
		}
	}

	public static void main(String[] args) {
		LineComparison method1 = new LineComparison();
		LineComparison method2 = new LineComparison();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the X coordinates of the line1 ");
		int x1 = input.nextInt();
		int x2 = input.nextInt();
		System.out.print("Enter the Y coordinates  of the line1 ");
		int y1 = input.nextInt();
		int y2 = input.nextInt();
		System.out.print("Enter the X coordinates of the line2 ");
		int x3 = input.nextInt();
		int x4 = input.nextInt();
		System.out.print("Enter the Y coordinates  of the line2 ");
		int y3 = input.nextInt();
		int y4 = input.nextInt();
		int result1 = calculateLength(x1, y1, x2, y2);
		int result2 = calculateLength(x3, y3, x4, y4);
		System.out.println("Length of line1 is " + result1);
		System.out.println("Length of line2 is " + result2);
		method1.equals(result1, result2);
		method2.compareTo(result1, result2);
	}
}
