import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Kernel k = new Kernel();
        while (true)
        {
            String command = in.nextLine();
            k.run(command);
        }
    }
}