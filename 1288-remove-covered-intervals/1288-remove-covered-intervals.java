class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0] == b[0] ? b[1]-a[1] : a[0]-b[0]);
        int count = 0;
        int maxEnd = 0;
        for(int i = 0; i < intervals.length; i++){
            if(intervals[i][1] > maxEnd){
                count++;
                maxEnd = intervals[i][1];
            }
        }
        return count;
    }
}