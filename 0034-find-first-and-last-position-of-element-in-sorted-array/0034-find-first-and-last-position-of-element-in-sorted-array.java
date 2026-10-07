class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstpos=first(nums,target);
        if(firstpos==-1) return new int[]{-1,-1};
        int lastpos=last(nums,target);
        return new int[]{firstpos,lastpos};
    }
    public static int first(int nums[],int target)
    {
        int n=nums.length;
        int l=0,h=n-1,res=-1;
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            if(target==nums[mid]){
                h=mid-1;
                res= mid;
            }
            else if(target<nums[mid])
                h=mid-1;
            else 
                l=mid+1;
        }
        return res;
    }
    public static int last(int nums[],int target)
    {
        int n=nums.length;
        int l=0,h=n-1,res=-1;
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            if(target==nums[mid]){
                res= mid;
                l=mid+1;
        }
            else if(target>nums[mid])
                l=mid+1;
            else 
                h=mid-1;
        }
        return res;
    }
}