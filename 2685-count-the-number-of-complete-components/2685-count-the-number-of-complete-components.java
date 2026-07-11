class Solution {
    static int V;
    static int D;
    public int countCompleteComponents(int n, int[][] edges) {
       ArrayList<Integer>[] Adj = new ArrayList[n];
       for(int i=0;i<n;i++)
       {
        Adj[i]=new ArrayList<>();
       }
       for (int[] e : edges) {
            Adj[e[0]].add(e[1]);
            Adj[e[1]].add(e[0]);
        }

        boolean[] vis = new boolean[n];
        int res = 0;

        for (int i = 0; i < n; i++) {
            boolean state = vis[i];

            if (!state) {
                V = 0; D = 0;

                dfs(i, Adj, vis);

                if (D == V * (V - 1)) res++;
            }
        }

        return res;
    }

    private void dfs(int x, List<Integer>[] Adj, boolean[] vis) {
        V++;
        D += Adj[x].size();
        vis[x] = true;

        for (int state : Adj[x])
            if (!vis[state])
                dfs(state, Adj, vis);
       

    }
}