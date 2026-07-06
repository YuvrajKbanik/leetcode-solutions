class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> {
    if (a[0] == b[0]) {
        return b[1] - a[1];
    } else {
        return a[0] - b[0];
    }
});
int count =0;
int endmax=0;
for(int [] i : intervals)
{
    if(i[1] >endmax)
    {
        count++;
        endmax=i[1];
    }
}
return count;
}
}