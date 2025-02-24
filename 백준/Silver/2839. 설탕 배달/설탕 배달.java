
import java.util.Scanner;  // 사용자 입력을 받기 위한 Scanner 클래스

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // 입력을 받기 위한 Scanner 객체 생성
        
        int N = in.nextInt();   // KG 수
        
        int minBags = Integer.MAX_VALUE; // 최소 봉지 수를 저장할 변수
        
        for (int i = 0; i <= N / 5; i++) { // 5kg 봉지의 개수
            int remainingWeight = N - (i * 5); // 5kg 봉지를 사용하고 남은 무게
            if (remainingWeight % 3 == 0) { // 남은 무게가 3으로 나누어 떨어지면
                int totalBags = i + (remainingWeight / 3); // 총 봉지 수
                if (totalBags < minBags) {
                    minBags = totalBags; // 최소 봉지 수를 업데이트
                }
            }
        }
        
        if (minBags == Integer.MAX_VALUE) {
            System.out.print(-1); // 주어진 무게를 정확히 만들 수 없는 경우
        } else {
            System.out.print(minBags); // 최소 봉지 수 출력
        }
    }
}
