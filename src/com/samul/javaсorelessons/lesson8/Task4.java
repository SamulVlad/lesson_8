package com.samul.javaсorelessons.lesson8;

//4. Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли она возрастающей.

public class Task4 {

	public static void main(String[] args) {
		double[] a = new double[] { 1, 2, 3, 5, 7, 12, 17, 20 };
		boolean incrFlag = true;

		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] >= a[i + 1]) {
				incrFlag = false;
				break;
			}
		}

		System.out.println("Последовательность " + (!incrFlag ? "не " : "") + "является возрастающей");

	}

}
