package leetcode.studyplan;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int ref = m + n - 1, ref1 = m - 1, ref2 = n - 1;

        while (ref2 >= 0) {

            if (ref1 >= 0 && nums1[ref1] > nums2[ref2]) {
                nums1[ref--] = nums1[ref1--];

            } else {
                nums1[ref--] = nums2[ref2--];
            }
        }


    }

    public static void main(String[] args) {

    }
}
