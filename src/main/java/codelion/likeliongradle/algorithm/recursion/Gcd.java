package codelion.likeliongradle.algorithm.recursion;

public class Gcd {

    public static int gcd(int a, int b) {
        int answer;

        if (a == b) return a;
        else if (a > b) answer = gcd(a - b, b);
        else answer = gcd(a, b - a);

        return answer;
    }

    public static void main(String[] args) {
        int gcd = gcd(196, 42);
        System.out.println("gcd = " + gcd);

        //154, 42
        //112, 42
        //70, 42
        //28, 42
        //28, 14
        //14, 14
    }
}
