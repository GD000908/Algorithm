import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	
    	int N = in.nextInt(); // 전체 참가자 수 
    	
    	// 사이즈 별 변수
    	int S = in.nextInt();
    	int M = in.nextInt();
    	int L = in.nextInt();
    	int XL = in.nextInt();
    	int XXL = in.nextInt();
    	int XXXL = in.nextInt();
    	
    	int a,b,c,d,e,f; // 각각의 티셔츠별 필요한 묶음수 저장 할 변수
    	int T,P;  
    	// 1묶음당 들어있는 티셔츠와 펜의 개수.
    	T = in.nextInt();
    	P = in.nextInt();
    	
    	if(S/T ==0 && S%T != 0)
    	{
    		a=1;
    	}
    	
    	else if (S/T>=1 && S%T !=0)
    	{
    		a = S/T+1;
    	}
    	
    	else
    	{
    		a= S/T;
    	}
    	
    	
    	// M 사이즈에 대한 필요 묶음수 계산
        if (M / T == 0 && M % T != 0) {
            b = 1;
        } else if (M / T >= 1 && M % T != 0) {
            b = (M / T) + 1;
        } else {
            b = M / T;
        }

        // L 사이즈에 대한 필요 묶음수 계산
        if (L / T == 0 && L % T != 0) {
            c = 1;
        } else if (L / T >= 1 && L % T != 0) {
            c = (L / T) + 1;
        } else {
            c = L / T;
        }

        // XL 사이즈에 대한 필요 묶음수 계산
        if (XL / T == 0 && XL % T != 0) {
            d = 1;
        } else if (XL / T >= 1 && XL % T != 0) {
            d = (XL / T) + 1;
        } else {
            d = XL / T;
        }
        
     // XXL 사이즈에 대한 필요 묶음수 계산
        if (XXL / T == 0 && XXL % T != 0) {
            e = 1;
        } else if (XXL / T >= 1 && XXL % T != 0) {
            e = (XXL / T) + 1;
        } else {
            e = XXL / T;
        }

        // XXXL 사이즈에 대한 필요 묶음수 계산
        if (XXXL / T == 0 && XXXL % T != 0) {
            f = 1;
        } else if (XXXL / T >= 1 && XXXL % T != 0) {
            f = (XXXL / T) + 1;
        } else {
            f = XXXL / T;
        }
        
       
        System.out.println(a+b+c+d+e+f);
        System.out.print(N/P+" ");
        System.out.print(N%P);
        
        
        
    	
    }

}
