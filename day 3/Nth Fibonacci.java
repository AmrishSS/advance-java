import java.io.*;
import java.util.*;

// Read only region start
class UserMainCode {
    public long nthFibonacci(int input1) {
        // Read only region end
        // write code here...
        if (input1 <= 0) {
            throw new IllegalArgumentException("Input must be a positive integer");
        }
        
        if (input1 == 1) {
            return 0;
        }
        
        if (input1 == 2) {
            return 1;
        }
        
        long prevPrev = 0;
        long prev = 1;
        long current = 0;
        
        for (int i = 3; i <= input1; i++) {
            current = prevPrev + prev;
            prevPrev = prev;
            prev = current;
        }
        
        return current;
    }
}
