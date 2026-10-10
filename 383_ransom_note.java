class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];
        int[] count1 = new int[26];

        char[] arr = magazine.toCharArray();
        char[] arr1 = ransomNote.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            count[magazine.charAt(i) - 'a']++;
        }

        for (int j = 0; j < arr1.length; j++) {
            count1[ransomNote.charAt(j) - 'a']++;
        }

        for (int k = 0; k < 26; k++) {
            if (count1[k] > count[k]) {
                return false;
            }
        }

        return true;
    }
}