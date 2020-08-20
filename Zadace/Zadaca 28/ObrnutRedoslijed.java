import java.util.Scanner;

public class ObrnutRedoslijed {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] array=new int[10];
		System.out.println("Unesite 10 cijelih brojeva:");
		for (int i = 0; i < array.length; i++) {
			array[i]=input.nextInt();
		}
		System.out.println("Obrnut redoslijed:");
		for (int i = array.length-1; i>=0; i--) {
			System.out.print(array[i]+" ");
		}
		input.close();
	}

}
