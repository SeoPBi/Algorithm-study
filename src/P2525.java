import java.util.Scanner;

public class P2525 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();
        int o = sc.nextInt();

        if ((h + (m + o / 60)) < 24)
        {
            if (m + o > 60)
            {
                System.out.printf("%d %d", h + ((m + o) / 60), (m + o) % 60);
            }
            else
            {
                System.out.printf("%d %d", h + ((m + o) / 60), (m + o) % 60);
            }
        }
        else
        {
            System.out.printf("%d %d", (h + ((m + o) / 60)) % 24, (m + o) % 60);
        }
    }
}
