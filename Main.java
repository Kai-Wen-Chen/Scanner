package scanner;

import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		double num = sc.nextDouble();
		System.out.println("You enter a " + num);
		System.out.println("Please enter a string");
		String str = sc.next();
		System.out.println("You enter a string of " + str);
		sc.close();
		//nextInt()�|Ū����J���U�@��int
		//nextLine()�|�N�U�@�檺���(�ëD�ѿ�J��o�A�ӬO�pŪ��)���নString
		//next()�|Ū���U�@��String
	}
}
