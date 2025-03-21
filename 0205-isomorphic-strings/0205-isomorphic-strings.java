class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }

        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        for (int i=0; i<s.length(); i++){
            char S = s.charAt(i);
            char T = t.charAt(i);

            if (mapST.containsKey(S) && mapST.get(S) != T)  return false;
            if (mapTS.containsKey(T) && mapTS.get(T) != S)  return false;

            mapST.put(S, T);
            mapTS.put(T, S);
        }

        return true;
    }
}