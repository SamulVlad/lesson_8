package com.samul.javaсorelessons.lesson8;

import java.util.Random;

//10. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

public class Task10 {

	public static void main(String[] args) {
		int[] a = new int[30];

		initArr(a);
		printArr("Исходный массив: ", a);
		solution(a);

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
	
	static void solution(int[] param) {
		System.out.print("\nРезультат: ");

		for (int i = 0; i < param.length; i++) {
			if (param[i] > i) {
				System.out.print(param[i] + " ");
			}
		}

	}

}
