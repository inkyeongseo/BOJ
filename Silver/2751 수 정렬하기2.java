import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < num; i++) {
			list.add(sc.nextInt());
		}
		
        //시간제한 정렬이 필요할 때 Arrays.sort보다 Collections.sort가 빠름
		Collections.sort(list);
		
        //출력도 list.get(i)보다 stringbuilder 이용이 더 빠름
		for(int a : list) {
			sb.append(a).append("\n");
		}
		
		System.out.println(sb);
		
	}	
}