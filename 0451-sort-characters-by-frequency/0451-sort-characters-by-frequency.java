class Solution {
    public class Pair {
        char ch;
        int count;

        public Pair(char ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    }

    public String frequencySort(String s) {
        // Step 1: Frequency Count
        int[] arr = new int[125]; // Can be 256 for full ASCII support

        for (char ch : s.toCharArray()) {
            arr[ch]++;
        }

        // Step 2: Create a list of character-frequency pairs
        LinkedList<Pair> freqList = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) { // Iterate over all characters
            if (arr[i] > 0) {
                freqList.add(new Pair((char) i, arr[i]));
            }
        }

        // Step 3: Sort the list in descending order of frequency
        Collections.sort(freqList, (a, b) -> b.count - a.count);

        // Step 4: Forming the sorted string
        StringBuilder sb = new StringBuilder();
        for (Pair p : freqList) {
            int count = p.count;
            while (count > 0) {
                sb.append(p.ch);
                count--; // Fix infinite loop issue
            }
        }

        return sb.toString();
    }
}
