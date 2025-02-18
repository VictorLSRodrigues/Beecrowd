import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
	    double C = sc.nextDouble();
	    int A1 = sc.nextInt();
		int B2 = sc.nextInt();
	    double C3 =  sc.nextDouble();
	    double D1 = B *C;
		double D2 = B2 *C3;
	    double D3 = D1 +D2;
	System.out.println(String.format("VALOR A PAGAR: R$ %.2f" , D3));
	
	}
}
