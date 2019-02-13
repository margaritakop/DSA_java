import java.util.concurrent.TimeUnit;

public class LinearSearch {
    public static long searchTime (int[] arraySorted, int searchNumber){
        //result returned is the time that it took to fin the searchNumber in the arraySorted.

        //set timer
        long startTime = System.currentTimeMillis();
        //iterate through the array and check if elements equal the search Number
        for (int num : arraySorted){
            if (num == searchNumber){
                long timeElapsed = System.currentTimeMillis() - startTime;
                return timeElapsed;
            }
        }
        //TODO: handle edge case better when the searchNumber is not found
        return 404; //the number 404 is returned when the Searchnumber is not found
    }
}