class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        if(nums.length == 0)
            return result;
        Map<Integer,Integer> nmap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nmap.containsKey(target-nums[i])){
                return new int[]{nmap.get(target-nums[i]),i};
            }
            nmap.put(nums[i],i);
        }
        return result;
    }
}
