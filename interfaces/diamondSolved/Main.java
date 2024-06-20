package interfaces.diamondSolved;

// 1. Methods in interfaces are implicitly public and abstract unless declared as default or static.
// 2. An interface can extend multiple interfaces using a comma-separated list.
// 3. Using an interface, we can achieve full abstraction, meaning we define WHAT a class must do but not HOW it will do it.
// 4. You cannot create an object of an interface directly but can create an object of a concrete class that implements the interface.
// 5. Interfaces support multiple inheritance.
// 6. Interfaces are a way to achieve abstraction in Java.
// 7. An interface can be used as a type to hold a reference to an object of a class that implements the interface, which helps in achieving polymorphism. Method calls are resolved at runtime.
// 8. (Redundant as it repeats point 5) Interfaces allow a class to inherit from multiple interfaces.
// 9. An interface typically contains method signatures (abstract methods) only, but can also have default and static methods since Java 8.

public class Main {
    public static void main(String[] args) {
        Crocodile obj = new Crocodile(); // no issue after method declared inside interface
        // get required method while runTime evironment
        System.out.println(obj.canBreathe());
    }

}
