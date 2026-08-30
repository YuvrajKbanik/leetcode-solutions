class Solution {
    public int minimumDeletions(int[] nums) {
        int minIndex=0;
        int maxIndex=0;
        int min=nums[0];
        int max = nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
                maxIndex=i;
            }
            if(nums[i]<min)
            {
                min=nums[i];
                minIndex=i;
            }
        }
       int left=0;
       int right =0;
       if(maxIndex<minIndex)
       {
        left =maxIndex;
        right = minIndex;
       }
          else
       {
        left =minIndex;
        right = maxIndex;
       }
int del1 = right+1;
int del2=nums.length-left;
int del3 =left + 1 + (nums.length - right) ;
return Math.min(del1 , Math.min (del2 , del3));
    }
}