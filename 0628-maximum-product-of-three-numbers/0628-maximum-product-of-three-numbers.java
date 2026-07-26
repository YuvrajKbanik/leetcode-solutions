class Solution {
    public int maximumProduct(int[] nums) {
       int l=Integer.MIN_VALUE;
       int sl=Integer.MIN_VALUE;
       int tl=Integer.MIN_VALUE;
       int s=Integer.MAX_VALUE;
       int ss=Integer.MAX_VALUE;
       for (int i=0 ;i<nums.length;i++)
       {
        if(nums[i]>l)
        {
            tl=sl;
            sl=l;
            l=nums[i];
            
        }
        else if (nums[i] > sl)
         {
            tl = sl;
            sl = nums[i];
         } 
         else if (nums[i] > tl)
          {
                tl = nums[i];
            }
        if(nums[i]<s)
        {
            ss=s;
            s=nums[i];
        }
         else if (nums[i] < ss) {
                ss = nums[i];
            }

       }
       
        return Math.max(l*sl*tl,s*ss*l);
}
}