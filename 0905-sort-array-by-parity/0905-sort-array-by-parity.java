class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int l=0,r=n-1;
        while(l<r)
        {
            if(nums[l]%2!=0 && nums[r]%2==0)
            {
                int t=nums[l];
                nums[l]=nums[r];
                nums[r]=t;
                l++;
                r--;
            }
            else if(nums[l]%2==0 && nums[r]%2==0)
                l++;
            else
                r--;
        }
        return nums;
    }
}