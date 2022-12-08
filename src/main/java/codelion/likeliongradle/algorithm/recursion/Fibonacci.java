package codelion.likeliongradle.algorithm.recursion;

public class Fibonacci {
    //재귀 적용
    public static int recur(int n) {
        if (n <= 1) {
            return n;
        } else {
            return recur(n - 1) + recur(n - 2);
        }
    }

    //DP 적용
    public static int dp(int n) {
        int[] memo = new int[100];
        memo[0] = 0;
        memo[1] = 1;
        for (int i = 2; i <= n; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }
        return memo[n];
    }

    public static void main(String[] args) {
        System.out.println("피보나치 수열 - 재귀로 실행");
        long start = System.currentTimeMillis();
        System.out.println(recur(45));
        long end = System.currentTimeMillis();
        System.out.println( "실행 시간 : " + ( end - start )/1000.0 +"초"); //최종 실행시간
        System.out.println();

        System.out.println("피보나치 수열 - 동적 프로그래밍으로 실행");
        start = System.currentTimeMillis();
        System.out.println(dp(45));
        end = System.currentTimeMillis();
        System.out.println( "실행 시간 : " + ( end - start )/1000.0 +"초"); //최종 실행시간
    }
}
