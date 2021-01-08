import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		/*
		 * 동빈이의 큰 수의 법칙 다양한 수로 이루어진 배열이 있을 때 주어진 수들을 M번 더하여 가장 큰 수를 만드는 법칙이다. 단, 배열의 특정한
		 * 인덱스 (번호)에 해당하는 수가 연속해서 K번을 초과하여 더해질 수 없는 것이 이 법칙의 특징이다.
		 * 
		 * 배열의 크기 N. 숫자가 더해지는 횟수 M, 그리고 K가 주어질 때 동빈이의 큰 수의 법칙에 따른 결과를 출력하시오.
		 */

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);

		int first = arr[n - 1];
		int second = arr[n - 2];

		// 가장 큰 수가 더해지는 횟수
		int count2 = m / k;
		int count1 = m - count2;

		// 두번째로 큰 수가 더해지는 횟수

		int sum = first * count1 + second * count2;

		System.out.println(sum);

		sc.close();

	}

}
