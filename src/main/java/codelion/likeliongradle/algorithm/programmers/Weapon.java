package codelion.likeliongradle.algorithm.programmers;

import java.util.Arrays;

public class Weapon {

    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] arr = new int[number];
        for (int i = 1; i <= number; i++) {
            arr[i - 1] = getDivisorDigit(i);
        }
//        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > limit) {
                answer += power;
            } else answer += arr[i];
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
