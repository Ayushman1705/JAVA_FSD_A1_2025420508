import java.util.Scanner;
public class P12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter operator (+ - * / %):10");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println(a+" + " + b + " = " +(a+b));
                break;
            case '-':
                System.out.println(a+" - " + b + " = " +(a-b));
                break;
            case '*':
                System.out.println(a+" * " + b + " = "+(a*b));
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    System.out.println(a + "/" + b + " = " +(a/b));
                }
                break;
            case '%':
                if (b == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    System.out.println(a + " % " + b + " = "+(a%b));
                }
                break;
            default:
                System.out.println("Invalid operator");
        }

        sc.close();
    }
}