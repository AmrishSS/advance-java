import java.io.*;
import java.util.*;
class UserMainCode {
    public int addLastDigits(int input1, int input2) {
        input1 = Math.abs(input1);
        input2 = Math.abs(input2);
        int lastDigit1 = input1 % 10;
        int lastDigit2 = input2 % 10;
        int sumOfLastDigits = lastDigit1 + lastDigit2;
        return sumOfLastDigits;
    }
}