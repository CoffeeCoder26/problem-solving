package leetcode.easyproblems;

public class FindNumbers {

    public int findNumbers(int[] nums) {

        int cnt =0;
        for (int i : nums){

            int len = String.valueOf(i).length();
                if (len%2==0){
                        cnt++;
                    }
                }
        return cnt;
    }

    public static void main(String[] args) {
        int []arr = new int[] {437,315,322,431,686,264,442};
        FindNumbers  findNumbers = new FindNumbers();
        System.out.println(findNumbers.findNumbers(arr));
    }
}
