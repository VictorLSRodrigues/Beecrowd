import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    double a = sc.nextDouble();
	    double b = sc.nextDouble();
	    double media = (a * 3.5 + b * 7.5) / 11;
	    
		System.out.println(String.format("MEDIA = %.5f",media));
	}
}
