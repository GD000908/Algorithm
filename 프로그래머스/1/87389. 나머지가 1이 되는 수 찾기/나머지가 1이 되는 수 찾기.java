class Solution {
    public int solution(int n) {
        for (int x = 2; x < n; x++) {     // 2부터 n-1까지 검사
            if (n % x == 1) return x;     // 조건을 만족하면 바로 리턴
        }
        return -1; // 도달 불가 (항상 해답 존재하므로 실행되지 않음)
    }
}
