

public class P04 {

	public static void main(String[] args) {
		
		
		
		int i = 35;
		long l = i;
		double d = l;
		
		System.out.println("Widening :"+i+"->"+l+"->"+d);
		
		double dValue=85.55;
		int iValue = (int)dValue;
		System.out.println("Narrowing : "+dValue+"->"+iValue);
		
		char ch ='A';
		int  cvalue = ch;
		System.out.println("'A' code :"+cvalue);
		int cint = 66;
        char ch2 = (char) cint; 
        System.out.println(cint +" char : "+ ch2);
		
		

	}

}
