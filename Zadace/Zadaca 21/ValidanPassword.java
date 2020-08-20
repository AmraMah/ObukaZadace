import java.util.Scanner;

public class ValidanPassword {
	
	public static int countDigits(String s) {
		int counter=0;
		for(int i=0; i<s.length(); i++) {
			if(Character.isDigit(s.charAt(i))) {
				counter++;
			}
		}
		return counter;
	}
		
	public static boolean passValid(String password) {
		boolean valid=true;
		if(password.length()<8) {
			valid=false;
		}
		else {
			for(int i=0; i<password.length(); i++) {
				char c=password.charAt(i);
				if(!(Character.isDigit(c) || Character.isLetter(c)) || (countDigits(password)<2)) {
					valid=false;
				}
			}
		}			
		return valid;
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Unesite password: ");
		String psw=input.nextLine();
		
		if(passValid(psw)) {
			System.out.println("Password je validan.");
		}
		else {
			System.out.println("Password nije validan.");
		}	    
		input.close();
	}

}
