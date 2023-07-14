import java.util.*;

class UserMainCode {
    public int countPrimesInRange(int input1, int input2) {
        int count = 0;
        for (int num = input1; num <= input2; num++) {
            if (isPrime(num)) {
                count++;
            }
        }
        return count;
    }

    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
