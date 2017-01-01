import java.io.IOException;
import java.util.Scanner;
public class Problem1 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		Scanner giris = new Scanner(System.in);
		double x,f,g;
		System.out.println("Lutfen bir sayi giriniz:");
		x = giris.nextDouble();
		if (x>0.0)
		{
			f = 1.0 /(1.0 + Math.log(x));
			g = 1.0 / (x + Math.log(x));
		}
		else
		{
			f = 1.0 / (1.0 + x * x);
			g = 1.0 / (1.0 + x + x * x);
		}
		System.out.println("\nf(x)=" + f);
		System.out.println("\ng(x)=" + g);
		

	}

}
