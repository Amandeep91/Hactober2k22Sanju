class Solution {
    public int lengthOfLongestSubstring(String s) {
                 String test = "";
            int maxLength = -1;
            // Return zero if string is empty
            if (s.isEmpty()) {
                return 0;
            }
            // Return one if string length is one
            else if (s.length() == 1) {
                return 1;
            }
            for (char c : s.toCharArray()) {
                String current = String.valueOf(c);
     
                // If string already contains the character
                // Then substring after repeating character
                if (test.contains(current)) {
                    test = test.substring(test.indexOf(current) + 1);
                }
                test = test + String.valueOf(c);
                maxLength = Math.max(test.length(), maxLength);
            }
     
            return maxLength;
        }
}
