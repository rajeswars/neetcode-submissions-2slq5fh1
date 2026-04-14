class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
        int n = nums.length;
        int[] arr = new int[n];
        int prev = 1;
        int post = 1;

        for(int i = 0;i<n;i++)
        {
            arr[i] = 1;
        }

        for(int i = 0;i<n;i++)
        {
            arr[i] = arr[i] * prev;
            prev = prev * nums[i];
        }

        for(int j = n - 1;j>=0;j--)
        {
            arr[j] = arr[j] * post;
            post = post * nums[j];
        }

        return arr;
    }
}  
