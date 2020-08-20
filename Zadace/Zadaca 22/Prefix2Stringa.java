import java.util.Scanner;

public class Prefix2Stringa {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Unesite prvi string: ");
		String firstStr=input.nextLine();
		System.out.print("Unesite drugi string: ");
		String secondStr=input.nextLine();
		prefixStr(firstStr, secondStr);
		input.close();		
	}
	
	public static void prefixStr(String first, String second) {
		int strLength;
		String prefix="";
		//na�i kra�i string
		if(first.length()<=second.length()) {
			strLength=first.length();
		}
		else {
			strLength=second.length();
		}
		//provjeriti da li je isti prefiks, do du�ine kra�eg stringa
		for (int i=0; i<strLength; i++) {
			if(first.charAt(i)==second.charAt(i)) {
				prefix+=first.charAt(i);
			}
/*kada nai�e na prvi razli�it karakter, iska�e iz petlje, da ne bi na prefiks
dodao jo� neki isti dalje u stringu ako ima*/
			else {
				break;
			}
		}
		if(prefix.equals("")) {
			System.out.println("Stringovi "+first+" i "+second+" nemaju zajednicki prefiks.");
		}
		else {
			System.out.print("Zajednicki prefiks za dva stringa je: ");
			for(int i=0; i<prefix.length(); i++) {
				System.out.print(prefix.charAt(i));
			}
			
		}
		
	}

}
