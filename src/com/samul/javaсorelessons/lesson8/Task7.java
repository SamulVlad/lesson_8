package com.samul.javaсorelessons.lesson8;

import java.util.Random;

/*7. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим числом.
Подсчитать количество замен.
*/
public class Task7 {

	public static void main(String[] args) {
		double[] a = new double[30];
		double z = 77.77;
		int count = 0;

		initArr(a);
		printArr("Исходный массив: ", a);

		for (int i = 0; i < a.length; i++) {
			if (a[i] > z) {
				a[i] = z;
				count++;
			}
		}
		printArr("\nГотовый массив: ", a);
		System.out.println("\nКол = " + count);

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
}
