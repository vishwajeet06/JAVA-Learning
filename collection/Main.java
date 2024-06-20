import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Car[] carArray = new Car[3];

        // carArray[0] = new Car("SUV", "petrol");
        // carArray[1] = new Car("Sedan", "diesel");
        // carArray[2] = new Car("HatchBack", "CNG");
        // comparable
        // compare object value using compareTo {string} 
        // internally swaps on basis of lexicographically
        // Arrays.sort(carArray, (Car O1, Car O2) -> O1.carType.compareTo(O2.carType));

        // Arrays.sort(carArray, (Car O1, Car O2) -> O2.carName.compareTo(O1.carName));

        // for (Car i : carArray) {
        //     System.out.println(i.carName);
        // }
        List<Car> car = new ArrayList<>();
        car.add(new Car("SUV", "petrol"));
        car.add(new Car("Sedan", "diesel"));
        car.add(new Car("HatchBack", "CNG"));

        Collections.sort(car);
        for (Car item : car) {
            System.out.println(item.carName);
        }
    }

}
