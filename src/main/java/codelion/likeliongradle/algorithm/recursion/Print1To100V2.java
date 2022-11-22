package codelion.likeliongradle.algorithm.recursion;

public class Print1To100V2 {
    public static void print1To100(int n) {
        System.out.println(n);
        if(n==100) return;
        print1To100(n+1);

    }

    public static void main(String[] args) {
        print1To100(1);
    }
}
