class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            HashSet<Character> hs=new HashSet<>();
            int count=0;
            for(int j=i;j<s.length();j++)
            {
                char ch=s.charAt(j);
                if(hs.contains(ch))
                {
                    break;
                }
                else
                {
                    hs.add(ch);
                    max=Math.max(max,j-i+1);
                }
            }
        }
        return max;
    }
}