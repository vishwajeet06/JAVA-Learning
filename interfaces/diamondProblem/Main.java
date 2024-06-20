package interfaces.diamondProblem;
// scenario of multiple inheritance
public class Main {
    public static void main(String[] args) {
        Crocodile obj = new Crocodile();
        System.out.println(obj.canBreathe());
        // compiler confused while calling method canBreath() from which class like Land and water both have canBreathe method
        obj.canBreathe();
    }
}
