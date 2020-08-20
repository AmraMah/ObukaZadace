import java.util.Scanner;
public class TrocifrenBroj {

	public static void main(String[] args) {
		Scanner unos=new Scanner (System.in);
		System.out.println("Unesite cijeli trocifren broj ");
		int br=unos.nextInt();
		unos.close();
		int a=br/100;
		int b=br%10;
		if(a==b) {
			System.out.println("Broj "+br+" je palindrom.");
		}
		else {
			System.out.println("Broj "+br+" nije palindrom.");
		}
	}

}
