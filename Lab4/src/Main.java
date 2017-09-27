//asdfaa
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main
{

    public static String randomSubstring(String x)
    {





        Random rand = new Random(x.length());

        int start = rand.nextInt(x.length() / 2) ;
        int end = rand.nextInt(x.length());

        String randSubString;

        randSubString = x.substring(start, end + 1);






        return randSubString;




    }

    //
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        try {




            String string1 = scnr.nextLine();
            if (string1.length() <= 1) {
                throw new Exception();
            }
            System.out.println(randomSubstring(string1));


        }
        catch (Exception e)

        {
            System.err.println("Input must be more than 1 character long");

        }
        finally {
            scnr.close();
        }

    }
 }



