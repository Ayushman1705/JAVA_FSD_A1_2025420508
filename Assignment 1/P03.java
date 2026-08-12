import java.util.Scanner;
public class P03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a: ");
		int a = scanner.nextInt();
		System.out.print("Enter b: ");
        int b = scanner.nextInt();
		
        System.out.println("Before: a="+ a +",b="+b);
        
        a=a+b;
        b=a-b;
        a=a-b;
        
        System.out.println("After : a="+ a +",b="+b);
        scanner.close();
	}

}
