import java.util.Scanner;
import java.math.BigInteger;

class Main_2338
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        BigInteger A = new BigInteger(in.nextLine());
        BigInteger B = new BigInteger(in.nextLine());

        System.out.println(A.add(B));
        System.out.println(A.subtract(B));
        System.out.println(A.multiply(B));

        in.close();
    }
}