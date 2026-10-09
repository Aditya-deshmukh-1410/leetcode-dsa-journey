import java.util.*;

class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> result = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            map.put(words[i], i);
        }

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int len = word.length();

            for (int j = 0; j <= len; j++) {
                String prefix = word.substring(0, j);
                String suffix = word.substring(j);

                if (isPalindrome(prefix)) {
                    String reversedSuffix =
                        new StringBuilder(suffix).reverse().toString();

                    Integer index = map.get(reversedSuffix);

                    if (index != null && index != i) {
                        result.add(Arrays.asList(index, i));
                    }
                }

                if (j < len && isPalindrome(suffix)) {
                    String reversedPrefix =
                        new StringBuilder(prefix).reverse().toString();

                    Integer index = map.get(reversedPrefix);

                    if (index != null && index != i) {
                        result.add(Arrays.asList(i, index));
                    }
                }
            }
        }

        return result;
    }

    private boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}