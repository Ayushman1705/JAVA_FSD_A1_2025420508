import java.util.Scanner;
public class P06 {
	public static void main(String[] argus)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter temp in Celcius");
		double c = sc.nextDouble();
		
		double f = (c*(9/5.0))+32;
		
		System.out.println(c+"C = "+ f+"F");
		
		System.out.println("Enter temp in Farenheit");
		double fr = sc.nextDouble();
		
		double cel = (fr-32)*(5/9.0);
		
		System.out.println(fr+"F ="+cel+"C");
	
	    sc.close();
	}
	

}
