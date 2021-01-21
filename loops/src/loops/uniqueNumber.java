package loops;

public class uniqueNumber {
	public static void countdigidts(int N) {
		int res = 0;
		int cnt[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		while (N > 0) {
			int rem = N % 10;
			cnt[rem]++;
			N = N / 10;

		}
		for (int i = 0; i <= cnt.length; i++) {
			if (cnt[i] == 1) {
				res++;

			}
		}
		System.out.println(res);
	}

	public static void main(String[] args) {
		int N = 234262;
		countdigidts(N);
	}

}
