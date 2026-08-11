import java.util.Scanner;
/**
 * 
 */
public class P02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Sum        : " + (a + b));
        System.out.println("Difference : " + (a - b));
        System.out.println("Product    : " + (a * b));
        System.out.println("Quotient   : " + (a / b));
        System.out.println("Remainder  : " + (a % b));
        System.out.println("Exact      : " + ((double) a / b));
        sc.close();
    }
}