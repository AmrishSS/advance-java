import java.io.*; 
import java.util.*;
// Read only region start 
class UserMainCode {
    public String secondWordUpperCase(String input1){
        String[] words = input1.split("\\s+");
        if (words.length < 2) {
            return "LESS";
        }
        return words[1].toUpperCase();
    }
}