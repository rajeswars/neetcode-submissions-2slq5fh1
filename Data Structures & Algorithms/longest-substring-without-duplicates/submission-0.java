class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        int n = s.length();

        int[] hash = new int[256];
        Arrays.fill(hash, -1);
        int left = 0;
        int right = 0;
        int maxLen = 0, len = 0;

        while(right < n)
        {
            if(hash[s.charAt(right)] != -1)
            {
                if(hash[s.charAt(right)] >= left)
                {
                    left = hash[s.charAt(right)] + 1;
                }   
            }
            len = right - left + 1;
            maxLen = Math.max(maxLen, len);
            hash[s.charAt(right)] = right;
            right++;
        }
        return maxLen;
    }
}
