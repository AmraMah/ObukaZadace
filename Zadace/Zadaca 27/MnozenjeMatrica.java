import java.util.Scanner;

public class MnozenjeMatrica {
	
	public static double[][] pomnoziMatrice(double[][] a, double[][] b) {
		double [][] c=new double[a.length][b[0].length];
		double sum=0.0;
		if(a[0].length!=b.length) {
			System.out.println("Mnozenje matrica nije moguce. Rezultat su default vrijednosti(0.0)");
		}
		else {
			for (int i = 0; i < a.length; i++) { //redovi a i c
				for (int k = 0; k < b[0].length; k++) { //kolone b i c
					for (int j = 0; j < b.length; j++) { //kolone a i redovi b
							sum+=a[i][j]*b[j][k];	
					}
					c[i][k]=sum;
					sum=0.0;
				}
			}
		}
		
		return c;
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double[][] m1=new double[3][3];
		double[][] m2=new double[3][3];
		System.out.println("Unesite prvu matricu 3x3:");
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[0].length; j++) {
				m1[i][j]=input.nextDouble();
			}
		}
		System.out.println("Unesite drugu matricu 3x3:");
		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2[0].length; j++) {
				m2[i][j]=input.nextDouble();
			}
		}
		System.out.println("Rezultirajuca matrica:");
		double[][] result=pomnoziMatrice(m1,m2);
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {
				System.out.printf("%4.1f ",result[i][j]);
			}
			System.out.println();
		}
		input.close();
	}
}
