package codelion.likeliongradle.algorithm.bracket;

import java.util.Scanner;

// 1410 : 올바른 괄호 1 (괄호 개수 세기)
public class CodeUp_1410 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int left = 0;
        int right = 0;

        String input = sc.nextLine();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
        }
        System.out.printf("%d %d", left, right);
    }
}
