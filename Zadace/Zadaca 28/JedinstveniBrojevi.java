import java.util.Scanner;

public class JedinstveniBrojevi {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] array=new int[10];
		System.out.println("Unesite 10 cijelih brojeva:");
		for (int i = 0; i < array.length; i++) {
			array[i]=input.nextInt();
		}
		int c=0;//brojac jednakih brojeva
		int counter=0; //brojac jedinstvenih brojeva
		System.out.print("Jedinstveni brojevi: ");
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if(array[i]==array[j]) {
					c++;
				}
			}
			if(c==1) {
				System.out.print(array[i]+" ");
				counter++;
			}
			c=0;
		}
		System.out.println();
		System.out.println("Broj jedinstvenih brojeva: "+counter);
		input.close();
	}

}
