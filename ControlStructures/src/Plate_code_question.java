import java.io.IOException;
import java.util.Scanner;

public class Plate_code_question {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		Scanner giris = new Scanner(System.in);
		//String kulanicinin yazdigi;
		int istanbulPlakaKodu = 34;
		int girilenPlakaKodu;
		System.out.println("Istanbul'un plaka kodunu giriniz:");
		girilenPlakaKodu=giris.nextInt();
		if(girilenPlakaKodu == istanbulPlakaKodu )
		{
			System.out.println("Evet! Dogru Yanit");
		}
		else
		{
			System.out.println("Hayir, Istanbul'un plaka kodu 34'tur ");
		}
		
		
		

	}

}
