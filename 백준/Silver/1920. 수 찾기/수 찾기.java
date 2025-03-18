

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫 번째 배열 입력
        int N = sc.nextInt();
        HashSet<Integer> set = new HashSet<>(); 

        for (int i = 0; i < N; i++) {
            set.add(sc.nextInt());
        }

        // 두 번째 배열 입력 및 확인
        int M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            int num = sc.nextInt();
            if (set.contains(num)) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
        sc.close();
    }
}
