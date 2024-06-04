public class PolyTestingOverLoaing {

    int a = 4;
    int b = 6;
    String name = "VIshwa";

    int doSum(int a, int b) {
        return a + b;
    }
    String doSum(String a, String b) {
        return a + b;
    }
    int doSum(int a, int b, int c) {
        return a + b + c;
    }

}

class Test {
    public static void main(String[] args) {
        PolyTestingOverLoaing overloading = new PolyTestingOverLoaing();  // it is based on parameter type
        System.out.println(overloading.doSum(15, 20));
    }
}