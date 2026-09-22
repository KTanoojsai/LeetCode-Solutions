class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int n=people.length;
        int l=0,r=n-1;
        int count=0;
        while(l<=r)
        {
            int sum=people[l]+people[r];
            if(sum<=limit)
                l++;
            r--;
            count++;
        }

        return count;
    }
}