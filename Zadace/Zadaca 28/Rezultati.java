import java.util.Scanner;

public class Rezultati {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double[] results=new double[100];
		int n=0; //broji koliko je korisnik unio brojeva
		double sum=0.0;
		double avg=0.0;
		System.out.println("Unesite rezultate:");
		for (int i = 0; i < results.length; i++) {
			results[i]=input.nextDouble();
			if(results[i]<0) break;
			sum+=results[i];
			n++;
		}
		avg=sum/n;
		int a=0; //broji rezultate >= prosjeku
		int b=0; //broji rezultate manje od prosjeka
		for (int i = 0; i < n; i++) {
			if(results[i]>=avg) a++;
			else b++;
		}
		input.close();
		System.out.println("Prosjek rezultata: "+avg);
		System.out.println("Broj rezultata koji su iznad ili jednaki prosjeku: "+a);
		System.out.println("Broj rezultata ispod prosjeka: "+b);
	}

}
