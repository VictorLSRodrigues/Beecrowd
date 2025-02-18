import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	     int a = sc.nextInt();
	     double b = sc.nextDouble();
	     double c = sc.nextDouble();
	     double s = b*c;
	    
		System.out.println(String.format("NUMBER = "+a));
		System.out.println(String.format("SALARY = U$ %.2f",s));
	}
}
