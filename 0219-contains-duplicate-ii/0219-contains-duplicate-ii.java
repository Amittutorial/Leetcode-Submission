import java.util.HashSet;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            // for contain value of array
            if (set.contains(nums[i])) {
                return true;
            }

            set.add(nums[i]);
            // check size is greater or not 
            if (set.size() > k) {
                set.remove(nums[i - k]); // For Remove it 
            }
        }

        return false;
    }
}