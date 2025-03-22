class Solution {
    public int romanToInt(String s) {
        // Step 1: Defining the mapping of Roman Numerals to integer values
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        // Step 2: Initialising Variables
        int result = 0;
        int prev = 0;

        // Step 3: Transversing from right to left
        for (int i = s.length(); i >= 0; i--) {
            int curr = romanMap.get(s.charAt(i));

            // Step 4: Checking the subtractive rule
            if (curr < prev) {
                result -= curr;
            } else {
                result += curr;
            }

            prev = curr;
        }

        return result;
    }
}