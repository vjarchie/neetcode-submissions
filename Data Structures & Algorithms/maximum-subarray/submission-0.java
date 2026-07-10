class Solution {
    public int maxSubArray(int[] nums) {
        // kadane's algo
        int maxSum = Integer.MIN_VALUE;
        int tempSum = 0;
        for(int i=0;i<nums.length;i++){
            tempSum += nums[i];
            if(tempSum < 0){
                tempSum = 0;
            }else{
                nums[i] = tempSum;
            }
            maxSum = Math.max(nums[i],maxSum);
        }
        return maxSum;
    }
}
