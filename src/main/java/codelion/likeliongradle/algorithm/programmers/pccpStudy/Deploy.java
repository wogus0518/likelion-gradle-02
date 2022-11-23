package codelion.likeliongradle.algorithm.programmers.pccpStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Deploy {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();

        int[] days = new int[progresses.length];

        for (int i = 0; i < progresses.length; i++) {
            int left = 100 - progresses[i];
            int ceil = (int) Math.ceil(left / (double) speeds[i]);
            days[i] = ceil;
        }
//        System.out.println(Arrays.toString(days));

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < days.length; i++) {
            if(arr.size() == 0) {
                arr.add(days[i]);

            } else {
                if (arr.get(0) < days[i]) {
                    answer.add(arr.size());
                    arr = new ArrayList<>();
                    arr.add(days[i]);

                } else arr.add(days[i]);
            }
        }
        answer.add(arr.size());
        return convertIntegers(answer);
    }

    private int[] convertIntegers(List<Integer> integers) {
        int[] ret = new int[integers.size()];
        for (int i=0; i < ret.length; i++) {
            ret[i] = integers.get(i).intValue();
        }
        return ret;
    }

    public static void main(String[] args) {
        Deploy T = new Deploy();
        int[] solution = T.solution(new int[]{93, 30, 55}, new int[]{1, 30, 5});
        System.out.println(Arrays.toString(solution));

        int[] solution1 = T.solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1});
        System.out.println(Arrays.toString(solution1));
    }
}
