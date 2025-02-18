import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    double  a = sc.nextDouble();
	    double r = (a*a)*3.14159;
	    
		System.out.println(String.format("A=%.4f",r));
	}
}
