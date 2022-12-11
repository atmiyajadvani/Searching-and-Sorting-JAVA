import java.util.*;

public class LinearSearch_SimpleVersion {

    public static void main(String[] args) {

        int[] ListOfIntegers = {1,2,25,200,88};
        int target = 25;
        System.out.println(linearSearch(ListOfIntegers, target));

    }

    public static int linearSearch(int[] list, int target){
        for (int i = 0; i < list.length; i++) {
            if(list[i] == target){
                return i;
            }
        }
        return -1;
    }

}