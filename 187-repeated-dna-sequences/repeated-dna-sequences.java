class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> seen=new HashSet<>();
        HashSet<String> repeated=new HashSet<>();
        for(int i=0;i<=s.length()-10;i++)
        {
            String str=s.substring(i,i+10);
            if(seen.contains(str))
            {
                repeated.add(str);
            }
            else
            {
                seen.add(str);
            }
        }
        List<String> al=new ArrayList<>();
        for(String s1:repeated)
        {
            al.add(s1);
        }
        return al;
    }
}