package codelion.likeliongradle.algorithm.programmers.pccpStudy;


import java.util.Arrays;

public class Budget {

    public int solution(int[] d, int budget) {
        int result = 0;

        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            result += d[i];
            if (result > budget) return i;
        }

        return d.length;
    }


    public static void main(String[] args) {
        Budget T = new Budget();
        System.out.println(T.solution(new int[]{1, 3, 2, 5, 4}, 9));
        System.out.println(T.solution(new int[]{2, 2, 3, 3}, 10));
    }
}
