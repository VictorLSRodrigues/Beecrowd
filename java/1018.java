import java.util.Scanner;
//import java.text.DecimalFormat;
public class Main
{
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	  //DecimalFormat Df = new DecimalFormat();
	  //Df.applyPattern("0,#");
	  int A = sc.nextInt();
	  
	    int[] arrayCedulas = {100,50,20,10,5,2,1};
	
	    
	  System.out.println(A);
	  for(int i = 0;i < 7;i++){
	      
	    
	   int Nc = A / arrayCedulas[i];
	   A =  A - Nc * arrayCedulas[i];
	      System.out.println(Nc + " nota(s) de R$ " + arrayCedulas[i]+ ",00");
	      
	  } 
	}
}
