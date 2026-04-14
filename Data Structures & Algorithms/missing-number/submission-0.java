class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n + 1];

        for(int i = 0;i<n;i++)
        {
            ans[nums[i]]++;
        }

        for(int i = 1;i<=n;i++)
        {
            if(ans[i] == 0)
            {
                return i;
            }
        }
        return 0;
    }
}
