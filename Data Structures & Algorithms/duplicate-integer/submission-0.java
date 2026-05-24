class Solution {
    public boolean hasDuplicate(int[] nums) {
        for(int i = 0;i<nums.length;i++){
            for(int j=0;j<nums.length && j != i;j++){
                if(nums[i]==nums[j]){
                    System.out.println(nums[i]);
                    System.out.println(nums[j]);
                    return true;
                }
            }
        }
        return false;
    }
}