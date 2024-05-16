package com.samul.javaсorelessons.lesson8;

/*5. Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из четных чисел этой последовательности.
Если таких чисел нет, то вывести сообщение об этом факте.
*/
public class Task5 {

	public static void main(String[] args) {
		double[] a = new double[] {1, 4, 5, 6, 7, 8, 9, 16,  24, 33};
		int count = 0;
		
		printArr("Исходный массив: ", a);

		for (int i = 0; i < a.length; i++) {
			if(a[i] % 2 == 0) {
				count++;
			}
		}
		
		if (count == 0) {
			System.out.println("Четных чисел в массиве нет!");
			return;
		}
		
		double[] oddNum = new double[count];
		int q = 0; 
		
		for (int i = 0; i < a.length; i++) {
			if(a[i] % 2 == 0) {
				oddNum[q] = a[i];
				q++;
			}
		}
		
		printArr("\nМассив четных чисел: ", oddNum);
	}
	
	static void printArr(String message, double[] param) {
		System.out.print(message + " ");
		for (int i = 0; i < param.length; i++) {
			System.out.print(param[i] + " ");
			
		}
	}

}
