class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int freq=0;
        int j=0;
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            freq=Math.max(freq,hm.get(ch));
            while((i-j+1)-freq>k)
            {
                char c=s.charAt(j);
                hm.put(c,hm.get(c)-1);
                if(hm.get(ch)==0)
                {
                    hm.remove(ch);
                }
                j++;
            }
            max=Math.max(max,i-j+1);
        }
        return max;
    }
}