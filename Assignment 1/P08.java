import java.util.Scanner;
public class P08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();
        String ans = (n % 2 == 0) ? "Even" : "Odd";
        System.out.println(ans);
        int lastDigit = Math.abs(n) % 10;
        System.out.println("Last digit: " + lastDigit);
        sc.close();
    }
}
