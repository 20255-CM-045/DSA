class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int arr[]=new int[colors.length*2];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=colors[i%colors.length];
        }
        int count=0;
        for(int i=2;i<colors.length+2;i++)
        {
            if(arr[i]==arr[i-2]&&arr[i]!=arr[i-1]&&arr[i-1]!=arr[i-2])
            {
                count++;
            }
        }
        return count;
    }
}