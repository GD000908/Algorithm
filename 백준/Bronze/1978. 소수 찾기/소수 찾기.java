

import java.util.Scanner;


public class Main {
	public static boolean Prime(int num){  //void가 아니라 boolean이므로 return값이 필요. false 또는 true.
		if(num <2)
			return false; //당연히 1은 소수가 아니므로 num이 2보다 작다면 false 리턴. 
		
		for(int i=2; i*i<=num; i++) {
			if(num%i ==0) return false; 	
		}
					
		return true; // 위 2개의 조건이 다 해당되지 않는다면 true 리턴. 즉 소수로 인식
	}
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	
    	int N = in.nextInt(); // 몇개의 수를 받을지 정하는 변수.
    	int result=0;
    	
    	for(int i=0; i<N; i++) // N번만큼 for문 반복. 
    	{
    		int num = in.nextInt();
    		if(Prime(num)) result ++; 
    	}
    	System.out.print(result);
    	
    }

}
