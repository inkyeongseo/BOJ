import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); // 숫자 개수
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < num; i++) {
			String word = sc.next();
			Stack<String> stack = new Stack<>();
			int ch = 0;
			for(int j = 0; j < word.length(); j++) {
				char c = word.charAt(j);
				if(c == '(') {
					stack.push("(");
				}else {
					if(stack.size() > 0) {
						stack.pop();
					}else {
						ch = -1;
						break;
					}
				}
			}
			
			if(ch == -1 || stack.size() > 0) {
				sb.append("NO").append("\n");
			}else {
				sb.append("YES").append("\n");
			}
		}
		
		System.out.println(sb);
	}	
}