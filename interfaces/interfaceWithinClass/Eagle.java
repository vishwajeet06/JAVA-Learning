package interfaces.interfaceWithinClass;

public class Eagle implements Bird.NonFlyingBird{

    @Override
    public void canRun() {
        System.out.println("Eagle can fly");
    }

}
