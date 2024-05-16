package com.samul.javaсorelessons.lesson8;

import java.util.Random;

/*8. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
положительных и нулевых элементов.*/

public class Task8 {

	public static void main(String[] args) {
		double[] a = new double[30];
		int countZero = 0, countNeg = 0, countPos = 0;

		initArr(a);
		printArr("Исходный массив: ", a);

		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				countPos++;
			} else if (a[i] < 0) {
				countNeg++;
			} else {
				countZero++;
			}
		}

		System.out.println("\nPositive = " + countPos + "\nNegative = " + countNeg + "\nZeroes = " + countZero);

	}

	static void initArr(double[] param) {
		Random rnd = new Random();

		for (int i = 0; i < param.length; i++) {
			param[i] = rnd.nextDouble(100) - 50;
		}
		
		param[5] = param[10] = 0;

	}

	static void printArr(String message, double[] param) {
		System.out.print(message + " ");
		for (int i = 0; i < param.length; i++) {
			System.out.printf("[%.2f] ", param[i]);

		}

	}

}
