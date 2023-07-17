import java.io.*;
import java.util.*;
// Read only region start
class UserMainCode {
    public static int createPIN(int input1, int input2, int input3) {
        // Extract the units, tens, and hundreds digits from each input number
        int units1 = input1 % 10;
        int tens1 = (input1 / 10) % 10;
        int hundreds1 = input1 / 100;

        int units2 = input2 % 10;
        int tens2 = (input2 / 10) % 10;
        int hundreds2 = input2 / 100;

        int units3 = input3 % 10;
        int tens3 = (input3 / 10) % 10;
        int hundreds3 = input3 / 100;

        // Find the minimum and maximum values for the units, tens, and hundreds positions
        int minUnits = Math.min(units1, Math.min(units2, units3));
        int minTens = Math.min(tens1, Math.min(tens2, tens3));
        int minHundreds = Math.min(hundreds1, Math.min(hundreds2, hundreds3));
        int maxThousands = Math.max(units1, Math.max(units2, Math.max(units3, Math.max(tens1, Math.max(tens2, Math.max(tens3, Math.max(hundreds1, Math.max(hundreds2, hundreds3))))))));

        // Construct the PIN using the calculated values
        int PIN = minUnits + minTens * 10 + minHundreds * 100 + maxThousands * 1000;

        return PIN;
    }

    public static void main(String[] args) {
        int input1 = 123;
        int input2 = 582;
        int input3 = 175;
        int PIN = createPIN(input1, input2, input3);
        System.out.println("PIN: " + PIN);
    }
}
