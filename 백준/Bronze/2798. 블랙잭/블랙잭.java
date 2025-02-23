import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt(); // 몇 장의 숫자를 줄지 결정
        int M = in.nextInt(); // 목표 숫자
        int closestSum =0;
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
        	numbers[i] = in.nextInt(); // 정한 개수만큼 랜덤 숫자 부여
        }

        Arrays.sort(numbers); // 배열 전체를 한 번만 정렬

        for (int i = 0; i < numbers.length - 2; i++) {
            for (int j = i + 1; j < numbers.length - 1; j++) {
                for (int k = j + 1; k < numbers.length; k++) {
                    int sum = numbers[i] + numbers[j] + numbers[k];
                    if (sum <= M && sum > closestSum) {
                        closestSum = sum;
                    }
                }
            }
        }
        System.out.println(closestSum);
    }
}