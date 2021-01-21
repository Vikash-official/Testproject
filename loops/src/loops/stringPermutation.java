package loops;

import java.util.Arrays;
import java.util.Scanner;

public class stringPermutation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		String t = sc.nextLine();
		if (s.length() != t.length()) {
			System.out.println("no");
			return;
		}

		char[] first = s.toCharArray();
		Arrays.sort(first);
		s = new String(first);

		char[] sec = t.toCharArray();
		Arrays.sort(sec);
		t = new String(sec);

		if (s.equals(t)) {
			System.out.println("yes");

		} else {
			System.out.println("no");
		}

	}

}
