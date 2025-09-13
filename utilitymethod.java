
    package ppp;

import java.util.Scanner;

    public class utilitymethod {

        public static int add(int a, int b) {
            return a + b;
        }

        public static int subtract(int a, int b) {
            return a - b;
        }

        public static long multiply(int a, int b) {
            return (long) a * b;
        }

        public static double divide(int a, int b) {
            if (b == 0) {
                System.out.println("cannot divide by zero");
                return 0;
            }
            return (double) a / b;
        }

        public static int max3(int a, int b, int c) {
            int max = a;
            if (b > max) max = b;
            if (c > max) max = c;
            return max;
        }

        public static boolean prime(int n) {
            if (n <= 1) return false;
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) return false;
            }
            return true;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            System.out.print("Enter third number: ");
            int c = sc.nextInt();

            System.out.println("add = " + add(a, b));
            System.out.println("subtract = " + subtract(a, b));
            System.out.println("multiply = " + multiply(a, b));
            System.out.println("divide = " + divide(a, b));
            System.out.println("max of three = " + max3(a, b, c));
            System.out.println(a + " prime? " + prime(a));
            System.out.println(b + " prime? " + prime(b));
            System.out.println(c + " prime? " + prime(c));

            sc.close();
        }
    }


