class Solution {
    public String reverseWords(String s) {
       String c[]=s.trim().split("\\s+");
       int left=0,right=c.length-1;
       while(left<right)
       {
        String temp=c[left];
        c[left]=c[right];
        c[right]=temp;
        left++;
        right--;
       } 
       return String.join(" ",c);
    }
}