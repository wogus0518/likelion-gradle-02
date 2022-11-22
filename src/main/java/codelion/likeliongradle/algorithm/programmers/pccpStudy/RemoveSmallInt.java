package codelion.likeliongradle.algorithm.programmers.pccpStudy;

import java.util.Arrays;

public class RemoveSmallInt {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];

        // arr의 길이가 1이면 [-1]을 반환합니다.
        if (arr.length == 1) return new int[]{-1};

        // arr 배열에서 가장 작은 수를 구합니다.
        int smallest = Arrays.stream(arr).min().getAsInt();

        // arr 배열을 돌면서 가장 작은 수가 아니면 answer에 추가합니다.
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != smallest) {
                answer[idx] = arr[i];
                idx++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        RemoveSmallInt T = new RemoveSmallInt();
        System.out.println(Arrays.toString(T.solution(new int[]{4, 3, 2, 1})));
        System.out.println(Arrays.toString(T.solution(new int[]{10})));

    }
}
