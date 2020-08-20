import java.util.Scanner;

public class PoredjenjeCijene {

	public static void main(String[] args) {
		
		Scanner unos=new Scanner(System.in);
		
		System.out.println("Unesite težinu (kg) i cijenu (KM) prvog paketa kafe: ");
		double tezina1=unos.nextDouble();
		double cijena1=unos.nextDouble();
		
		System.out.println("Unesite težinu (kg) i cijenu (KM) drugog paketa kafe: ");
		double tezina2=unos.nextDouble();
		double cijena2=unos.nextDouble();
		
		double odnosTezina=tezina1/tezina2;
		double odnosCijena=cijena1/cijena2;
		
		if (odnosCijena<odnosTezina) {
			System.out.println("Bolju cijenu ima prvi paket.");
		}
		else if (odnosCijena==odnosTezina) {
			System.out.println("Paketi imaju istu cijenu.");
		}
		else {
			System.out.println("Bolju cijenu ima drugi paket.");
		}
	}

}
