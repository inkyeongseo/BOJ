import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); 
		
		Queue<Integer> q = new LinkedList<>();
		for(int i = 1; i <= num; i++) {
			q.offer(i);
		}
		
		while(q.size() > 1) {
			q.poll(); // 하나 빼서 버리기
			
			int back = q.poll();
			q.offer(back);
			
		}
		
		System.out.println(q.poll());
	}
}