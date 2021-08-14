import java.util.Scanner;

public class Fibonacci {
    
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int N = n.nextInt();
        int x1 = 0;
        int x2 = 1;
        int x3;
        System.out.println(x1);
        for (int i = 0; i < N; i++) {
            System.out.println(x2);
            x3 = x2;
            x2 = x1 + x2;
            x1 = x3;
        }
        n.close();
    }
}
