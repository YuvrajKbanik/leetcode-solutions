class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int suffixmin[]=new int [nums.length];
        suffixmin[n-1]=nums[n-1];
        for (int i=n-2; i>=0;i--)
        {
            suffixmin[i] =Math.min(suffixmin[i+1],nums[i]);
        }
        int max=0;
        for(int i=0;i< nums.length ; i++)
        {
            max=Math.max(max,nums[i]);
            if(max - suffixmin[i]<= k)
            {
            return i;
            }
        }
        return -1;
    }
}