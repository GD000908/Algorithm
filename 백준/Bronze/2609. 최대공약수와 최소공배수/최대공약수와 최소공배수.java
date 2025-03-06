

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//최대공약수 
		
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		

		for(int i=a; i>0; i--) {


			if(a%i==0 && b%i==0) {
				System.out.println(i);
				break;
				
			}

			
		}
		
		for(int i=1; i<=a*b; i++) {


			if(i%a==0 && i%b==0) {
				System.out.println(i);
				break;
			}

			
		}
		
		sc.close();

	}

}
