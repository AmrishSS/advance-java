import java.io.*;
import java.util.*;
// Read only region start
class UserMainCode {
    public int isPalinNumPossible (int input1){
        Map<Integer, Integer> digitCount = new HashMap<>();
        while (input1 > 0) {
            int digit = input1 % 10;
            digitCount.put(digit, digitCount.getOrDefault(digit, 0) + 1);
            input1 /= 10;
        }
        int oddCount = 0;
        for (int count : digitCount.values()) {
            if (count % 2 != 0) {
                oddCount++;
                if (oddCount > 1) {
                    return 1; 
                }
            }
        }
        return 2; 
    }
}