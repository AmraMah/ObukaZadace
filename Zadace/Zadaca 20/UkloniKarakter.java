import java.util.Scanner;

public class UkloniKarakter {
	
	
	public static String ukloniKarakter(String str, char ch) {
		String removedCh="";
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i)!=ch)	removedCh+=str.charAt(i);
		}
		return removedCh;
	}

	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Unesite string: ");
		String str=input.nextLine();
		String newStr=str;
		if(str.equals("")) {
			System.out.println("Niste ništa unijeli.");
		}
		else {
			System.out.println("Unesite karakter koji zelite ukloniti:");
			String chStr=input.next();
			char c=chStr.charAt(0);
			if(chStr.charAt(0)==' ') {
				newStr=newStr.replaceAll("\\s", "");
			}
			else {
				newStr=ukloniKarakter(str, c);
			}
			for(int i=0; i<newStr.length(); i++) {
				System.out.print(newStr.charAt(i));
			}
		}		
		input.close();
	}

}
