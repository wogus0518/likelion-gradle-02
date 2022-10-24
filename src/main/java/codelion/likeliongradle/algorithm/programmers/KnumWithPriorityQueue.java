package codelion.likeliongradle.algorithm.programmers;

import java.util.PriorityQueue;

public class KnumWithPriorityQueue {
    private int[] arr = {};

    public int getKthNum(int[] command) {
        int from = command[0];
        int to = command[1];
        int k = command[2];
        int result = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = from - 1; i < to; i++) {
            pq.add(arr[i]);
        }

        for (int i = 0; i < k; i++) {
            result = pq.poll();
        }
        return result;
    }

    public int[] solution(int[] arr, int[][] commands) {
        this.arr = arr;
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            answer[i] = getKthNum(commands[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        KnumWithPriorityQueue kthNum = new KnumWithPriorityQueue();
        int[] arr = new int[]{1, 5, 2, 6, 3, 7, 4};
        int[][] commands = new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        kthNum.solution(arr, commands);
    }
}
