import java.util.Scanner;

public class MoguceKombinacije {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Unesite 10 cijelih brojeva:");
		int[] array=new int[10];
		int n=0;
		for (int i = 0; i < array.length; i++) {
			array[i]=input.nextInt();
		}
		System.out.println("Moguce kombinacije parova: ");
		for (int i = 0; i < array.length-1; i++) {
			for(int j=i+1; j<array.length; j++) {
					System.out.println(array[i]+" "+array[j]);
					n++;
			}
		}	
		System.out.println("Broj mogucih kombinacija: "+n);
		input.close();
	}

}
