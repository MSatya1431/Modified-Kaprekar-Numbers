import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'kaprekarNumbers' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER p
     *  2. INTEGER q
     */

    public static void kaprekarNumbers(int p, int q)
    {
    // Write your code here
        boolean b=false;
        for(int i=p;i<=q;i++)
        {
            long a=(long)i*i;
            String s=String.valueOf(a);
            int d=String.valueOf(i).length();
            if(s.length()>1)
            {
                int i1=Integer.parseInt(s.substring(s.length()-d));
                int i2=Integer.parseInt(s.substring(0, s.length()-d));
                if(i1+i2==i)
                {
                    System.out.print(i+" ");
                    b=true;
                }
            }
            else if(a==i)
            {
                System.out.print(i+" ");
                b=true;
            }
        }
        if(!b)
        {
            System.out.print("INVALID RANGE");
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        Result.kaprekarNumbers(p, q);

        bufferedReader.close();
    }
}
