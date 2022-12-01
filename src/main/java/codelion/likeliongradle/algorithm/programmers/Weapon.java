package codelion.likeliongradle.algorithm.programmers;

public class Weapon {

    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] arr = new int[number]; //약수 개수를 담을 배열

        for (int i = 1; i <= number; i++) {
            arr[i - 1] = getDivisorDigit(i);
        }

        for (int j : arr) {
            if (j > limit) answer += power; //약수 개수가 limit보다 크면 power만큼 계산
            else answer += j;               //아니면 그대로 약수 개수만큼 추가
        }
        return answer;
    }

    private int getDivisorDigit(int n) {
        int cnt = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(i * i == n) cnt++;
            else if (n % i == 0) cnt += 2;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Weapon T = new Weapon();
        int result = T.solution(5, 3, 2);
        System.out.println(result);
    }
}
