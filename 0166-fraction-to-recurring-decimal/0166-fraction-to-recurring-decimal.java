import java.util.HashMap;
import java.util.Map;

class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        long num = numerator;
        long den = denominator;

        if (num == 0) {
            return "0";
        }

        StringBuilder result = new StringBuilder();

        if ((num < 0) ^ (den < 0)) {
            result.append("-");
        }

        num = Math.abs(num);
        den = Math.abs(den);

        result.append(num / den);
        long remainder = num % den;
        if (remainder == 0) {
            return result.toString();
        }

        result.append(".");
        Map<Long, Integer> map = new HashMap<>();

        while (remainder != 0) {
            if (map.containsKey(remainder)) {
                int index = map.get(remainder);
                result.insert(index, "(");
                result.append(")");
                break;
            }

        map.put(remainder, result.length());
            remainder *= 10;

            result.append(remainder / den);
            remainder %= den;
        }

        return result.toString();
    }
}