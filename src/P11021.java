import java.util.Scanner;

public class P11021 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        for(int i = 1; number >= i; i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Case #" + i + ": " + (a + b));
        }

        sc.close();
    }
}
