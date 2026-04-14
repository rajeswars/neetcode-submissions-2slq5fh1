class Solution {
    public int findDuplicate(int[] nums) {
        
        int[] freq = new int[nums.length];

        for(int ch : nums)
        {
            if(freq[ch] == 1)
            {
                return ch;
            }
            freq[ch]++;
        }
        return -1;
    }
}
