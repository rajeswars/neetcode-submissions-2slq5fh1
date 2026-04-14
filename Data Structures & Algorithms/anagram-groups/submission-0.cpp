class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) 
    {
        int primes[26] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};

        unordered_map<long long, vector<string>> mp;

        for(string s : strs)
        {
            long long prod = 1;
            for(char c : s)
            {
                prod = prod * primes[c - 'a'];
            }
            mp[prod].push_back(s);
        }

        vector<vector<string>> ans;
        for(auto& it : mp)
        {
            ans.push_back(it.second);
        }
        return ans;
    }
};
