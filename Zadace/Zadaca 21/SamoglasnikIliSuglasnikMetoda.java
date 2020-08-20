import java.util.Scanner;

public class SamoglasnikIliSuglasnikMetoda {
	
	public static void characterIs(char ch) {
		if(Character.isLetter(ch)) {
			char c=Character.toLowerCase(ch);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
				System.out.println(ch+" je samoglasnik.");
			}
			else {
				System.out.println(ch+" je suglasnik.");
			}
		}
		else {
			System.out.println(ch+" predstavlja pogrešan unos.");
		}
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Unesite karakter: ");
		char ch=input.next().charAt(0);
		characterIs(ch);
		input.close();
	}

}
