import java.util.Arrays;

public class UtilBinarySearch {
        public static long searchTime (int[] arraySorted, int searchNumber) {
            //set timer
            long startTime = System.currentTimeMillis();
            Arrays.binarySearch(arraySorted, searchNumber);
            long timeElapsed = System.currentTimeMillis() - startTime;

            return timeElapsed;
        }
    }
