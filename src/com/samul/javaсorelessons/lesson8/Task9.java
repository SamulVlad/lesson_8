package com.samul.javaсorelessons.lesson8;

import java.util.Random;

//9. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.

public class Task9 {

	public static void main(String[] args) {
		double[] a = new double[30];
		double min, max;
		int minInd = 0, maxInd = 0;

		initArr(a);
		printArr("Исходный массив: ", a);

		min = a[0];
		max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
				minInd = i;
			}

			if (a[i] > max) {
				max = a[i];
				maxInd = i;
			}

		}

		double tempDbl;

		tempDbl = a[minInd];
		a[minInd] = a[maxInd];
		a[maxInd] = tempDbl;

		printArr("\nГотовый массив: ", a);

	
	}

	static void initArr(double[] param) {
		Random rnd = new Random();

		for (int i = 0; i < param.length; i++) {
			param[i] = rnd.nextDouble(100) - 50;
		}

	}

	static void printArr(String message, double[] param) {
		System.out.print(message + " ");
		for (int i = 0; i < param.length; i++) {
			System.out.printf("[%.2f] ", param[i]);

		}

	}

}
