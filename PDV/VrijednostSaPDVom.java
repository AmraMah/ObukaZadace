import java.util.Scanner;

public class VrijednostSaPDVom {

	public static void main(String[] args) {
		// Deklaracija varijabli
		Scanner unos=new Scanner(System.in);
		double vrijednost;
		double pdv;
		double ukupno;
		
		// Tra�i se i pohranjuje vrijednost od korisnika
		System.out.println("Unesite vrijednost:");
		vrijednost=unos.nextDouble();
		unos.close();
		
		//Izra�un pdv-a i kona�ne vrijednosti, ispis rezultata
		pdv=0.17*vrijednost;
		ukupno=vrijednost+pdv;
		
		System.out.print("Vrijednost sa pdv-om je: "+ukupno);

	}

}
