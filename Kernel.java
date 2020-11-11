public class Kernel
{
    static String[] memList;

    public static void run(String cmd)
    {
        String[] cmdp = cmd.split("\\s+");
        if (cmdp[0] == "memset")
        {
            try
            {
                memList[Integer.parseInt(cmdp[1])] = cmdp[2];
            }
            finally
            {
                System.out.println("There was an error changing this memory location.");
            }
        }
    }
}