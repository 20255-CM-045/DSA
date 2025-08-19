class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:nums)
        {
            hm.put(i,hm.getOrDefault(i,0)+1);
            if(hm.get(i)>1)
            {
                return true;
            }
        }
        return false;
       /* Arrays.sort(nums);
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1])
            {
                return true;
            }
        }
        return false;*/
        /*ArrayList<Integer> al=new ArrayList<>();
        Arrays.sort(nums);
        for(int i:nums)
        {
            if(al.contains(i))
            {
                return true;
            }
            else
            {
                al.add(i);
            }
        }
        return false;*/
       /* HashSet<Integer> hs=new HashSet<>();
        for(int i:nums)
        {
            if(hs.contains(i))
            {
                return true;
            }
            else
            {
                hs.add(i);
            }
        }
        return false;*/
    }
}