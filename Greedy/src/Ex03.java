import java.util.*;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int result = 0;
		
		for(int i=0; i<n; i++) {
			int min = 10001;
			for (int j=0; j<m; j++) {
				min = Math.min(min, sc.nextInt());
			}
			result = Math.max(min, result);
		}
		
		System.out.println(result);
		
		sc.close();
		
		
	}

}
