import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        
        
        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();

        double PI=22/7;
        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;

        
       // System.out.println();
        System.out.println("Area          = "+ area);
        System.out.printf("Circumference = "+ circumference);

        scanner.close();
    }
}