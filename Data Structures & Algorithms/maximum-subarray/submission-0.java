class Solution {
    public int maxSubArray(int[] nums) {
        
        int n = nums.length;
        int curr_sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0;i<n;i++)
        {
            curr_sum += nums[i];

            if(curr_sum > maxSum)
            {
                maxSum = curr_sum;
            }

            if(curr_sum < 0)
            {
                curr_sum = 0;
            }
        }
        return maxSum;
    }
}
