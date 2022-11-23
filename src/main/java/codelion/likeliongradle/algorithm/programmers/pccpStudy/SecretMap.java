package codelion.likeliongradle.algorithm.programmers.pccpStudy;

import java.util.Arrays;

public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        String[] binaryString1 = toBinary(n, arr1);
        String[] binaryString2 = toBinary(n, arr2);

        for (int i = 0; i < n; i++) {
            String line = "";
            for (int j = 0; j < n; j++) {
                if (binaryString1[i].charAt(j) == '0' && binaryString2[i].charAt(j) == '0') {
                    line += " ";
                } else {
                    line += "#";
                }
            }
            answer[i] = line;
        }

        return answer;
    }

    private String[] toBinary(int n, int[] arr) {
        String[] binaryStrings = new String[n];

        for (int i = 0; i < n; i++) {
            String binaryString = Integer.toBinaryString(arr[i]);
            if (binaryString.length() != n) {
                String repeat = "0".repeat(n - binaryString.length());
                binaryString = repeat + binaryString;
            }
            binaryStrings[i] = binaryString;
        }
        return binaryStrings;
    }

//    private String[] toBinary(int n, int[] arr) {
//        String[] binaryStrings = new String[n];
//
//        for (int i = 0; i < n; i++) {
//            String binaryString = String.format("%0"+n+"d", Integer.parseInt(Integer.toBinaryString(arr[i])));
//            binaryStrings[i] = binaryString;
//        }
//        return binaryStrings;
//    }

    public static void main(String[] args) {
        SecretMap T = new SecretMap();
        String[] test1 = T.solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28});
        System.out.println(Arrays.toString(test1));

        String[] test2 = T.solution(6, new int[]{46, 33, 33 ,22, 31, 50}, new int[]{27 ,56, 19, 14, 14, 10});
        System.out.println(Arrays.toString(test2));
    }
}
