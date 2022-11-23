package codelion.likeliongradle.algorithm.programmers.pccpStudy;


public class JadenCase {
    public String solution(String s) {
        String answer = "";
        String[] splits = s.toLowerCase().split("");

        boolean space = true;
        for (String str : splits) {
            if(!str.equals(" ") && space){
                answer += str.toUpperCase();
                space = false;

            } else if (!str.equals(" ")) {
                answer += str;

            } else {
                answer += str;
                space = true;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        JadenCase T = new JadenCase();
        System.out.println(T.solution("3people unFollowed me").equals("3people Unfollowed Me"));
        System.out.println(T.solution("for the last week").equals("For The Last Week"));
        System.out.println(T.solution("for  the last week").equals("For  The Last Week"));
    }
}
