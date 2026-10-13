class Solution {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        java.util.ArrayList<String> result = new java.util.ArrayList<>();

        for (String word : words) {
            String w = word.toLowerCase();
            int row = 0;

            if (row1.indexOf(w.charAt(0)) != -1) {
                row = 1;
            } else if (row2.indexOf(w.charAt(0)) != -1) {
                row = 2;
            } else {
                row = 3;
            }

            boolean valid = true;

            for (int i = 1; i < w.length(); i++) {
                char ch = w.charAt(i);

                if (row == 1 && row1.indexOf(ch) == -1 ||
                    row == 2 && row2.indexOf(ch) == -1 ||
                    row == 3 && row3.indexOf(ch) == -1) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                result.add(word);
            }
        }

        return result.toArray(new String[0]);
    }
}