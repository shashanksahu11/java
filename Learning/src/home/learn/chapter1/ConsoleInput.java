package home.learn.chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConsoleInput {

	public static void main(String[] args) throws IOException {
		readConsoleUsingConsoleClass();
		readConsoleUsingBufferedReader();
		readConsoleUsingScannerIn();
	}

	private static void readConsoleUsingBufferedReader() throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String data = bufferedReader.readLine();
		System.out.println("Hello " + data);
	}

	private static void readConsoleUsingScannerIn() {
		Scanner input = new Scanner(System.in);

		String stringInput = input.nextLine();
		System.out.println("You entered string " + stringInput);

		int integerInput = input.nextInt();
		System.out.println("You entered integer " + integerInput);

		float floatInput = input.nextFloat();
		System.out.println("You entered float " + floatInput);

		input.close();
	}

	private static void readConsoleUsingConsoleClass() {
		String input = System.console().readLine(); // this will give null pointer exception in IDE
		System.out.println("Your name is " + input);
	}

}
