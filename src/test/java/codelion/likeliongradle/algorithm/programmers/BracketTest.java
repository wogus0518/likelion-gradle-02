package codelion.likeliongradle.algorithm.programmers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BracketTest {

    @Test
    @DisplayName("올바른 괄호")
    void solution() {
        String[] inputs = new String[]{"()()", "(())()", ")()(", "(()("};
        Boolean[] answer = new Boolean[inputs.length];
        Boolean[] result = new Boolean[]{true, true, false, false};

        Bracket bracket = new Bracket();

        for (int i = 0; i < inputs.length; i++) {
            answer[i] = bracket.solution(inputs[i]);
        }
        assertArrayEquals(result, answer);
    }

}