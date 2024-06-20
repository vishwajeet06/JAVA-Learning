package interfaces.nestedInterface;

public class Hen implements Bird.NonFlyingBird{ // accessing the inner interface

    @Override
    public void canRun() {
        // System.out.println("Hen can run");
    }

}
