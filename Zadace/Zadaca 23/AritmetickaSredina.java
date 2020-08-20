import java.util.Scanner;

public class AritmetickaSredina {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Unesite broj elemenata niza: ");
		int num=input.nextInt();
		if(num<0) {
			System.out.println("Broj elemenata ne može biti negativan!");
		}
		else {
			System.out.println("Unesite elemente niza: ");
			int[] array=new int[num];
			int sum=0;
			for (int i = 0; i < array.length; i++) {
				array[i]=input.nextInt();
				sum+=array[i];
			}
			System.out.println("Aritmeticka sredina clanova niza je: "+(sum/num));
		}		
		input.close();
	}

}
