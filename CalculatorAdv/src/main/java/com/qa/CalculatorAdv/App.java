package com.qa.CalculatorAdv;

public class App {
	public static void main(String[] args) {
		int number1 = 15;
		int number2 = 4;
		char function ='-';
		//System.out.println(calcAdd(number1, number2));
		//System.out.println(calcMin(number1, number2));
		//System.out.println(calcMult(number1, number2));
		//System.out.println(calcDiv(number1, number2));
		System.out.println(calc(number1, number2, function));

	}

	public static int calc(int number1, int number2, char function) {
		if (function==('+')) {
			return calcAdd(number1, number2);
		} else if (function==('-')) {
			return calcMin(number1, number2);
		} else if (function==('*')) {
			return calcMult(number1, number2);
		} else if (function==('/')) {
			return calcDiv(number1, number2);

		} else {
			System.out.println("Function incorrect");
			return  ('0');
		}
	}

	public static int calcAdd(int number1, int number2) {
		int num1 = number1;
		int num2 = number2;
		return num1 + num2;

	}

	public static int calcMin(int number1, int number2) {
		int num1 = number1;
		int num2 = number2;
		return num1 - num2;
	}

	public static int calcMult(int number1, int number2) {
		int num1 = number1;
		int num2 = number2;
		return num1 * num2;
	}

	public static int calcDiv(int number1, int number2) {
		int num1 = number1;
		int num2 = number2;
		return num1 / num2;
	}
}
