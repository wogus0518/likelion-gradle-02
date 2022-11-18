package codelion.likeliongradle.algorithm.sort;

import java.util.Arrays;

interface StatementStrategy {
    boolean apply(int a, int b);
}

// interface를 선언하고
// Template Callback패턴

public class SelectionSort {
    public int[] selectionSort(int[] arr, StatementStrategy stmt) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i; j < arr.length; j++) {
                if (stmt.apply(arr[minIdx], arr[j])) minIdx = j;
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};
        SelectionSort ss = new SelectionSort();

//        ss.selectionSort(arr, new StatementStrategy() {
//            @Override
//            public boolean apply(int a, int b) {
//                return a<b;
//            }
//        });
        ss.selectionSort(arr, (a, b) -> a < b);

        ss.selectionSort(arr, (a, b) -> a > b);
    }
}
