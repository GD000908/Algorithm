
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int T = s.nextInt();
		
		for(int i=0; i<T; i++)
		{
			int x = s.nextInt();
			System.out.println(fib(x));
		}
		
	}

	public static long fib(int n) {

		long[] f = new long[101];		
		f[1]=1;
		f[2]=1;	
		f[3]=1;
		if (n > 0) {
			for (int i = 3; i <= n; i++) {
				f[i] = f[i - 2] + f[i - 3];
			}

		}
		return f[n];

	}
}
