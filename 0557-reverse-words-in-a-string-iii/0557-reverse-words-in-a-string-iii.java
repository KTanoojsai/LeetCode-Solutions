class Solution {
    public String reverseWords(String s) {
        String a[] = s.trim().split("\\s+");
        for (int i = 0; i < a.length; i++) {
            char q[] = a[i].toCharArray();
            int l = 0, r = q.length - 1;
            while (l < r) {
                char temp = q[l];
                q[l] = q[r];
                q[r] = temp;
                l++;
                r--;
            }
            a[i] = new String(q);
        }
        return String.join(" ", a);
    }
}