import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {


    public static void main(String[] args) {

        //make a random array of given length
        int arrayLength = 100;
        int[] array = generateRandomArray(arrayLength);
        System.out.println("Sorted random array from 1 to " + arrayLength + " :");
        System.out.println(Arrays.toString(array));

        //select a number randomly for searchNumber
        int searchNumber = getRandom(array);
        System.out.println("Searching for: " + searchNumber);

        //search for the target searchnumber in the array
        long searchTime = LinearSearch.searchTime(array, searchNumber);
        System.out.println("Time of search was " + searchTime + " ms");

    }

    public static int[] generateRandomArray(int n){
        ArrayList<Integer> list = new ArrayList<Integer>(n);
        Random random = new Random();

        for (int i = 0; i < n; i++)
        {
            list.add(random.nextInt(n));
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
