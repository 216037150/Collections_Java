import java.util.ArrayList;
import java.util.Collections;  // Import Collections to use sort method
import java.util.Comparator;
import java.util.List;          // Import List

public class myComparator {
    public static void main(String[] args) {
        // Custom comparator to compare integers by their last digit
        Comparator<Integer> myComparator = new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                if (a % 10 > b % 10) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        // Create a list of integers
        List<Integer> myIntegers = new ArrayList<>();
        myIntegers.add(1);
        myIntegers.add(89);
        myIntegers.add(14);
        myIntegers.add(5);
        myIntegers.add(69);   

        // Sort the list using the custom comparator
        Collections.sort(myIntegers, myComparator);

        // Print the sorted list
        System.out.println("Sorted list: " + myIntegers);
    }
}
