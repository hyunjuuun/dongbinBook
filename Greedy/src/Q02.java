import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		int n = s.length();
		
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = s.charAt(i) - '0';
		}
		
		int result = 0;
		
		int firstIndex=0;
		int firstNum = 0;
		
		for(int i=0; i<n; i++) {
			if (arr[i] != 0) {
				firstIndex = i;
				firstNum = arr[i];
				break;
			}
		}
		
		if (firstNum == 0) {
			System.out.println(0);
		}
		else {
			result = firstNum;
			for(int i=firstIndex+1; i<n; i++) {
				if (arr[i] != 0)
					result *= arr[i];
			}
		}
		
		System.out.println(result);

		sc.close();

	}

}
