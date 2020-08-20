import java.util.Scanner;
public class Klasa9 {

	public static void main(String[] args) {
		
		Scanner unos=new Scanner (System.in);
		
		System.out.println("Unesite dužinu puta u kilometrima:");
		float km=unos.nextInt();
		System.out.println("Unesite potrošnju auta (koliko km može preæi sa 1 l goiva):");
		float potrosnja=unos.nextFloat();
		System.out.println("Unesite cijenu litre goriva u KM: ");
		float cijena=unos.nextFloat();
		unos.close();
		
		System.out.println("Ukupna cijena putovanja iznosi: " + (km/potrosnja)*cijena+ " KM.");
	}

}
