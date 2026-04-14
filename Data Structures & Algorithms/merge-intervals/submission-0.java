class Solution {
    public int[][] merge(int[][] intervals) 
    {
        ArrayList<int[]> ans = new ArrayList<>();
        int n = intervals.length;

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        for(int i = 0;i<n;i++)
        {
            if(ans.isEmpty() || ans.get(ans.size() - 1)[1] < intervals[i][0])
            {
                ans.add(intervals[i]);
            }

            else
            {
                ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() - 1)[1], intervals[i][1]);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
