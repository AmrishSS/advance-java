import java.io.*;
import java.util.*;
// Read only region start
class UserMainCode
{
    public int NthPrime (int input1){
        	int num = 2; // Start with the first prime number
    
    while (count < input1) {
      if (isPrime(num)) {
        count++;
        if (count == input1) {
          return num; // Return the Nth prime number
        }
      }
      num++;
    }
    
    return -1; // If N is out of bounds, return -1
  }
  
  // Function to check if a number is prime
  private boolean isPrime(int n) {
    if (n <= 1) {
      return false;
    }
    
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    
    return true;
	}
}