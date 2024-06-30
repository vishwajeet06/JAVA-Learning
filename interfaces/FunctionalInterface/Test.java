package interfaces.FunctionalInterface;

// public class Test implements FunctionInterfaceL {
public class Test{
    public static void main(String[] args) {
        // using anonymous function
        Bird eagleObj = new Bird() { 

            @Override
            public void canFly() {
                System.out.println("Eagle object using anonymous class can access method from interface");
            }
            
        };

        // using lambda expression
        Bird fly = () -> System.out.println("Bird can fly");
        // fly.canFly();
        

        // eagleObj.canFly();
    }

    // @Override
    // public void canFly(String value) {
    // }

    

}
