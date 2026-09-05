class Solution {
    public boolean uniformArray(int[] nums1) {
        int minodd=Integer.MAX_VALUE;
        int mineven=Integer.MAX_VALUE;
        for(int i=0;i<nums1.length;i++)
        {
            if(nums1[i]%2==0 && mineven>nums1[i])
            {
                mineven = nums1[i];
            }
            if(nums1[i]%2!=0 && minodd>nums1[i])
            {
                minodd = nums1[i];
            }
        }
        if(minodd<=mineven)
        {
            return true;
        }
        else
        {
            for(int i=0;i<nums1.length;i++)
            {
                if(nums1[i]%2!=0)
                {
                    return false;
                }
            }
            return true;
        }
    }
}