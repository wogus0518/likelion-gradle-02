package codelion.likeliongradle.algorithm.recursion;

public class Fibonacci {
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(fib(0) == 0);
        System.out.println(fib(1) == 1);
        System.out.println(fib(2) == 1);
        System.out.println(fib(3) == 2);
        System.out.println(fib(4) == 3);
        System.out.println(fib(5) == 5);
        System.out.println(fib(6) == 8);
    }
}
