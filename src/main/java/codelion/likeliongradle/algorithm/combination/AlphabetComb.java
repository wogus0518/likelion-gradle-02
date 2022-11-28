package codelion.likeliongradle.algorithm.combination;


public class AlphabetComb {

    /**
     *
     * @param target ['A', 'B', 'C', ... , 'Z']
     * @param result r개를 뽑은 결과를 저장하는 배열
     * @param r      뽑고 싶은 갯수
     * @param cnt    result에 배열에 몇 개 뽑혀 있는지 카운트
     * @param idx    반복분 시작지점
     */
    private static void combination(char[] target , char[] result, int r, int cnt, int idx) {
        // r개를 선택했으므로, 결과를 출력하고 재귀를 종료한다.
        if (cnt == r) {
            System.out.println(result);
            return;
        }
        // target을 주어진 인덱스부터 돌면서 알파벳을 하나 선택한다.
        for (int i = idx; i < target.length; i++) {
            result[cnt] = target[i];
            combination(target, result, 2, cnt + 1, i);
        }
    }

    public static void main(String[] args) {
        char[] alphabets = new char[26];
        for (int i = 0; i < alphabets.length; i++) {
            alphabets[i] = (char) (i + 65);
        }

        int r = 2;
        char[] result = new char[r];
        combination(alphabets, result, r, 0, 0);
    }
}
