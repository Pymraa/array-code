package pizza;

import java.util.Scanner;
public class pizza {
    public static void main (String []args){

        Scanner scanner = new Scanner (System.in);

        String pizzasize;
        int price = 0;

        while(true)
        {
            System.out.print("Enter piza size (only small/medium/large) = ");
            pizzasize = scanner.nextLine().toLowerCase();

            if (pizzasize.equals("small"))


            {
                price = 100;
                break;
            }
            else  if (pizzasize.equals("medium"))
            {
                price = 200;
                break;
            }
            else if (pizzasize.equals("large"))
            {
                price = 300;
                break;
            }
            else
            {
                System.out.print("invalid ! enter again = ");

            }
        }

        while(true)
        {
            System.out.print("do you want pepporoni (yes/no) = ");
            String pp = scanner.nextLine().toLowerCase();


            if(pp.equals("yes"))
            {
                if (pizzasize.equals("small"))


                {
                    price+=30;
                }
                price+=50;
                break;
            }

            else if (pp.equals("no"))
            {
                break;
            }
            else
            {
                System.out.print("enter valid answer = ");

            }
        }

        while (true)
        {
            System.out.print("do you want cheese (yes/no) = ");
            String cheese = scanner.nextLine().toLowerCase();


            if(cheese.equals("yes"))
            {
                if(pizzasize.equals("small"))

                {
                    price+=30;
                }
                price+=50;
                break;
            }

            else if (cheese.equals("no"))
            {
                break;
            }
            else
            {
                System.out.print("enter valid answer = ");

            }




        }
        System.out.print("bill = " +price);





    }
}
