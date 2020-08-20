import java.util.Scanner;

public class CetiriIstaBroja {

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
			if(fourSameElements(array)) {
				System.out.println("Ovaj niz sadrzi 4 ista broja uzastopno.");
			}
			else {
				System.out.println("Ovaj niz ne sadrzi 4 ista broja uzastopno.");
			}
		}
		input.close();
	}
	
	public static boolean fourSameElements(int[] arr) {
		boolean same=false;
		for (int i = 0; i < arr.length-3; i++) {
			if(arr[i]==arr[i+1] && arr[i]==arr[i+2] && arr[i]==arr[i+3]) {
				same=true;
			}
		}
		return same;
	}

}
