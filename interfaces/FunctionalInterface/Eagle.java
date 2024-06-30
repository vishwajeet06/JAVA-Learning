package interfaces.FunctionalInterface;

public class Eagle implements Bird{

    @Override
    public void canFly() {
        System.out.println("Eagle can fly functional interface Bird implemented inside Eagle class");
    }

}
