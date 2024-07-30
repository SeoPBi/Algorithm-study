import java.util.Scanner;

public class S240730 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();

        String b = Double.toString(a);

        String[] parts = b.split("\\.");

        System.out.printf("%s\n%s", parts[0], parts[1]);
    }
}
