import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {


    public static void main(String[] args) {

        //array of rndom integers of given lengths
        //1 - n
        //sort that array
        // pick a number from the assay and set it as the target to search for

        generateRandomArray(10);
        int[] array = {1,2,3,4,5,6,7,8,9};

        System.out.println(LinearSearch.searchTime(array, 3));

        //System.out.println(Arrays.toString(BinarySearch.time(array, 3)));
    }

    public static void generateRandomArray(int n){
        ArrayList<Integer> list = new ArrayList<Integer>(n);
        Random random = new Random();

        for (int i = 0; i < n; i++)
        {
            list.add(random.nextInt(n));
        }
        System.out.println(Arrays.toString(list.toArray()));
        //return list;
    }
}
