import java.util.Scanner;

public class MapiranjeSlovaUBroj {
	
	public static void letterToNumber(char ch) {
		char c=Character.toUpperCase(ch);
		if(c=='A' || c=='B' || c=='C') {
			System.out.println("Odgovarajuci broj je 2.");
		}
		else if(c=='D' || c=='E' || c=='F') {
			System.out.println("Odgovarajuci broj je 3.");
		}
		else if(c=='G' || c=='H' || c=='I') {
			System.out.println("Odgovarajuci broj je 4.");
		}
		else if(c=='J' || c=='K' || c=='L') {
			System.out.println("Odgovarajuci broj je 5.");
		}
		else if(c=='M' || c=='N' || c=='O') {
			System.out.println("Odgovarajuci broj je 6.");
		}
		else if(c=='P' || c=='Q' || c=='R' || c=='S') {
			System.out.println("Odgovarajuci broj je 7.");
		}
		else if(c=='T' || c=='U' || c=='V') {
			System.out.println("Odgovarajuci broj je 8.");
		}
		else if(c=='W' || c=='X' || c=='Y' || c=='Z') {
			System.out.println("Odgovarajuci broj je 9.");
		}
		else {
			System.out.println(ch+" predstavlja pogresan unos.");
		}
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Unesite slovo: ");
		char letter=input.next().charAt(0);
		letterToNumber(letter);
		input.close();
	}

}
