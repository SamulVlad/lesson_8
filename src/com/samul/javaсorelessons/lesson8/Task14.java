package com.samul.javaсorelessons.lesson8;

import java.util.Random;

//14. Дан одномерный массив A[N]. Найти: max( , , , ) min( , , , ) a2 a4  a2k + a1 a3  a2k +1

public class Task14 {

	public static void main(String[] args) {
		int[] a = new int[30];
		int max, min;
		int sum;

		initArr(a);
		printArr("Исходный массив:", a);
		
		min = findMin(a);
		max = findMax(a);
		sum = min + max;
		
		System.out.print("\nMin = " + min);
		System.out.print("\nMax = " + max);
		System.out.print("\nSum = " + sum);

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
	
	static int findMin(int[] param) {
		int res;
		
		res = param[0];
		
		for (int i = 2; i < param.length; i = i + 2) {
			if (param[i] < res) {
				res = param[i];
			}
		}
		
		return res;

	}

	static int findMax(int[] param) {
		int res;
		
		res = param[1];
		
		for (int i = 3; i < param.length; i = i + 2) {
			if (param[i] > res) {
				res = param[i];
			}
		}
		
		return res;

	}
	

}
