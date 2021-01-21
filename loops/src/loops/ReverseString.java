package loops;

import java.util.Scanner;
public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string ");
		String str = sc.next();
		String rvrstr = " ";
		for (int i = str.length() - 1; i >= 0; i--) {
			rvrstr = rvrstr + str.charAt(i);

		}

		System.out.println("original string is " + str);
		System.out.println("reverse string is " + rvrstr);

	}
}
