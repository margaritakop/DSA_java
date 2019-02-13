import java.util.Arrays;

public class BinarySearch {
    public static long searchTime (int[] arraySorted, int searchNumber){
        //result returned is the time that it took to fin the searchNumber in the arraySorted.

        //set timer
        long startTime = System.currentTimeMillis();

        boolean isSearchNumberFound=false;
        //carry out binary search
        while (isSearchNumberFound == false){
            int midIndex = arraySorted.length/2;
            if (arraySorted[midIndex] == searchNumber){
                isSearchNumberFound = true;
            } else if(arraySorted[arraySorted.length/2] > searchNumber){
                arraySorted = Arrays.copyOfRange(arraySorted, 0, midIndex-1);
            }
        }
        long timeElapsed = System.currentTimeMillis() - startTime;
        return timeElapsed;

        //TODO: handle edge case better when the searchNumber is not found, now it runs 'forever'
    }
}