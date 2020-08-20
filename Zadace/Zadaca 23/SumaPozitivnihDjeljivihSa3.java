import java.util.Scanner;

public class SumaPozitivnihDjeljivihSa3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Unesite 10 cijelih brojeva:");
		int[] array=new int[10];
		int sum=0;
		for(int i=0; i<array.length; i++) {
			array[i]=input.nextInt();
			if(array[i]>0 && array[i]%3==0) {
				sum+=array[i];
			}
		}
		System.out.println("Suma pozitivnih elemenata djeljivih sa tri je "+sum);
		input.close();
	}

}
