import java.util.concurrent.TimeUnit;

public class LinearSearch {
    public static long searchTime (int[] arraySorted, int searchNumber){
        //result returned is the time that it took to fin the searchNumber in the arraySorted.
        //if not fount it should return NaN

        //iterate through the array and chack if elements equal the search Number
        int time = 0; //set timer to 0


// Program to measure elapsed time in Java

                long startTime = System.currentTimeMillis();

                /* ... the code being measured starts ... */
                for (int num : arraySorted){
                    if (num == searchNumber){
                        //return time;
                        long endTime = System.currentTimeMillis();
                        long timeElapsed = endTime - startTime;
                        System.out.println("Execution time in milliseconds: " + timeElapsed);
                        return timeElapsed;
                    }
                }

        return 1; //should return something meaningful if searchNumber is not in the array
    }


}