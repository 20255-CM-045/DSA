class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1])
            {
                return true;
            }
        }
        return false;
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