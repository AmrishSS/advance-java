import java.io.*;
import  java.util.*;

// Read only region start
class UserMainCode
{

	public class Result{
		public final int output1;
		public final int output2;

		public Result(int out1, int out2){
			output1 = out1;
			output2 = out2;
		}
	}
	
    public Result findOriginalFirstAndSum(int[] input1,int input2){
    	// Read only region end
        //Write code here...
        int[] arr = new int[input2];
        arr[input2 - 1] = input1[input2 -1];
        int sum = arr[input2 - 1];
        for (int i = input2 - 2; i >= 0; i-- ){
            arr[i] = input1[i] - arr[i + 1];
            sum += arr[i];
        }
        return new Result(arr[0], sum );
    }
}