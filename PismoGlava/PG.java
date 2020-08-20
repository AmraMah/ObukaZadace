import java.util.Scanner;

public class PG {

	public static void main(String[] args) {
		
		Scanner unos=new Scanner(System.in);
		
		System.out.println("Unesite ishod bacanja novcica (0 - pismo, 1 - glava).");
		int korisnik=unos.nextInt();
		
		int kompjuter= (int) (Math.random()*2);
		
		if(korisnik==kompjuter) {
			System.out.println("Svaka èast, pogodili ste! :)");
		}
		else if ((korisnik != kompjuter) && (kompjuter==0) ){
			System.out.println("Pogriješili ste, ishod je pismo :(");
		}
		else {
			System.out.println("Pogriješili ste, ishod je glava :(");
		}

	}

}
