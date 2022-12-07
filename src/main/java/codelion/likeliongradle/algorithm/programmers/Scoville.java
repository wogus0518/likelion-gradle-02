package codelion.likeliongradle.algorithm.programmers;

import java.util.PriorityQueue;

public class Scoville {

    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int s : scoville) queue.add(s);

        int lowest = queue.peek();
        while (true) {
            if(lowest>=K) break;
            int mix = queue.poll() + (queue.poll() * 2);
            queue.add(mix);
            answer++;
            lowest = queue.peek();

            if (queue.size() == 1 && lowest < K) {
                answer = -1;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scoville T = new Scoville();
        System.out.println(T.solution(new int[]{1, 2, 3, 9, 10, 12}, 7));
    }
}
