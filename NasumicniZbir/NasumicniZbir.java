import java.util.Scanner;

public class NasumicniZbir {

	public static void main(String[] args) {
		Scanner unos=new Scanner(System.in);
		int a=(int) (Math.random()*10);
		int b=(int) (Math.random()*10);
		int zbir=a+b;
		System.out.println("Koliko je "+a+"+"+b+"?");
		
		int korisnik=unos.nextInt();
		if(korisnik==zbir)
			System.out.println("Odgovor koji ste unijeli je taèan. Svaka èast!");
		else
			System.out.print("Odgovor koji ste unijeli nije taèan. Taèan odgovor je "+zbir);
		unos.close();
	}

}
