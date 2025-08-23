class Solution {
    public int findCircleNum(int[][] isConnected) {
       int count=0;
       boolean visit[]=new boolean[isConnected.length];
       for(int i=0;i<isConnected.length;i++)
       {
          if(visit[i]==false)
          {
            count++;
            dfs(i,visit,isConnected);
          }
       }
       return count;
    }
    public static void dfs(int node,boolean visit[],int isConnected[][])
    {
        visit[node]=true;
        for(int i=0;i<isConnected.length;i++)
        {
            if(isConnected[node][i]==1&&visit[i]==false)
            {
                dfs(i,visit,isConnected);
            }
        }
    }
}