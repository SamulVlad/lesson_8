package com.samul.javaсorelessons.lesson8;

import java.util.Random;

/*16. Даны действительные числа a1, a2, ... , a2n. Найти

max( , , , ) a1 + a2n a2 + a2n−1  an + an+1
.*/

public class Task16 {

	public static void main(String[] args) {
		double[] a = new double[30];
		double max;

		initArr(a);
		printArr("Исходный массив: ", a);
		max = findMax(a);
		
		System.out.println("\nMax = " + max);

	}

	static void initArr(double[] param) {
		Random rnd = new Random();

		for (int i = 0; i < param.length; i++) {
			param[i] = rnd.nextDouble(100);
		}

	}

	static void printArr(String message, double[] param) {
		System.out.print(message + " ");
		for (int i = 0; i < param.length; i++) {
			System.out.printf("[%.2f] ", param[i]);
		}

	}

	static double findMax(double[] param) {
		double max;

		max = param[0] + param[param.length - 1];

		for (int i = 1; i < param.length; i++) {
			double sum = param[i] + param[param.length - i];
			if (sum > max) {
				max = sum;
			}
		}

		return max;

	}

}
