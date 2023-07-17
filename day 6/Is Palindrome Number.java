import java.io.*;
import java.util.*;
// Read only region start
class UserMainCode {
    public int ispalinNum(int input1){
        int originalNum = input1;
        int reversedNum = 0;

        while (input1 > 0) {
            int digit = input1 % 10;
            reversedNum = reversedNum * 10 + digit;
            input1 /= 10;
        }

        if (originalNum == reversedNum) {
            return 2; // Palindrome
        } else {
            return 1; // Not a palindrome
        }
    }
}
    



