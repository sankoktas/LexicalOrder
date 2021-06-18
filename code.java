/** Reads three strings and sorts them lexicographically.
 * @author (Fikri Şan Köktaş)
 * @version (16 December 2020)*/
import java.util.Scanner;
public class KFS_LexicalOrder_Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your first string: ");
        String s1 = in.nextLine();
        System.out.print("Enter your second string: ");
        String s2 = in.nextLine();
        System.out.print("Enter your third string: ");
        String s3 = in.nextLine();
        int a = s1.compareTo(s2);
        int b = s1.compareTo(s3);
        if (a < 0 && b < 0 && b < a)
        {
            System.out.println(s1 + " " + s2 + " " + s3);
        }
        else if (a < 0 && b < 0 && a < b)
        {
            System.out.println(s1 + " " + s3 + " " + s2);
        }
        else if (a > 0 && b > 0 && a > b)
        {
            System.out.println(s2 + " " + s3 + " " + s1);
        }
        else if (a > 0 && b > 0 && b > a)
        {
            System.out.println(s3 + " " + s2 + " " + s1);
        }
        else if (a > 0 && b < 0)
        {
            System.out.println(s2 + " " + s1 + " " + s3);
        }
        else if (b > 0 && a < 0)
        {
            System.out.println(s3 + " " + s1 + " " + s2);
        }
        else
        {
            System.out.println("There is no ordering for these three words, they may be same");
        }
    }
}
