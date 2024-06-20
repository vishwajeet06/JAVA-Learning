package interfaces;

public class Main {
    public static void main(String[] args) {
        Bird birdOne = new Eagle(); //here bird working as data type
        Bird birdTwo = new Hen();

        birdOne.fly();
        birdTwo.fly(); 
    }
}
