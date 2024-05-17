package com.samul.javaсorelessons.lesson8;

import java.util.Random;

//11. Даны натуральные числа а1 ,а2 ,..., аn . Указать те из них, у которых остаток от деления на М равен L (0 < L < М-1).

public class Task11 {

	public static void main(String[] args) {
		int[] a = new int[30];
		int m = 3, l = 1;

		initArr(a);
		printArr("Исходный массив:", a);
		solution(a, m, l);

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
	
	static void solution(int[] param, int m, int l) {
		System.out.print("\nРезультат: ");

		for (int i = 0; i < param.length; i++) {
			if (param[i] % m == l) {
				System.out.print(param[i] + " ");
			}
		}

	}
	

}
