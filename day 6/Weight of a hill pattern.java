import java.io.*;
import java.util.*;

class UserMainCode {
    public int totalHillWeight (int input1, int input2, int input3) 
        int totalWeight = 0;
        int currentLevelWeight = input2;
        for (int i = 1; i <= input1; i++) {
            totalWeight += currentLevelWeight * i;
            currentLevelWeight += input3;
        }
        return totalWeight;
    }
}