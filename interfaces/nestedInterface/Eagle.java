package interfaces.nestedInterface;

public class Eagle implements Bird{ //accessing the outer interface

    @Override
    public void canFly() {
        System.out.println("Eagle can fly");
    }

}
