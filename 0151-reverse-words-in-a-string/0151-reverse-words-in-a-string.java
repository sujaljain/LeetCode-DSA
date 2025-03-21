class Solution {
    public String reverseWords(String s) {
        char[] str = s.toCharArray();
        int n = str.length;

        // Step 1: Reverse the entire string character by character
        reverse(str, 0, n - 1);

        // Step 2: Reverse each word in-place
        int i = 0, j = 0;
        while (j < n) {
            while (j < n && str[j] == ' ')
                j++; // Skip Spaces

            i = j; // Found the starting of word

            while (j < n && str[j] != ' ')
                j++; // Till the word ends

            reverse(str, i, j - 1); // Reverse Each word now
        }

        // Step 3: Remove extra spaces & rebuild result
        return cleanSpaces(str);
    }

    public void reverse(char[] str, int left, int right) {
        while (left < right) {
            char temp = str[left];
            str[left++] = str[right];
            str[right--] = temp;
        }
    }

    public String cleanSpaces(char[] str) {
        int i = 0, j = 0, n = str.length;

        while (j < n) {
            while (j < n && str[j] == ' ')
                j++; // Skip (Leading) Spaces
            while (j < n && str[j] != ' ')
                str[i++] = str[j++]; // Copy word
            while (j < n && str[j] == ' ')
                j++; // Skip (Trailing) Spaces Again

            if (j < n)
                str[i++] = ' '; // Keep only one space
        }

        return new String(str, 0, i);
    }
}