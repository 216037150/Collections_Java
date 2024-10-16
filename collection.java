package CollectionJava;
import java.util.ArrayList;
import java.util.Collection;
class collection{
    public static void main(String[] args) {

        /*
         Queue ---> First in First Out
         Stack---> Last in First out
         */

        Collection<Integer> numIntegers = new ArrayList<Integer>();

        numIntegers.add(8);
        numIntegers.add(2);
        numIntegers.add(56);
        numIntegers.add(4);
        numIntegers.add(5);

        System.out.println("Size of the collection: " + numIntegers.size());

        System.out.println("Is the collection empty? " + numIntegers.isEmpty());

        System.out.println("Is the collection contains 5? " + numIntegers.contains(5));

        numIntegers.remove(5);
        System.out.println("After removing 5, the collection is: " + numIntegers);


        // Iterate over the collection using enhanced for loop
        for (int n: numIntegers) {
            System.out.println( n);
            }

        numIntegers.clear();
        System.out.println("After clearing the collection, the size is: " + numIntegers.size());

    }
}