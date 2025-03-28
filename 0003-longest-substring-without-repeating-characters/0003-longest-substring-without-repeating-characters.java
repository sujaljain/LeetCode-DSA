class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0;

        while (right < s.length()) {

            char ch = s.charAt(right);

            if (map.containsKey(ch)) {
                // Update left pointer
                left = Math.max(left, map.get(ch) + 1);
            }

            map.put(ch, right);

            // Update MaxLength
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }

        return maxLength;
    }
}