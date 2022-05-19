import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] nums = new String[2];
		for(int i = 0; i < 2; i++) {
			nums[i] = sc.next();
		}
		
		for(int i = 0;i < nums.length; i++) {
			String target = nums[i];
			StringBuilder sb = new StringBuilder();
			for(int j = target.length()-1; j >= 0; j--) {
				sb.append(target.charAt(j));
			}
			nums[i] = sb.toString();
		}
		
		int max = Math.max(Integer.parseInt(nums[0]), Integer.parseInt(nums[1]));
		System.out.println(max);
	}
	
}
