import java.util.Scanner;

public class SumaPoKoloniMatrice {
	
	public static double sumirajKolonu(double[][] niz, int kolona) {
		double suma=0.0;
		for (int i = 0; i < niz.length; i++) {
			suma+=niz[i][kolona];
			}
		return suma;
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Unesite elemente matrice 3x4, red po red:");
		double[][] matrix=new double[3][4];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j]=input.nextDouble();
			}
		}
		for (int j = 0; j < matrix[0].length; j++) {
			System.out.println("Zbir svih elemenata u koloni "+j+" je "+sumirajKolonu(matrix, j));
		}
		input.close();
	}

}
