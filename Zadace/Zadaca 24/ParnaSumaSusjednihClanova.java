import java.util.Scanner;

public class ParnaSumaSusjednihClanova {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Unesite 10 cijelih brojeva:");
		int[] array=new int[10];
		for(int i=0; i<array.length; i++) {
			array[i]=input.nextInt();
		}
		System.out.println("Susjedni clanovi niza cija je suma parna su:");
		for (int i = 0; i < array.length-1; i++) {
			if((array[i]+array[i+1])%2==0) {
				System.out.println(array[i]+" i "+array[i+1]);
			}
		}
		input.close();
	}
}
