package interfaces.FunctionalInterface;

@FunctionalInterface
public interface FunctionInterfaceL {
    // only one abstract method
    // single abstract method

    void canFly(String value);

    // showing error when we create more than one abstract method
    // void canEat(String value); 

    // default method
    default void getHeight() {
        System.out.println("Tell me the height default method");
    }

    // static method
    static void canEat() {
        System.out.println("Can yout Eat static method");
    }

    // object class method hashCOde, toString, equal
    // method inherited from other class
    String toString();
    

}
