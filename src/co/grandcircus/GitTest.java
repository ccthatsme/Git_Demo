package co.grandcircus;

import java.util.Scanner;

public class GitTest {

	public static void main(String[] args) {
		System.out.println("hello world");

		int age = 21;
		System.out.println(age);

		Scanner scan = new Scanner(System.in);
		System.out.println("what is your name?");
		String name = scan.nextLine();

		System.out.println("Hello, " + name);

		scan.close();

	}

}
