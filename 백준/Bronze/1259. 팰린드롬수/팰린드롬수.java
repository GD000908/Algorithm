import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String N = sc.next();
			if(N.equals("0")) System.exit(0);
			
			String[] arr = new String[N.length()];
			String[] arr2 = new String[N.length()];
			
			for(int i=0;i<N.length();i++) arr[i] = N.substring(i,i+1);
			
			//배열 reverse
			for(int i=0;i<N.length();i++) {
				arr2[i] = arr[N.length()-1-i];
			}
			
			int count = 0;
			//문자가 같으면 count ++
			for(int i=0;i<N.length();i++) {
				if(arr[i].equals(arr2[i])) count++;
			}
			
			//count가 같다면 yes, 다르면 no 출력
			if(count==N.length()) System.out.println("yes");
			else System.out.println("no");
			
		}
	}
}