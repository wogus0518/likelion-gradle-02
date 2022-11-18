package codelion.likeliongradle.algorithm.programmers;

public class CaesarCipher {

    //a-z => 97-122
    //A-z => 65-90
    //공백 => 32
    private static String solution(String s, int n) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                answer += ' ';
            } else {
                //대문자일 때
                if (65 <= c && c <= 90) {
                    char cipher = (char) (c + n);
                    if (65 <= cipher && cipher <= 90) {
                        answer += cipher;
                    } else {
                        answer += (char) (cipher-26);
                    }
                } else if (97 <= c && c <= 122) {
                    char cipher = (char) (c + n);
                    if (97 <= cipher && cipher <= 122) {
                        answer += cipher;
                    } else {
                        answer += (char) (cipher-26);
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String result = solution("a B Z"	, 8);
        System.out.println(result);
    }
}
