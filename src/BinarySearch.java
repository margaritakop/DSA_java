import java.util.Arrays;

public class BinarySearch {
    public static long searchTime (int[] arraySorted, int searchNumber){
        //result returned is the time that it took to fin the searchNumber in the arraySorted.

        //set timer
        long startTime = System.currentTimeMillis();


        int start = 0;
        int end = arraySorted.length - 1;

        boolean isSearchNumberFound=false;
        //carry out binary search
        while (isSearchNumberFound == false){
            int midIndex = (end-start)/2 + start;
            if (arraySorted[midIndex] == searchNumber){
                isSearchNumberFound = true;
            }else if(arraySorted[midIndex] > searchNumber){
                end = midIndex-1;
                //arraySorted = Arrays.copyOfRange(arraySorted, 0, midIndex);
            }else if(arraySorted[midIndex] < searchNumber){
                start = midIndex+1;
                //arraySorted = Arrays.copyOfRange(arraySorted, midIndex+1, arraySorted.length);
            }
        }
        long timeElapsed = System.currentTimeMillis() - startTime;
        return timeElapsed;

        //TODO: handle edge case better when the searchNumber is not found, now it runs 'forever'
    }
}