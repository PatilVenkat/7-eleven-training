import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        int result;
        System.out.println("enter the input");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("enter the choice 1.addition  2.subtraction  3.multiplication  4.division 5. modulus ");
        int choice = sc.nextInt();
        if (a < 0 && b < 0) {
            System.out.println("negative number not allowed");
        }
        if (choice == 1) {
            result = a + b;
            System.out.println("addition is  " + result);
        } else if (choice == 2) {

            result = a - b;
            System.out.println("subtraction is " + result);
        } else if (choice == 3) {
            result = a * b;
            System.out.println("multiplication is  " + result);
        } else if (choice == 4) {
            if (b > a) {
                System.out.println("invalid input");
            }
            result = a / b;
            System.out.println("division is " + result);
        } else if (choice == 5) {
            if (b == 0) {
                System.out.println("invalid input");
            }
            result = a % b;
            System.out.println("modulus is " + result);
        }
sc.close();
    }
}
