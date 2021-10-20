import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("값을 입력하세요");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int b = sc.nextInt();
		int c = sc.nextInt();
		long count = 0;
		for(int j = 0; j < n; j++) {
			count++;
			arr[j] -= b;
			
			if(arr[j] <= 0) {
				continue;
			}else {
				count += arr[j] / c;
				if(arr[j] % c !=0) {
					count++;
				}
			}
		}
		
		System.out.println(count);
	}
}
