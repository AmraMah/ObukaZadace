import java.util.Scanner;

public class PogodiBroj {

	public static void main(String[] args) {
		
		Scanner unos=new Scanner (System.in);
		int komp= (int) (Math.random()*10)+1;
		System.out.print("Zamislio sam broj izmeðu 1 i 10. Pokušaj pogoditi:  ");
		int kor=unos.nextInt();
		unos.close();
		
		if(kor<komp) {
			System.out.print("Prenisko. Broj koji sam zamislio je "+komp);
		}
		else if(kor>komp) {
			System.out.print("Previsoko. Broj koji sam zamislio je "+komp);
		}
		else {
			System.out.print("Svaka èast! Broj koji sam zamislio je "+komp);
		}

	}

}
