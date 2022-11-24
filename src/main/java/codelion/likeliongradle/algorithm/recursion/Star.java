package codelion.likeliongradle.algorithm.recursion;

public class Star {
    public static String getStars(int n) {
        if(n == 0) return "";
        return "*" + getStars(n - 1);
    }

    public static void printStar(int n) {
        if(n == 0) return;

        printStar(n - 1);
        System.out.printf(getStars(n));
        System.out.println();
    }

    public static void main(String[] args) {
        printStar(4);
    }
}
