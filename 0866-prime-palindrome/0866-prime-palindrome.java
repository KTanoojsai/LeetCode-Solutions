class Solution {
    public int primePalindrome(int n) {
        if (n >= 8 && n <= 11) return 11;
        for (int i = 1; i <= 100000; i++) {
            String s = Integer.toString(i);
            StringBuilder sb = new StringBuilder(s);
            String r = sb.reverse().toString();
            int pal = Integer.parseInt(s + r.substring(1));
            
            if (pal >= n && isPrime(pal)) {
                return pal;
            }
        }
        return -1;
    }
    private boolean isPrime(int x) {
        if (x < 2) return false;
        if (x % 2 == 0) return x == 2;
        for (int d = 3; d * d <= x; d += 2) {
            if (x % d == 0) return false;
        }
        return true;
    }
}