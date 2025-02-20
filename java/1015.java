import java.util.Scanner;
import java.text.DecimalFormat;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat Df = new DecimalFormat();
		Df.applyPattern("0.0000");
        double X1 = sc.nextDouble();
        double Y1 = sc.nextDouble();
        double X2 = sc.nextDouble();
        double Y2 = sc.nextDouble();
		
		double M = Math.sqrt(((X2 - X1)*(X2 - X1))+((Y2 - Y1)*(Y2 - Y1)));
		System.out.println(Df.format(M));
		
	}
}
