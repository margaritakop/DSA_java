public class BinarySearch {
    public static long searchTime (int[] arraySorted, int searchNumber){
        //result returned is the time that it took to fin the searchNumber in the arraySorted.

        //set timer
        long startTime = System.currentTimeMillis();

        boolean isSearchNumberFound=false;
        //carry out binary search
        if(isSearchNumberFound == true){
                long timeElapsed = System.currentTimeMillis() - startTime;
                return timeElapsed;
        }
        //TODO: handle edge case better when the searchNumber is not found
        return 404; //the number 404 is returned when the Searchnumber is not found
    }
}