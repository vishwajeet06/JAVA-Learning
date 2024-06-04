package collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); // string data store
        
        list.add(null); // add suplicate as well as null value
        list.add("Vishwa");
        list.add("Kumar");
        list.add(null);
        list.add("Computer");

        System.out.println(list); //print in same insertion order

        list.remove(null); // removes 1st element which meet and exit
        System.out.println(list);

        // access elsements from list
        System.out.println(list.get(0)); //using get method index
        System.out.println(list.get(2)); //using get method index 
    }

}
