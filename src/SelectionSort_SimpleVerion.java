import java.util.*;

public class SelectionSort_SimpleVerion {

    public static void main(String[] args) {

        int[] ListOfIntegers = {1,2,8,25,200};
        int target = 8;
        System.out.println(SelectionSort(ListOfIntegers));

    }

    public static int SelectionSort(int[] array) {

        // Variable to set the minimum values in the array
        int currentMinimum = 0;
        // Temporary variable that is assigned to the current element while looping
        int currentItem = 0;

        for (int i = 0; i < array.length; i++) {
            currentMinimum = i;

            // Finding the smallest
            for (int j = i + 1; j < array.length; j++) {
                if(array[j] < array[currentMinimum]){
                    currentMinimum = j;
                }

            // Swapping the elements
            currentItem = array[i];
            array[i] = array[currentMinimum];
            array[currentMinimum] = currentItem;
            }
        }

        return currentMinimum;
    }
}

