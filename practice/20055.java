import java.util.*;
public class Main {
	
	static int n,k;
	static int[] con;
	static int count;
	static boolean robot[];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		count = 0;
		n = sc.nextInt();
		k = sc.nextInt();
		con = new int[2 * n];
		robot = new boolean[n];
		
		for(int i = 0; i < con.length; i++) {
			con[i] = sc.nextInt();
		}
		Main a = new Main();
		System.out.println(a.solve(count));
	}
	
	public int solve(int count) {
		int check = 0;
		while(check < k) {
			count++;
			check = 0;
			int num = con[con.length-1];
			for(int i = con.length-1; i > 0; i--) {
				con[i] = con[i-1];
			}
			con[0] = num;
			
			for(int j = n-1; j > 0; j--) {
				robot[j] = robot[j-1];
				if(robot[j] == true && j == (n-1)) {
					robot[j] = false;
				}else if(robot[j] == true && robot[j+1] == false && con[j+1] >0) {
					con[j+1] -= 1;
					robot[j+1] = true;
					robot[j] = false;
				}
			}
			robot[0] = false;

			if(con[0] > 0 ) {
				robot[0] = true;
				con[0]-= 1;
			}
			
			for(int i = 0; i < con.length; i++) {
				if(con[i] == 0) 
					check++;
			}
		}
		return count;
	}	
}
