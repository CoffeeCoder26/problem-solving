package EasyProblems;

import java.util.Arrays;

public class SquaresofaSortedArray {

    public int[] sortedSquares(int[] nums) {

        for (int i : nums){
             nums[i] *=nums[i];
        }
        Arrays.sort(nums);

        return nums;
    }

    public static void main(String[] args) {

        int []arr = new int[] {-4,-1,0,3,10};
        SquaresofaSortedArray squaresofaSortedArray= new SquaresofaSortedArray();
        System.out.print(Arrays.toString(squaresofaSortedArray.sortedSquares(arr)));
    }
}
