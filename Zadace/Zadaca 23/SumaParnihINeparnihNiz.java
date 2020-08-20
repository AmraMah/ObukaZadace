import java.util.Scanner;

public class SumaParnihINeparnihNiz {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Unesite 10 cijelih brojeva:");
		int[] array=new int[10];
		int sum1=0;
		int sum2=0;
		for(int i=0; i<array.length; i++) {
			array[i]=input.nextInt();
			if(array[i]%2==0) {
				sum1+=array[i];
			}
			else {
				sum2+=array[i];
			}
		}
		System.out.println("Suma parnih elemenata je "+sum1);
		System.out.println("Suma neparnih elemenata je "+sum2);
		input.close();
	}

}
