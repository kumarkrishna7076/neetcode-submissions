class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int zeroCount = 0;
        int n = nums.length;
        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            } else {
                product *= num;
            }
        }

        int result[] = new int[n];
        if (zeroCount >1)
            return result;

        if (zeroCount == 1) {
            for (int i = 0; i < n; i++) {
                if (nums[i] == 0) {
                    result[i] = product;
                }
            }
            return result;
        }

        for (int i = 0; i < n; i++) {
            result[i] = product / (nums[i]);
        }

        return result;
    }
}
