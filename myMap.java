package CollectionJava;
import java.util.HashMap;
import java.util.Map;

class myMap{
    public static void main(String[] args) {
        Map<String, Integer> Students = new HashMap<String, Integer>();
        // WE USE PUT TO ADD SOME VALUES 
        Students.put("John", 60 );
        Students.put("Alice", 80 );
        Students.put("Bob", 75 ); 

        System.out.println("Students: " + Students);


        System.out.println(Students.keySet());
        for(String key: Students.keySet()){
            System.out.println(key + ": " + Students.get(key));
        }
    }
}