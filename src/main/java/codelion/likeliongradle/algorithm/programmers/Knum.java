package codelion.likeliongradle.algorithm.programmers;

import java.util.ArrayList;
import java.util.Comparator;

public class Knum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});
        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(result[2]);
    }
}

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] command = commands[i];
            int start = command[0];
            int end = command[1];
            int k = command[2];

            ArrayList<Integer> integers = new ArrayList<>();
            for (int j = 0; j < array.length; j++) {
                if ((start - 1) <= j && j <= (end - 1)) {
                    integers.add(array[j]);
                }
            }

            integers.sort(Comparator.naturalOrder());
            answer[i] = integers.get(k - 1);
        }

        return answer;
    }
}