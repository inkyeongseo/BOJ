import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		
		Stack<Integer> stack = new Stack<>();
		for(int i = 0; i < len; i++) {
			int num = sc.nextInt();
			if(num == 0) {
				stack.pop();
			}else {
				stack.push(num);
			}
		}
		
		int sum = 0;
		int size = stack.size();
		for(int j = 0; j < size; j++) {
			sum += stack.pop();;
		}
		
		System.out.println(sum);
	}

}
