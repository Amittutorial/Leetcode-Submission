import java.util.TreeSet;

class Solution {
    public boolean containsNearbyAlmostDuplicate(
            int[] nums, int indexDiff, int valueDiff) {

          TreeSet<Long> set = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {
            long curr = nums[i];

            Long candidate = set.ceiling(curr - valueDiff);

            if (candidate != null &&
                candidate <= curr + valueDiff) {
                return true;
            }

            set.add(curr);

            if (i >= indexDiff) {
                set.remove((long) nums[i - indexDiff]);
            }
        }

        return false;
    }
}