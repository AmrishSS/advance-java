import java.io.*;
import java.util.*;
// Read only region start class UserMainCode
class UserMainCode
{
public int EvenOddDigitsSum(int input1,String input2){
    int sum = 0;
        boolean isEvenOption = input2.equals("even");
        while (input1 > 0) {
            int digit = input1 % 10;
            if ((digit % 2 == 0 && isEvenOption) || (digit % 2 != 0 && !isEvenOption)) {
                sum += digit;
            }
            input1 /= 10;
        }
        return sum;
    }
}