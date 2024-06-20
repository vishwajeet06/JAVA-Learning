package interfaces.StaticAndDefaultMethod;

public interface Bird {

    void canFly(); //abstract method => public abstract void canFly()
     
    // default method
    default void getMinimunFlyHeight() { //public hidden defore default
        canBreathe(); //static method
        myPrivateMethod(); //private method
        myPrivateStaticMethod(); //private static method
    }

    static void canBreathe() {
        myPrivateStaticMethod();  //only static method and variables
    }

    private void myPrivateMethod() {
        System.out.println("myPrivate method from Bird interface");
    }
    
    private static void myPrivateStaticMethod() {
        System.out.println("myPrivate static method from Bird interface");
    }
}
