package interfaces.StaticAndDefaultMethod;

public class Eagle implements Bird {
    // cannnot override canBreathe() because of static

    @Override
    public void canFly() {
       
    }

    // @Override
    // public int getMinimunFlyHeight() {
    //     return 55;
    // }

}
