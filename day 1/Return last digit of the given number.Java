import java.io.*;
import java.util.*;
class UserMainCode{
    public static int getLastDigit(int input1) {
        input1 = Math.abs(input1);
        int lastDigit = input1 % 10;
        return lastDigit;
    }
}