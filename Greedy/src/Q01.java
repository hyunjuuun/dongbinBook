import java.util.*;

public class Q01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		Arrays.sort(arr);

		int cap;
		int num = 0;
		int result = 0;

		for (int i = 0; i < n; i++) {
			cap = arr[i];
			while (num < cap) {
				num++;
				i++;
			}
			if (i >= n)
				break;
			result++;
		}

		System.out.println(result);

		sc.close();

	}

}