package com.samul.javaсorelessons.lesson8;

import java.util.Random;

/*12. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых являются
простыми числами.*/

public class Task12 {

	public static void main(String[] args) {
		double[] a = new double[30];
		double sum;

		initArr(a);
		printArr("Исходный массив: ", a);
		sum = solution(a);
		
		System.out.println("\nСумма = " + sum);
		
		

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
	
	static double solution(double[] param) {
		double res = 0;
		
		for (int i = 2; i < param.length; i++) {// i = 2, т.к. 0 и 1 не явл простыми числами
			if (isSimple(i)) {
				res += param[i];
			}
		}
		
		return res;

	}
	
	static boolean isSimple(int index) {
		boolean res = true;
		
		for (int i = 2; i < index; i++) {
			if (index % i == 0) {
				res = false;
			}
		}
		
		return res;
	}
	
	
}
