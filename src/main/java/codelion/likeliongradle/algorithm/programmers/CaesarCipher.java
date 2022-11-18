package codelion.likeliongradle.algorithm.programmers;

public class CaesarCipher {

    //a-z => 97-122
    //A-Z => 65-90
    //공백 => 32
    private static String solution(String s, int n) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ') {
                answer += ' ';
                continue;
            }

            if (Character.isUpperCase(c)) answer = addCipher(65, 90, answer, c, n);
            else if (Character.isLowerCase(c)) answer = addCipher(97, 122, answer, c, n);
        }
        return answer;
    }

    private static String addCipher(int start, int end, String answer, char c, int n) {
        char cipher = (char) (c + n);

        if (start <= cipher && cipher <= end) answer += cipher;
        else answer += (char) (cipher - 26);

        return answer;
    }

    public static void main(String[] args) {
        String result = solution("a B Z", 8);
        System.out.println(result);
    }
}
