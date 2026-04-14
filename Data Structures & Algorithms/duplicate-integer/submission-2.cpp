class Solution {
public:
    bool hasDuplicate(vector<int>& nums) 
    {
        int n = nums.size();
        unordered_map<int,int> freq;
        for(int c : nums)
        {
            freq[c]++;
            if(freq[c] > 1)
            {
                return true;
            }
        }
        return false;
    }
};
