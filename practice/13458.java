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
		int b = sc.nextInt(); //총감독관
		int c = sc.nextInt(); //부감독관
		long count = 0; // 시험장의 수 * 응시자 수를 하면 1조 이상인 경우가 있으므로 long 타입
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
