class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) 
    {
        //MAX-HEAP

        int n = nums.size();
        unordered_map<int, int> freq;

        for(int i = 0;i<n;i++)
        {
            freq[nums[i]]++;
        }

        priority_queue<pair<int, int>> maxHeap;
        for(auto& it : freq)
        {
            maxHeap.push({it.second, it.first});
        }

        vector<int> ans;
        for(int i = 0;i<k;i++)
        {
            ans.push_back(maxHeap.top().second);
            maxHeap.pop();
        }
        return ans;
    }
};
