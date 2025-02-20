import java.util.Scanner;
import java.text.DecimalFormat;
public class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	DecimalFormat Df = new DecimalFormat();
	Df.applyPattern(" 0.000");
	//E
	double A = sc.nextDouble();
	double B = sc.nextDouble();
	double C = sc.nextDouble();
	double Pi = 3.14159;
	//P&S
	double A1 , A2 , A3 , A4 ,A5; 
	
	A1 = (A*C) /2;
	A2 = (C*C)*Pi;
    A3 = (A+B)*C/2;
	A4 = B*B;
	A5 = A*B;
	System.out.println("TRIANGULO:" +Df.format(A1));
	System.out.println("CIRCULO:" + Df.format(A2));
	System.out.println("TRAPEZIO:" + Df.format(A3));
	System.out.println("QUADRADO:" + Df.format(A4));
	System.out.println("RETANGULO:" + Df.format(A5));
	
	}
}
