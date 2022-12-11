import java.util.*;

public class MergeSort_SimpleVerion {

    public static void main(String[] args) {

        List<Integer> ListOfIntegers = new int[];
        System.out.println(mergeSort(ListOfIntegers));

        // incomplete

    }

    public static List<Integer> mergeSort(List<Integer> aList){

        if(aList.size() <= 1)
            return aList;

        int midPoint = aList.size() / 2;
        List<Integer> left = new ArrayList<Integer>(aList.subList(0, midPoint));
        List<Integer> right = new ArrayList<Integer>(aList.subList(0, aList.size()));

        left = mergeSort(left);
        right = mergeSort(right);
        aList = merge(left,right);
        return aList;
    }

    public static List<Integer> merge(List<Integer> leftList, List<Integer> rightList){
        ArrayList<Integer> aList = new ArrayList<Integer>();

        while (leftList.size() > 0 && rightList.size() > 0){
            if(leftList.get(0) < rightList.get(0))
                aList.add(leftList.remove(0));
            else
                aList.add(rightList.remove(0));
        }

        if(!leftList.isEmpty())
            aList.addAll(leftList);
        if(!rightList.isEmpty())
            aList.addAll(rightList);

        return aList;
    }
}
