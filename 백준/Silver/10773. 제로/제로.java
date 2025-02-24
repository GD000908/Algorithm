import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int k = in.nextInt(); // 몇 개의 숫자를 입력할지 결정
        int result = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i = 0; i < k; i++) {
            int num = in.nextInt();
            
            if (num == 0 && arr.size() > 0) {
                arr.remove(arr.size() - 1); // 마지막 숫자 제거
            } else {
                arr.add(num); // 숫자 추가
            }
        }
        
        for (int num : arr) {
            result += num;
        }
        
        System.out.print(result);
    }
}
