import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); // 숫자 개수
		int count = sc.nextInt(); // 계산한 횟수
		
		int[] nums = new int[num+1];
		nums[0] = 0;
		for(int i = 1; i <= num; i++) {
			nums[i] = nums[i-1] + sc.nextInt();
		}
		
		for(int i = 0; i < count; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			
			System.out.println(nums[end]-nums[start-1]);
		}
	}	
}
