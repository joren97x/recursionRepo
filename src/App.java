import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num[5];
        for(int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        for (int num : num) {
            System.out.println(factorial(num));
        }
        System.out.println("Hello Joren!");
        sc.close();
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
