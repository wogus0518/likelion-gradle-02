package codelion.likeliongradle.algorithm.programmers;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Honor {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            if (i < k) {
                priorityQueue.add(score[i]);
                answer[i] = priorityQueue.peek();
            } else {
                if (priorityQueue.peek() < score[i]) {
                    priorityQueue.poll();
                    priorityQueue.add(score[i]);
                    answer[i] = priorityQueue.peek();
                } else {
                    answer[i] = priorityQueue.peek();
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Honor T = new Honor();
        int[] solution = T.solution(3, new int[]{10, 100, 20, 150, 1, 100, 200});
        System.out.println(Arrays.toString(solution));
    }
}
