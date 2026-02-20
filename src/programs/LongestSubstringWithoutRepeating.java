package programs;

import java.util.HashSet;

public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {

        String str = "abcabcbb";

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;
        int startIndex = 0;

        for (int right = 0; right < str.length(); right++) {


            while(set.contains(str.charAt(right))) {

                set.remove(str.charAt(left));
                left++;
            }

            set.add(str.charAt(right));


            int currentLength = right - left + 1;


            if(currentLength > maxLength) {
                maxLength = currentLength;
                startIndex = left;
            }
        }

        String longestSubstring = str.substring(startIndex, startIndex + maxLength);

        System.out.println("Longest substring: " + longestSubstring);
        System.out.println("Length: " + maxLength);
        System.out.println(set);
    }
}
