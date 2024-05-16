package com.samul.javaсorelessons.lesson8;

import java.util.Random;

//6. Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину числовой оси, содержащую все эти числа.

public class Task6 {

	public static void main(String[] args) {
		int[] a = new int[30];
		int min, max;

		initArr(a);
		printArr("Array: ", a);
		
		min = a[0];
		max = a[0];

		for (int i = 1; i < a.length; i++) {
			min = a[i] < min ? a[i] : min;
			max = a[i] > max ? a[i] : max;

		}
		
		System.out.println("\nОтрезок: [" + min + ", " + max + "]");
	}


	static void initArr(int[] param) {
		Random rnd = new Random();

		for (int i = 0; i < param.length; i++) {
			param[i] = rnd.nextInt(100);
		}

	}

	static void printArr(String message, int[] param) {
		System.out.print(message + " ");
		for (int i = 0; i < param.length; i++) {
			System.out.print(param[i] + " ");

		}

	}
}
