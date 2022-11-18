package codelion.likeliongradle.algorithm.sort;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class SelectionSort02 {

    public int[] selectionSort(int[] arr, BiFunction<Integer, Integer, Boolean> biFunction ) {
        for (int i = 0; i < arr.length - 1; i++) {
            int swapIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (biFunction.apply(arr[swapIdx], arr[j])) {
                    swapIdx = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[swapIdx];
            arr[swapIdx] = tmp;
            System.out.println(Arrays.toString(arr));
        }

        return arr;
    }

    public static void main(String[] args) {
        SelectionSort02 T = new SelectionSort02();
        int[] arr = {2, 7, 4, 9, 10, 223, 111, 23, 3, 39};

        T.selectionSort(arr, (a, b) -> a < b);//내림차순
        T.selectionSort(arr, (a, b) -> a > b);//오름차순

        //함수형 인터페이스를 통해서 input과 retrun 타입을 지정하여 연산 가능
        Function<Integer[], Boolean> sortInterface = (arr1) -> arr1[0] > arr1[1];
        System.out.println(sortInterface.apply(new Integer[]{10, 20}));

        //앞의 integer a,b 를 받아서 연산을 한 결과를 boolean형으로 리턴한다
        BiFunction<Integer, Integer, Boolean> biFunction =  (a, b) -> a > b;
        System.out.println(biFunction.apply(10, 20));

        //True or False(Boolean)를 리턴하는 Interface
        BiPredicate<Integer, Integer> biPredicate = (a, b) -> a > b;
        System.out.println(biPredicate.test(20, 10));
    }
}
