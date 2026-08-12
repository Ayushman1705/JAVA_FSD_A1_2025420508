import java.util.Scanner;
public class P07 {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal: ");
        double p = sc.nextDouble();
        System.out.print("Enter rate (% p.a.): ");
        double r = sc.nextDouble();
        System.out.print("Enter time (years): ");
        double t = sc.nextDouble();
        double si = (p * r * t) / 100.0;
        double ci = p * Math.pow(1 + r / 100.0, t) - p;
        double amount = p + ci;
        
        System.out.println("Simple Interest   = "+ si);
        System.out.println("Compound Interest = "+ ci);
        System.out.println("Maturity (P + CI) = "+ amount);

        sc.close();
    }
}