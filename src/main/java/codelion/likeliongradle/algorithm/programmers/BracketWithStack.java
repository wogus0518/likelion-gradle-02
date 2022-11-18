package codelion.likeliongradle.algorithm.programmers;

import java.util.Stack;

public class BracketWithStack {
    public boolean solution(String input) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {

            if ('(' == input.charAt(i)) stack.push(input.charAt(i));

            else {
                if (stack.empty()) return false;
                stack.pop();
            }
        }

        return stack.empty();
    }
}
