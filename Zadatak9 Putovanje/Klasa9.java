import java.util.Scanner;
public class Klasa9 {

	public static void main(String[] args) {
		
		Scanner unos=new Scanner (System.in);
		
		System.out.println("Unesite du�inu puta u kilometrima:");
		float km=unos.nextInt();
		System.out.println("Unesite potro�nju auta (koliko km mo�e pre�i sa 1 l goiva):");
		float potrosnja=unos.nextFloat();
		System.out.println("Unesite cijenu litre goriva u KM: ");
		float cijena=unos.nextFloat();
		unos.close();
		
		System.out.println("Ukupna cijena putovanja iznosi: " + (km/potrosnja)*cijena+ " KM.");
	}

}
