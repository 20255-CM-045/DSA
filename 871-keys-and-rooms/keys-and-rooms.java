class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean visit[]=new boolean[rooms.size()];
        dfs(0,visit,rooms);
        for(int i=0;i<rooms.size();i++)
        {
            if(visit[i]==false)
            {
                return false;
            }
        }
        return true;
    }
    public static void dfs(int node,boolean visit[],List<List<Integer>> rooms)
    {
        visit[node]=true;
        for(int i:rooms.get(node))
        {
            if(visit[i]==false)
            {
                dfs(i,visit,rooms);
            }
        }
    }
}