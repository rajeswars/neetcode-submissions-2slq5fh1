class Solution {
    public int eraseOverlapIntervals(int[][] intervals) 
    {
        int n = intervals.length;
        if(intervals.length == 0) return 0;

        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

        int lastEnd = intervals[0][1];
        int cnt = 0;

        for(int i = 1;i<n;i++)
        {
            if(intervals[i][0] >= lastEnd)
            {
                lastEnd = intervals[i][1];
            }
            else
            {
                cnt++;
            }
        }
        return cnt;
    }
}
