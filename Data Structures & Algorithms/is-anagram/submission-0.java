class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> freq1 = new TreeMap<>();
        Map<Character, Integer> freq2 = new TreeMap<>();
        for(int i=0; i<s.length(); i++){
            freq1.merge(s.charAt(i), 1, Integer::sum);
        }
        for(int j=0; j<t.length(); j++){
            freq2.merge(t.charAt(j), 1, Integer::sum);
        }
        return freq1.equals(freq2);

    }
}
