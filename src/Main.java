import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {


    public static void main(String[] args) {

        //make a random array of given lengths
        int[] arrayLengths = {10, 100, 10000, 100000, 1000000, 5000000, 10000000,
                15000000, 20000000, 25000000, 30000000, 35000000,
                40000000, 45000000, 50000000, 55000000, 60000000};

        ArrayList<String > results = new ArrayList<String>();

        for (int arrayLength : arrayLengths) {
            results.add(Integer.toString(arrayLength));

            long[] times = searchLinBin(arrayLength);
            System.out.println(Arrays.toString(times));
            for (long time: times){
                results.add(Long.toString(time));
            }
        }

        CsvWriter.write(results);
    }

    public static long[] searchLinBin(int arrayLength){
        System.out.println("Generating sorted random array from 1 to " + arrayLength);
        int[] array = generateRandomArray(arrayLength);
        //System.out.println(Arrays.toString(array));

        //select a number randomly for searchNumber
        int searchNumber = getRandom(array);
        System.out.println("Searching for: " + searchNumber);

        //Search for the target searchnumber in the array
        long linearSearchTime = LinearSearch.searchTime(array, searchNumber);
        System.out.println("Time of Linear search was " + linearSearchTime + " ms");
        long binarySearchTime = UtilBinarySearch.searchTime(array, searchNumber);
        System.out.println("Time of Binary search was " + binarySearchTime + " ms");

        long[] searchTimes = {linearSearchTime, binarySearchTime};
        return searchTimes;
    }

    public static int[] generateRandomArray(int n){
        ArrayList<Integer> list = new ArrayList<Integer>(n);
        Random random = new Random();

        for (int i = 0; i < n; i++)
        {
            list.add(random.nextInt(n)+1);
        }

        Collections.sort(list);

        int[] array = list.stream().mapToInt(i -> i).toArray();

        return array;
    }

    public static int getRandom(int[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }
}
