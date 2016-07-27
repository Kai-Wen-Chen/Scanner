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
		//nextInt()會讀取輸入的下一個int
		//nextLine()會將下一行的資料(並非由輸入獲得，而是如讀檔)並轉成String
		//next()會讀取下一個String
	}
}
