package codelion.likeliongradle.algorithm.programmers;

public class CaesarCipher {

    private static String solution(String s, int n) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // 공백은 공백 그대로 추가
            if (c == ' ') {
                answer += ' ';
                continue;
            }

            if (Character.isUpperCase(c)) answer = addCipher('A', 'Z', answer, c, n);      // 대문자인 경우
            else if (Character.isLowerCase(c)) answer = addCipher('a', 'z', answer, c, n); // 소문자인 경우
        }
        return answer;
    }

    //문자 하나를 시저 암호화해서 추가하는 메서드
    private static String addCipher(char start, char end, String answer, char c, int n) {
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
