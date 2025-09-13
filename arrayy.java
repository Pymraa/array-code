
package ppp;
import java.util.Scanner;


/**
 *
 * @author SP24-BSE-068
 */


public class arrayy{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size for array = ");
         int len = sc.nextInt();
        int[] num = new int[len];
         System.out.println("enter "+len+"amount of elements please = ");
         for(int i = 0 ; i < len ; i++) {
             num[i] = sc.nextInt();
         }


        int sum = 0;
        double average = 0 ;
        int min = num[0];
        int max = num[0];
        int evencount = 0;
        int oddcount = 0;

        for (int i = 0; i < len; i++)
        {
            int numbers = num[i];
            {
                sum+=numbers;
                if(numbers<min)
                {
                    min = numbers;
                }
                if (numbers>max)
                {
                    max=numbers;
                }
                if(numbers%2==0)
                {
                    evencount++;
                }

                  else
                {
                    oddcount++;

                }

                average = (double) sum/len;
            }


        }


        System.out.println("sum is = " + sum );
        System.out.println("max is = " + max  );
        System.out.println("min is = " + min );
        System.out.println("evencount is = " + evencount   );
        System.out.println("odd count  = " + oddcount );
        System.out.println("average  is = " + average );

        for(int i = len-1 ; i>=0 ; i--)
        {
            System.out.print( num[i] + " ");
        }
        System.out.println();

    }
}
   
    

