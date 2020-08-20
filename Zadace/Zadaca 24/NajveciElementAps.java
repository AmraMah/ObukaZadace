import java.util.Scanner;

public class NajveciElementAps {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Unesite broj elemenata niza: ");
		int n=input.nextInt();
		if(n<=0) {
			System.out.println("Broj elemenata niza ne može biti manji od 1!");
		}
		else {
			int[] array=new int[n];
			System.out.println("Unesite elemente niza: ");
			for (int i = 0; i < array.length; i++) {
				array[i]=input.nextInt();
			}
			System.out.println("Najveci element niza po apsolutnoj vrijednosti je "+max(array));
		}
		input.close();
	}

	public static int max ( int[] array ) {
		int max=0;
		for (int i = 0; i < array.length; i++) {
			if(Math.abs(array[i])>max) {
				max=Math.abs(array[i]);
			}
		}		
		return max;
	}
}
