import java.util.*;

public class pr_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = sc.nextInt();

        check(num1, num2);
        sc.close();
    }

    public static void check(int a, int b) {
        if (a % 10 == b % 10)
            System.out.println("true");

        else
            System.out.println("false");
    }

}