import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class importantMethods {

    public static void main(String[] args) {
        List<Integer> value = new ArrayList<>();
        // added to collection .add()
        value.add(5);
        value.add(8);
        value.add(9);
        value.add(2);
        value.add(7);
        value.add(12);
        value.add(11);
        value.add(5);

        // size
        int size = value.size();
        // System.out.println(size);

        // isEmpty => boolean
        boolean dataPresent = value.isEmpty();
        // System.out.println(dataPresent);

        // contains => check specific value
        boolean itemPresent = value.contains(12);
        // System.out.println(itemPresent);

        // remove using index number
        value.remove(2);
        // for (int i : value) {
        //     System.out.println(i);
        // }

        // removing with object value
        value.remove(Integer.valueOf(5));
        // for (int i : value) {
        //     System.out.println(i);
        // }

        Stack<Integer> stack = new Stack<>();
        stack.add(5);
        stack.add(8);
        stack.add(9);
        stack.add(12);
        stack.add(15);

        // adding stack values collection to another collection using addAll()
        value.addAll(stack);

        // to check all collection value inside other collection
        System.out.println(value.containsAll(stack)); //true

        System.out.println(value.remove(Integer.valueOf(15))); //removing 15
        System.out.println(value.containsAll(stack)); //false removed 15

        //    to empty the collection clear()
    // value.clear();
    }

}
