package interfaces.StaticAndDefaultMethod;

public class Main {
    public static void main(String[] args) {
        Bird eagle = new Eagle();
        // System.out.println(eagle.getMinimunFlyHeight());

        // static method can not be overriden
        // if (Bird.canBreathe()) {
        //     System.out.println("Birds can breathe");
        // }

    }

}
