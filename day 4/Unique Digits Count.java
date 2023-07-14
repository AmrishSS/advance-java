import java.util.HashSet;
import java.util.Set;

class UserMainCode {
    public int uniqueDigitsCount(int input1) {
        Set<Integer> uniqueDigits = new HashSet<>();
        
        while (input1 > 0) {
            int digit = input1 % 10;
            uniqueDigits.add(digit);
            input1 /= 10;
        }
        
        return uniqueDigits.size();
    }
}
