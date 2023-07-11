import java.util.*;

// Read only region start
class UserMainCode {
    public int countOdds(int input1, int input2, int input3, int input4, int input5) {
        // Read only region end
        // write code here...
        int oddCount = 0;
        
        if (input1 % 2 != 0) {
            oddCount++;
        }
        
        if (input2 % 2 != 0) {
            oddCount++;
        }
        
        if (input3 % 2 != 0) {
            oddCount++;
        }
        
        if (input4 % 2 != 0) {
            oddCount++;
        }
        
        if (input5 % 2 != 0) {
            oddCount++;
        }
        
        return oddCount;
    }
}
