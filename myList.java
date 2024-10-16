package CollectionJava;

import java.util.ArrayList;
import java.util.List;

public class myList {
    public static void main(String[] args) {
        List<Integer> myIntegers = new ArrayList<>();
        myIntegers.add(1);
        myIntegers.add(89);
        myIntegers.add(5);
        myIntegers.add(89);   
        
        for(Integer n: myIntegers){
            System.out.println(n);
        }
    }
}
