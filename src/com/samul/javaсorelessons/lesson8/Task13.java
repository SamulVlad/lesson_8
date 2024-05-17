package com.samul.javaсorelessons.lesson8;

import java.util.Random;

/*13. Определить количество элементов последовательности натуральных чисел, кратных числу М и заключенных в
промежутке от L до N.*/

public class Task13 {

	public static void main(String[] args) {
		int[] a = new int[30];
		int m = 3;
		int l = 1, n = 50;
		int num;

		initArr(a);
		printArr("Исходный массив:", a);
		num = solution(a, m, l, n);
		
		System.out.println("\nКоличество элементов = " + num);


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
	
	static int solution(int[] param, int m, int l, int n) {
		int res = 0;
		
		for (int i = 0; i < param.length; i++) {
			if ((param[i] % m == 0) && (param[i] >= l) && (param[i] <= n)) {
				res++;
			}
		}
		
		return res;

	}

}
