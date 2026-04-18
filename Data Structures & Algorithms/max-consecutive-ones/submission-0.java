class Solution {
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int n = nums.length;
        int maxLen = 0;
        int currLen = 0;

        for(int i = 0;i<n;i++)
        {
            if(nums[i] == 1)
            {
                currLen++;
                maxLen = Math.max(currLen, maxLen);
            }

            else
            {
                currLen = 0;
            }
        }
        return maxLen;
    }
}