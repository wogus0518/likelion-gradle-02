package codelion.likeliongradle.algorithm.programmers.pccpStudy;

import java.util.Arrays;

public class MockTest {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[][] students = new int[][]{{1, 2, 3, 4, 5}, {2, 1, 2, 3, 2, 4, 2, 5}, {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};

        //각 학생들의 정답 갯수를 scores에 담는다
        int[] scores = new int[students.length];
        for (int i = 0; i < students.length; i++) {
            scores[i] = checkScore(answers, students[i]);
        }

        //scores에서 최고 점수를 뽑아낸 후 최고 점수를 맞은 학생이 몇명인지 카운팅
        int highScore = Arrays.stream(scores).max().getAsInt();
        int answerSize = 0;
        for (int score : scores) {
            if (score == highScore) answerSize++;
        }

        //최고 점수를 맞은 학생 수 만큼 배열을 생성한다
        answer = new int[answerSize];
        for (int i = 0; i < scores.length; i++) {
            if(scores[i] == highScore) { // 최고 점수 학생이라면
                for (int j = 0; j < answerSize; j++) {
                    if (answer[j] == 0) {
                        answer[j] = i+1; // 정답 배열에 추가한다.
                        break;
                    }
                }
            }
        }

        return answer;
    }

    //찍는 패턴에 따라 정답 갯수를 리턴하는 메서드
    private int checkScore(int[] answer, int[] pattern) {
        int score = 0;
        int patterLength = pattern.length;

        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == pattern[i%patterLength]) {
                score++;
            }
        }
        return score;
    }

    public static void main(String[] args) {
        MockTest T = new MockTest();

        int[] result1 = T.solution(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1});
        for (int i : result1) {
            System.out.printf("%d, ", i);
        }
        System.out.println();

        int[] result2 = T.solution(new int[]{1, 3, 2, 4, 2});
        for (int i : result2) {
            System.out.printf("%d, ", i);
        }
    }
}
