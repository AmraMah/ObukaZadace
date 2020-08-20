import java.util.Scanner;

public class Svjetlost {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Unesite udaljenost (broj svjetlosnih godina) koliko želite putovati: ");
		double lightYears=scanner.nextDouble();
		//double vLight=299792458; // m / s
		double au=149600000; // km
		//double parsec=3.26; // svjetlosnih godina
		double helios2 = 252792.537; // km / h
		double km=lightYears*9.461e12; // kilometri koje svjetlost preðe za uneseni br sv.god.
		double nAu=km/au;
		double nParsec=nAu*0.0000048481367817;
		double man=km/helios2; // u satima
		
		System.out.println("Broj kilometara koje svjetlost preðe u datom vremenu: " + km);
		System.out.println("Broj AU (astronomical units) koje svjetlost preðe u datom vremenu: " + nAu);
		System.out.println("Broj parseca koje svjetlost preðe u datom vremenu: "+nParsec);
		System.out.println("Koliko bi trebalo nama da preðemo tu udaljenost (pomoæu Helios 2): " + man+" h.");
		scanner.close();
	}

}
