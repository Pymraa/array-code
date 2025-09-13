import java.util.Scanner;

public class methodoverloading {
    static double area(int r) {
        return 3.14 * r * r;
    }

    static int area(int l, int w) {
        return l * w;
    }

    static int areaSquare(int s) {
        return s * s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter radius: ");
        int r = sc.nextInt();
        System.out.println("circle area = " + area(r));

        System.out.print("enter length and width: ");
        int l = sc.nextInt();
        int w = sc.nextInt();
        System.out.println("rectangle area = " + area(l, w));

        System.out.print("enter side: ");
        int s = sc.nextInt();
        System.out.println("square area = " + areaSquare(s));
    }
}

