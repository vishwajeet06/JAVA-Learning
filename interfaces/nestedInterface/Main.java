package interfaces.nestedInterface;

public class Main {
    public static void main(String[] args) {
        Bird.NonFlyingBird obj = new Hen();
        obj.canRun();

        Bird eagle = new Eagle();
        eagle.canFly();
    }

}
