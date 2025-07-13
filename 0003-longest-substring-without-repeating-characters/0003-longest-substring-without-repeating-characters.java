class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0, r = 0, n = s.length();
        int maxLen = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        while (r < n) {
            char ch = s.charAt(r);

            if (map.containsKey(ch)) {
                l = Math.max(l, map.get(ch) + 1);
            }

            map.put(ch, r);
            int len = r - l + 1;
            maxLen = Math.max(len, maxLen);
            r++;
        }

        return maxLen;
    }

    // Brute Force
    // public int lengthOfLongestSubstring(String s) {
    //     int maxLen = 0;
    //     int n = s.length();

    //     for (int i=0; i<n; i++){
    //         boolean hash[] = new boolean[256];
    //         for (int j=i; j<n; j++){
    //             int ascii = s.charAt(j);
    //             if (hash[ascii] == true)
    //             break;
    //             int len = j-i+1;
    //             maxLen = Math.max(len, maxLen);
    //             hash[ascii] = true;
    //         }
    //     }

    //     return maxLen;
    // }
}