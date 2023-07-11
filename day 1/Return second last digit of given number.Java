import java.io.*;
import java.util.*;
class UserMainCode{
    public int getSecondLastDigit(int input1) {
    input1 = Math.abs(input1);
    if (input1 < 10) {
        return -1; 
    }
    int secondLastDigit = (input1 / 10) % 10;

    return secondLastDigit;
}