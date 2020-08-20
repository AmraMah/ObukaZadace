import java.util.Scanner;

public class Piramida {
	
	public static void piramide(int a, int b) {
		for(int i=a; i<=b; i++) {
			for(int l=b-i; l>=1; l--) {
				System.out.print("  ");
			}
			for(int j=1; j<i; j++) {
				System.out.print(j+" ");
			}
			for(int k=i; k>=1; k--) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Unesite pocetni i krajnji broj (veci od 0): ");
		int begin=input.nextInt();
		int end=input.nextInt();
		if(begin<=0 || end<=0) {
			System.out.println("Pogresan unos!");
		}
		else {
			if(begin>end) {
				int c=begin;
				begin=end;
				end=c;
			}
			piramide(begin,end);
		}		
		input.close();
	}

}
