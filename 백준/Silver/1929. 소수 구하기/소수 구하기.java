import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int M = sc.nextInt();
        int N = sc.nextInt();
        
        for (int i = M; i <= N; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    // 소수 판별 함수
    public static boolean isPrime(int num) {
        if (num < 2) return false; // 1은 소수가 아님
        for (int i = 2; i * i <= num; i++) { // √num까지만 검사
            if (num % i == 0) return false;
        }
        return true;
    }
}