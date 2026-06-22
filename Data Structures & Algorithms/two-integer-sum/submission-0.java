class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int search = target - nums[i];
            if (map.containsKey(search)) {
                ret[0] = map.get(search);
                ret[1] = i;
            }
            map.put(nums[i], i);
        }
        return ret;
    }
}
