class Solution {

    private boolean match(Map<Character,Integer> map1 , Map<Character,Integer> map2){
        return map1.equals(map2);
    }

    public boolean checkInclusion(String s1, String s2) {

        Map<Character,Integer> maps1 = new HashMap<>();
        for(int i = 0; i<s1.length(); i++){
            char ch = s1.charAt(i);
            maps1.put(ch, maps1.getOrDefault(ch, 0) + 1);
        }

        int n = s1.length();
        int m = s2.length();

    for (int i = 0; i <= m - n; i++) {
        Map<Character, Integer> map = new HashMap<>();

        for (int j = i; j < i + n; j++) {
            char ch = s2.charAt(j);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        if (match(map, maps1)) {
            return true;
        }
    }
    return false;    
    }
}