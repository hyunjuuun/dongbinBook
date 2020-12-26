import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		/*
		 *	거스름돈 N원을 500, 100, 50, 10원을 이용하여 거슬러 줄 때, 동전의 최소 개수는?
		 */

		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int count = 0;
		int money[] = {500, 100, 50, 10};
		
		for (int i=0; i<4; i++) {
			count += n/money[i];
			n %= money[i];
		}
		
		System.out.println(count);
		
		kb.close();
		
	}

}
