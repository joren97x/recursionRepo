public class App {
    public static void main(String[] args) throws Exception {
       int num = factorial(5);
       System.out.println(num);
    }

    public static int factorial(int x) {
        if(x == 1) {
            return x;
        }
        else {
            return x * factorial(x - 1);
        }
    }

}
