class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int l=0,r=0;
        ArrayList<Integer> al=new ArrayList<>();
        while(l<nums1.length && r<nums2.length)
        {
            
            if(nums1[l]==nums2[r])
            {
                al.add(nums1[l]);
                l++;
                r++;
            }
            else if(nums1[l]<nums2[r])
            {
                l++;
            }
            else
            {
                r++;
            }
        }
        int a[]=new int[al.size()];
        int i=0;
        for(int x: al)
        {
            a[i]=x;
            i++;
        }
        return a;
    }
}
