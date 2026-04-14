class Solution {
public:
    int maxArea(vector<int>& heights) 
    {
        int n = heights.size();
        int left = 0;
        int right = n - 1;
        int maxWater = 0;

        while(left < right)
        {
            maxWater = max(maxWater, min(heights[left], heights[right]) * (right - left));

            if(heights[left] > heights[right])
            {
                right--;
            }
            else
            {
                left++;
            }
        }
        return maxWater;
    }
};
