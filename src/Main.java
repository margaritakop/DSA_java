import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {


    public static void main(String[] args) {

        //make a random array of given length
        int arrayLength = 10;
        int[] array = generateRandomArray(arrayLength);
        System.out.println("Sorted random array from 1 to " + arrayLength + " :");
        System.out.println(Arrays.toString(array));

        //select a number randomly for searchNumber
        int searchNumber = getRandom(array);
        System.out.println("Searching for: " + searchNumber);

        //Search for the target searchnumber in the array
        long linearSearchTime = LinearSearch.searchTime(array, searchNumber);
        System.out.println("Time of Linear search was " + linearSearchTime + " ms");
        long binarySearchTime = BinarySearch.searchTime(array, searchNumber);
        System.out.println("Time of Binary search was " + binarySearchTime + " ms");
    }

    public static int[] generateRandomArray(int n){
        ArrayList<Integer> list = new ArrayList<Integer>(n);
        Random random = new Random();

        for (int i = 0; i < n; i++)
        {
            list.add(random.nextInt(n)+1);
            Collections.sort(list);
        }

        int[] array = list.stream().mapToInt(i -> i).toArray();

        return array;
    }

    public static int getRandom(int[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }
}
