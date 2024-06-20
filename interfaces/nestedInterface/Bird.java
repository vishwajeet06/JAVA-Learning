package interfaces.nestedInterface;

public interface Bird {
    public void canFly();

    public interface NonFlyingBird {
        public void canRun();
    }
}
