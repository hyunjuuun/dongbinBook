import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		int count0 = 0; // 모두 0으로 바꾸는 경우
		int count1 = 0; // 모두 1로 바꾸는 경우

		if (str.charAt(0) == '0')
			count0++;
		else
			count1++;

		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) != str.charAt(i + 1)) {
				if (str.charAt(i + 1) == '0')
					count0++;
				else
					count1++;
			}
		}

		System.out.println(Math.min(count0, count1));

		sc.close();

	}

}
