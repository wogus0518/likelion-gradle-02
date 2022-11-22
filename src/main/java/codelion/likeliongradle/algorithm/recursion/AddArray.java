package codelion.likeliongradle.algorithm.recursion;

public class AddArray {
    public static int addArray(int[] array, int n) {
        if(n<=0) return 0;
        else return addArray(array, n-1) + array[n-1];
    }

    public static void main(String[] args) {
        int sum = addArray(new int[]{7, 3, 2, 9}, 4);
        System.out.println("sum = " + sum);
    }
//    main => addArray(array, 4) => addArray(array, 3) => addArray(array, 2) => addArray(array, 1) => addArray(array, 0)
//    0 + array[0] + array[1] + array[2] + array[3] <- 0 + array[0] + array[1] + array[2] <- 0 + array[0] + array[1] <- 0 + array[0] <- 0
}
