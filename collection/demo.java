package collection;

import java.util.ArrayList;
import java.util.Collection;

public class demo {
    public static void main(String[] args) {

        Collection<String> fruit = new ArrayList<>();
        fruit.add("Banana"); //adding element to collection
        fruit.add("Apple");
        fruit.add("Mango");
        fruit.add("Guava");
        fruit.add("Grapes");

        System.out.println(fruit);

        fruit.remove("Mango");
        System.out.println(fruit);

        boolean data = fruit.contains("Apple"); //check object present or not > oolean
        if (data) {
            System.out.println("Apple present");
        } else {
            System.out.println("nothing found");
        }


        System.out.println(fruit.isEmpty()); // boolean check collection container
        
        fruit.forEach((element) -> { //iterator which go to all element inside collection container
            System.out.print(element+ ", ");
        });

        fruit.clear();  // clears data inside fruit container and returns empty array []
        System.out.println(fruit);
        
    }
}
