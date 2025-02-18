import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	     sc.next();
	     double a = sc.nextDouble();
	     double b = sc.nextDouble();
	     double c = a+b/6.6666;
		System.out.println(String.format("TOTAL = R$ %.2f",c));
	}
}
