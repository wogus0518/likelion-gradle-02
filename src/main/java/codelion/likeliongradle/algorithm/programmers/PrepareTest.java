package codelion.likeliongradle.algorithm.programmers;

import java.util.*;

public class PrepareTest {

    public int[] solution(int[] answers) {
        int[][] std = {{1, 2, 3, 4, 5}, {2, 1, 2, 3, 2, 4, 2, 5}, {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < std.length; i++) {
            map.put(i + 1, 0);
        }

        int n = answers.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < std.length; j++) {
                if (answers[i] == std[j][i%std[j].length]) map.put(j+1, map.get(j+1) + 1);
            }
        }

        List<Integer> values = new ArrayList<>(map.values());
        int max = Collections.max(values);

        List<Integer> listKeySet = new ArrayList<>(map.keySet());
        List<Integer> stdWithTheMaxScore = new ArrayList<>();
        for (int i = 0; i < listKeySet.size(); i++) { //key 갯수만큼 반복
            Integer value = map.get(listKeySet.get(i)); //max와 key로 검색한 value값이 같다면
            if (value == max) {
                stdWithTheMaxScore.add(i + 1);
            }
        }

        int[] answer = new int[stdWithTheMaxScore.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = stdWithTheMaxScore.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        PrepareTest prepareTest = new PrepareTest();
        var r1 = prepareTest.solution(new int[]{1, 2, 3, 4, 5});
        var r2 = prepareTest.solution(new int[]{1, 3, 2, 4, 2});

        System.out.println(Arrays.toString(r1));
        System.out.println(Arrays.toString(r2));
    }
}
