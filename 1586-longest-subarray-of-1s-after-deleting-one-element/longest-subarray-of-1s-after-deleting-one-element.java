class Solution {
    public int longestSubarray(int[] nums) {
        int zero=0;
        int j=0;
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                zero++;
            }
            while(zero>1)
            {
                if(nums[j]==0)
                {
                    zero--;
                }
                j++;
            }
            max=Math.max(max,i-j);
        }
        return max;
    }
}