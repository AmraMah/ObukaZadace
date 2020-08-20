import java.util.Arrays;
import java.util.Scanner;

public class PretrazivanjeNasumicniNiz {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] array=new int[100000];
		for (int i = 0; i < array.length; i++) {
			array[i]=(int) (Math.random()*100000);
		}
		System.out.println("Unesite broj koji zelite pronaci: ");
		int number=input.nextInt();
		long end = 0;
		long totalTime=0;
		long start = System.currentTimeMillis();
		int linear=linearSearch(array,number);
		if(linear!=-1) {
			end = System.currentTimeMillis();
			totalTime = end - start;
			System.out.println("Vrijeme potrebno za linearno pronalazenje broja "+number+" je "+totalTime+" ms.");
			//za binarno pretraživanje niz sortiramo, a poèetno vrijeme postavimo na novo trenutno
			Arrays.sort(array);
			start = System.currentTimeMillis();
			Arrays.binarySearch(array, number);
			end = System.currentTimeMillis();
			totalTime = end - start;
			System.out.println("Vrijeme potrebno za binarno pronalazenje broja "+number+" je "+totalTime+" ms.");
		}
		else {
			System.out.println("Broj "+number+" nije pronadjen.");
		}
		input.close();		
	}
	
	public static int linearSearch(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			if(n==arr[i]) {
				return i;
			}
		}
		return -1;
	}
}
