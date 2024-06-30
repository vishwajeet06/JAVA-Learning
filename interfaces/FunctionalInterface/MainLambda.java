package interfaces.FunctionalInterface;

public class MainLambda {
    public static void main(String[] args) {
        // implemented abstract method using lambda expression
        // contains only 1 abstract method
        Bird eagle = ()->System.out.println("implemented abstract method using lambda expression");;

        eagle.canFly();
    }

}
