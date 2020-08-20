import java.util.Arrays;
import java.util.Scanner;

public class DaLiJeSortiran {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Unesite broj elemenata niza:");
		int n=input.nextInt();
		while(n<=0) {
			System.out.println("Broj elemenata mora biti veæi od 0. Pokušajte ponovo:");
			n=input.nextInt();
		}
		int[] array=new int[n];
		System.out.println("Unesite "+n+" cijelih brojeva:");
		for (int i = 0; i < array.length; i++) {
			array[i]=input.nextInt();
		}
	    if(isSortiran(array)) {
	    	System.out.println("Uneseni niz je sortiran.");
	    }
	    else {
	    	System.out.println("Uneseni niz nije sortiran.");
	    }
	    input.close();
	}
	
	public static boolean isSortiran(int[] niz) {
		boolean sortiran=true;
		int [] original=Arrays.copyOf(niz, niz.length);
		Arrays.sort(niz);
		for (int i = 0; i < original.length; i++) {
			if(original[i]!=niz[i]) {
				sortiran=false;
				break;
			}
		}		
		return sortiran;
	}

}
