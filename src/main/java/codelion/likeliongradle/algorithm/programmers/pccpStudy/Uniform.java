package codelion.likeliongradle.algorithm.programmers.pccpStudy;

import java.util.Arrays;

public class Uniform {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        int[] students = new int[n + 1];
        for (int i = 1; i <= n; i++) students[i] = 1;
        for (int idx : lost) students[idx]--;
        for (int idx : reserve) students[idx]++;
//        System.out.println(Arrays.toString(students));

        for (int i = 1; i <= n; i++) {
            if (students[i] == 0) {
                if(i == n) break;
                if (students[i - 1] == 2) {
                    students[i - 1]--;
                    students[i]++;
                } else if (students[i + 1] == 2) {
                    students[i + 1]--;
                    students[i]++;
                }
            }
        }
//        System.out.println(Arrays.toString(students));
        for (int i = 1; i <= n; i++) {
            if(students[i]>0) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Uniform T = new Uniform();
        System.out.println(T.solution(5, new int[]{2,4}, new int[]{1,3,5}) == 5);
        System.out.println(T.solution(5, new int[]{2,4}, new int[]{3}) == 4);
        System.out.println(T.solution(3, new int[]{3}, new int[]{1}) == 2);

    }
}
