class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int l=0,h=n-1;
        while(l<=h)
        {
            int m=l+(h-l)/2;
            if(target==nums[m])
                return m;
            else if(target<nums[m])
                h=m-1;
            else 
                l=m+1;
        }
        return -1;
    }
}