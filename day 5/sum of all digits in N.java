import java.io.*;
import java.util.*;
// Read only region start class UserMainCode
{
public int digitSum(int input1){
    boolean isNegative = false;
        if (input1 < 0) {
            isNegative = true;
            input1 = Math.abs(input1);
        }
        
        // Calculate the digit sum
        while (input1 > 9) {
            int sum = 0;
            while (input1 != 0) {
 sum += input1 % 10;
 input1 /= 10;
            }
            input1 = sum;
        }
        
        // Apply sign to the result
        if (isNegative) {
            return -input1;
        } else {
            return input1;
        }
    }
}  