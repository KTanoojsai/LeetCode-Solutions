class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int l=0,r=n-1;
        int a[]=new int[n];
        for(int i=n-1;i>=0;i--)
        {
            int lsq=nums[l]*nums[l];
            int rsq=nums[r]*nums[r];
            if(lsq>rsq)
            {
                a[i]=lsq;
                l++;
            }
            else
            {
                a[i]=rsq;
                r--;
            }
        }
        return a;
    }
}