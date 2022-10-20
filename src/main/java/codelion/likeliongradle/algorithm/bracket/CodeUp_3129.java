package codelion.likeliongradle.algorithm.bracket;

import java.util.Scanner;

// 3129 : 올바른 괄호 2
public class CodeUp_3129 {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();

        int cnt = 0;
        for (int i = 0; i < input.length(); i++) {
            if (cnt < 0) break;

            if (input.charAt(i) == '(') cnt++;
            else cnt--;
        }

        System.out.println((cnt == 0) ? "good" : "bad");
    }
}
