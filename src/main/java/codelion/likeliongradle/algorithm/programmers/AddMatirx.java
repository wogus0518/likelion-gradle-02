package codelion.likeliongradle.algorithm.programmers;

public class AddMatirx {

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int row = arr1.length;
        int col = arr1[0].length;
        int[][] answer = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println(arr1[i][j]);
                System.out.println(arr2[i][j]);
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] arr1 = {{1,2,3}, {2,3,4}};
        int[][] arr2 = {{5,6,7}, {7,8,9}};
        solution(arr1, arr2);

    }
}
