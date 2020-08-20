import java.util.Scanner;

public class NajmanjiNaNeparnojPoziciji {
	
	public static int min(int a, int b) {
		int min=0;
		if(a<b)
			min=a;
		else
			min=b;
		return min;
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Unesite 10 cijelih brojeva:");
		int[] array=new int[10];
		for(int i=0; i<array.length; i++) {
			array[i]=input.nextInt();
		}
		int minNep=array[1];
		for(int i=3; i<array.length; i+=2) {
			minNep=min(array[i], minNep);
		}
		System.out.print("Najmanji element na neparnoj poziciji je broj "+minNep);
		input.close();
	}

}
