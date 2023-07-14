import java.util.HashMap;
import java.util.Map;

class UserMainCode {
    public int nonRepeatDigitsCount(int input1) {
        Map<Integer, Integer> digitCount = new HashMap<>();
        
        while (input1 > 0) {
            int digit = input1 % 10;
            if (digitCount.containsKey(digit)) {
                digitCount.put(digit, digitCount.get(digit) + 1);
            } else {
                digitCount.put(digit, 1);
            }
            input1 /= 10;
        }
        
        int count = 0;
        for (int freq : digitCount.values()) {
            if (freq == 1) {
                count++;
            }
        }
        
        return count;
    }
}
