package com.samul.javaсorelessons.lesson8;

import java.util.Random;

/*15. Дана последовательность действительных чисел
a a an
, , , 1 2 
. Указать те ее элементы, которые принадлежат отрезку

[с, d].*/

public class Task15 {

	public static void main(String[] args) {
		double[] a = new double[30];
		double c = 30, d = 45;

		initArr(a);
		printArr("Исходный массив: ", a);
		solution(a, c, d);

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
	
	static void solution(double[] param, double c, double d) {
		System.out.print("\nРезультат: ");
		
		for (int i = 0; i < param.length; i++) {
			if (param[i] >= c && param[i] <= d) {
				System.out.printf("[%.2f] ", param[i]);
			}
		}
		
	}
	

}
