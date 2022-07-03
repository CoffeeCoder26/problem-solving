package EasyProblems;

public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {

        int cnt =0,maxResult=0;
        for (int i =0; i<nums.length; i++){
            if(nums[i]==0){
                cnt=0;
            }else {
                cnt++;
                maxResult= Math.max(cnt,maxResult);
            }
        }
        return maxResult;
    }


    public static void main(String[] args) {

        int []arr = new int[] {1,0,1,1,1,1};
       MaxConsecutiveOnes ones = new MaxConsecutiveOnes();
        System.out.println(ones.findMaxConsecutiveOnes(arr));
    }
}
