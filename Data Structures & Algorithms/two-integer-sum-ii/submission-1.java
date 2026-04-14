class Solution {
    public int[] twoSum(int[] numbers, int target) 
    {
        int n = numbers.length;
        int left = 0;
        int right = n - 1;
        int curr_sum = 01;
        
        while(left < right)
        {
            curr_sum = numbers[left] + numbers[right];

            if(curr_sum > target)
            {
                right--;
            }
            else if(curr_sum < target)
            {
                left++;
            }
            else
            {
                return new int[]{left + 1, right + 1};
            }
        }
        return new int[0];
    }
}
