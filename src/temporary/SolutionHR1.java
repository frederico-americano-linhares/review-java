package temporary;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.IntStream;

public class SolutionHR1 {

    // Complete the reverseArray function below.
    static int[] reverseArrayStream(int[] array) {
    	
    	return IntStream.rangeClosed(1, array.length)
        .map(i -> array[array.length - i])
        .toArray();
    }
    
    static int[] reverseArrayTraditional(int[] array) {
    	
    	for (int i = 0; i < array.length/2; i++) {
    		int temp = array[i];
    		array[i] = array[array.length - i - 1];
    		array[array.length - i - 1] = temp;    		
    	}
    	return array;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[arrCount];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] resStream = reverseArrayStream(arr);
        
        for (int i = 0; i < resStream.length; i++) {
            bufferedWriter.write(String.valueOf(resStream[i]));

            if (i != resStream.length - 1) {
                bufferedWriter.write(" ");
            }
        }
        bufferedWriter.newLine();
        
        int[] resTrad= reverseArrayTraditional(resStream);

        
        for (int i = 0; i < resTrad.length; i++) {
            bufferedWriter.write(String.valueOf(resTrad[i]));

            if (i != resTrad.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
