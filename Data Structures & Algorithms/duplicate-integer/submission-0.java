class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> num_set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!num_set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}