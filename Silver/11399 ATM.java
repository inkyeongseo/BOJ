import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int[] nums = new int[len];
		
		for(int i = 0; i < len; i++) {
			nums[i] = sc.nextInt();
		}
		
		Arrays.sort(nums);
		//12334
		int sum = 0;
		int total = 0;
		for(int j = 0; j < nums.length; j++) {
			total += nums[j];
			sum += total;
		}
		System.out.println(sum);
	}
}