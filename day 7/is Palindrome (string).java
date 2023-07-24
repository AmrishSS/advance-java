import java.io.*; 
import java.util.*;
// Read only region start 
class UserMainCode {
    public int isPalindrome (String input1){
        String input = input1.toLowerCase();
        int left = 0;
        int right = input.length() - 1;
        
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return 1;
            }
            left++;
            right--;
        }
        
        return 2;
    }
}