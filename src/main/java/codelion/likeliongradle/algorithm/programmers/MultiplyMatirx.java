package codelion.likeliongradle.algorithm.programmers;

public class MultiplyMatirx {

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int row = arr1.length;
        int length = arr1[0].length;
        int col = arr2[0].length;
        int[][] answer = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                for (int k = 0; k < length; k++) {
                    answer[i][j] += arr1[i][k]*arr2[k][j];
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] arr2 = {{3, 3}, {3, 3}};
        int[][] solution = solution(arr1, arr2);

        for (int i = 0; i < solution.length; i++) {
            for (int j = 0; j < solution[0].length; j++) {
                System.out.print(solution[i][j] + " ");
            }
            System.out.println();
        }

    }
}
