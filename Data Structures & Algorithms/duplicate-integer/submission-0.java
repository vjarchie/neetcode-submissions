class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums == null || nums.length == 0){
            return false;
        }
        Set<Integer> numset = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(numset.contains(nums[i]))
                return true;
            numset.add(nums[i]);
        }
        return false;
    }
}