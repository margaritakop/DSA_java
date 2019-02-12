import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {


    public static void main(String[] args) {


        ArrayList<Integer> randomList =generateRandomArray(100);
        int[] array = randomList.stream().mapToInt(i -> i).toArray();
        System.out.println(Arrays.toString(array));

        //select a number randomly for searchNumber
        int searchNumber = getRandom(array);
        System.out.println(searchNumber);

        System.out.println(LinearSearch.searchTime(array, searchNumber));

        //System.out.println(Arrays.toString(BinarySearch.time(array, 3)));
    }

    public static ArrayList<Integer> generateRandomArray(int n){
        ArrayList<Integer> list = new ArrayList<Integer>(n);
        Random random = new Random();

        for (int i = 0; i < n; i++)
        {
            list.add(random.nextInt(n));
            Collections.sort(list);
        }

        return list;
    }

    public static int getRandom(int[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }
}
