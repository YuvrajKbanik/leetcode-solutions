class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        int component[] =new int[nums.length];
        int comp=0;
        for(int i=1;i<nums.length;i++)
        {
            if((nums[i]-nums[i-1])>maxDiff)
            {
                comp++;

            }
            component[i]=comp;
        }
        boolean[] ans=new boolean[queries.length];
        for(int i=0;i<queries.length;i++)
        {
            int u=queries[i][0];
            int v=queries[i][1];
            if(component[u]==component[v])
            {
                ans[i]=true;
            }
            else
            {
                ans[i]=false;
            }
        }
        return ans;
    }
}