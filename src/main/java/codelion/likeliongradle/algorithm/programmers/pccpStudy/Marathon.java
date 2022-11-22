package codelion.likeliongradle.algorithm.programmers.pccpStudy;

import java.util.Arrays;

public class Marathon {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < participant.length; i++) {
            try {
                String par = participant[i];
                String com = completion[i];

                if (!par.equals(com)) {
                    return par;
                }
            } catch (Exception e) {
                return participant[i];
            }
        }
        return "";
    }

    public static void main(String[] args) {
        Marathon T = new Marathon();

        System.out.println(T.solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}));

        System.out.println(T.solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"}));

        System.out.println(T.solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"}));
    }
}
