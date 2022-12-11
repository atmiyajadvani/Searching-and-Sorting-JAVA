import java.util.*;

public class BinarySearch_SimpleVersion {

    // find the element in a sorted array
    public static void main(String[] args) {

        int[] ListOfIntegers = {1,2,8,25,200};
        int target = 8;
        System.out.println(binarySearch(ListOfIntegers, target));

    }

    public static int binarySearch(int[] array, int target){

        // Left most index
        int leftHalf = 0;
        // Right most index
        int rightHalf = array.length - 1;

        while(leftHalf < rightHalf) {

            // find the midpoint of the list
            int midPoint = (leftHalf + rightHalf) / 2;

            // if the target is equal to the element at midpoint then return the midpoint
            if (target == array[midPoint]) {
                return midPoint;
            }

            // if the target is smaller than the righthalf becomes midpoint - 1
            if (target < array[midPoint]) {
                rightHalf = midPoint - 1;
            } else {
                // if the target is greater than the lefthalf becomes midpoint + 1
                leftHalf = midPoint + 1;
            }
        }
        return  -1;
    }

}