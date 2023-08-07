package RuntimeProblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingNumber {

    // TimeComplexity : O(n) and SpaceComplexity : O(1)
    public int findMissingNumber(int[] nums, int maxNum) {
        int actualSum = 0, totalSum = maxNum * (maxNum + 1) / 2;
        for (int num : nums) {
            actualSum += num;
        }
        return totalSum - actualSum;
    }
    // TimeComplexity : O(n) and SpaceComplexity : O(n)
    public int missingNumberSet(int[] nums, int maxNum) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        for (int i = 1; i <= maxNum; i ++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return 0;
    }

    // TimeComplexity : O(n log n) and SpaceComplexity : O(1)
    public int missingNumberSort(int[] nums, int maxNum) {
        Arrays.sort(nums);
        for (int i = 1; i <= maxNum; i++) {
            if (i != nums[i - 1]) return i;
        }
        return 0;
    }   
}