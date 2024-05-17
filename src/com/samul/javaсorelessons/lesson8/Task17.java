package com.samul.javaсorelessons.lesson8;

import java.util.Random;

/*17. Дана последовательность целых чисел

n a ,a , ,a 1 2 

. Образовать новую последовательность, выбросив из исходной

те члены, которые равны

min( , , , )
1 2 n a a  a .*/

public class Task17 {

	public static void main(String[] args) {
		int[] a = new int[30];

		initArr(a);
		printArr("Исходный массив:", a);
		
		a = solution(a);

		printArr("\nГотовый массив:", a);
	}
	
	static void initArr(int[] param) {
		Random rnd = new Random();

		for (int i = 0; i < param.length; i++) {
			param[i] = rnd.nextInt(10);
		}

	}

	static void printArr(String message, int[] param) {
		System.out.print(message + " ");
		for (int i = 0; i < param.length; i++) {
			System.out.print(param[i] + " ");
		}

	}
	
	static int[] solution(int[] param) {
		int[] res;
		int min;
		int count = 0;
		
		min = findMin(param);
		
		for (int i = 0; i < param.length; i++) {
			if (param[i] != min) {
				count++;
			}
		}
		
		res = new int[count];
		
		int j = 0;
		

		for (int i = 0; i < param.length; i++) {
			if (param[i] != min) {
				res[j] = param[i];
				j++;
			}
		}
		
		return res;

	}
	
	static int findMin(int[] param) {
		int res;
		
		res = param[0];
		
		for (int i = 0; i < param.length; i++) {
			if (param[i] < res) {
				res = param[i];
			}
		}
		
		return res;

	}
	

}
