import java.util.Scanner;

public class CalculatorScanner {
	public static void main(String[] args) {
		double x;
		double y;

		// user will enter + ,- ,* or / for char variable

		Scanner calc = new Scanner(System.in);
		System.out.println("Enter Input for x ");
		x = calc.nextDouble();

		/*
		 * while(!calc.hasNextDouble()) { System.out.println("Wrong!...try a number ");
		 * calc.next(); }
		 */

		System.out.println("Enter input for y");
		y = calc.nextDouble();

		/*
		 * while (!calc.hasNextDouble()) {
		 * System.out.println("Wrong !... Try a number !"); calc.next(); }
		 */

		System.out.println("Enter operator + , - or /, *");
		char op = calc.next().charAt(0);

		CalculatorFunctions c = new CalculatorFunctions();
		double result;
		if (op == '+') {
			result = c.add(x, y);
			System.out.println( "Adding .. " + result);
		}
		else if (op== '-') {
			result = c.subtract(x, y);
			System.out.println("Subtracting.. " + result);
		}
		else if (op == '*') {
			result = c.multiply(x, y);
			System.out.println("multiplying .. "+result);
			}
		else if (op =='/') {
			result = c.divide(x, y);
			System.out.println("dividing..." +result);
		}
		calc.close();

		/*
		 * System.out.println("please enter your operation + - / or *"); Scanner
		 * operation = new Scanner(System.in) String op = operation.next(); if
		 * (op.equals("+")) { System.out.println("adding.. " + (w + x)); } if
		 * (op.equals("-")) { System.out.println("subtracting..." + (w - x)); } else if
		 * (op.equals("/")) { System.out.println("dividing .. " + (w / x)); } if
		 * (op.equals("*")) { System.out.println("multiply ... like bunnies!" + (w *
		 * x));
		 */

	}
}

