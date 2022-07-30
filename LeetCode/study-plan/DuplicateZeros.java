package leetcode.studyplan;

public class DuplicateZeros {

    public void duplicateZeros(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == 0) {
                int j = arr.length - 1;

                while (j > i) {
                    arr[j] = arr[j - 1];
                    j--;
                }
                i++;
            }
            i++;
        }
    }

    public static void main(String[] args) {

        int[] a = new int[]{1, 0, 2, 3, 0, 4, 5, 0};
        //duplicateZeros(a);
        System.out.println(a.length);

    }
}
