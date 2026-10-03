class Solution {
    public String minWindow(String s, String t) {

        if (t.length() > s.length()) return "";

        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        // Frequency of characters required
        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int have = 0;
        int required = need.size();

        int left = 0;
        int start = 0;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);

            window.put(c, window.getOrDefault(c, 0) + 1);

            // Requirement for this character is completely satisfied
            if (need.containsKey(c) &&
                window.get(c).equals(need.get(c))) {
                have++;
            }

            // Shrink the window
            while (have == required) {

                // Update minimum
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char remove = s.charAt(left);

                window.put(remove, window.get(remove) - 1);

                if (need.containsKey(remove) &&
                    window.get(remove) < need.get(remove)) {
                    have--;
                }

                left++;
            }
        }

        return minLen == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + minLen);
    }
}