package codelion.likeliongradle.algorithm.programmers;

public class Bracket {
    boolean solution(String input) {
        boolean answer = true;
        int cnt = 0;

        for (int i = 0; i < input.length(); i++) {
            if (cnt < 0) break;

            if (input.charAt(i) == '(') cnt++;
            else cnt--;
        }

        return (cnt == 0) ? true : false;
    }
}
