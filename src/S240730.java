import java.util.Scanner;

public class S240730 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();

        for(int i = 0; i < a.length(); i++)
        {
            System.out.println("'" + a.charAt(i) + "'");
        }

        sc.close();
    }
}
