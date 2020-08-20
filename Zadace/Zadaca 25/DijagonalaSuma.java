import java.util.Scanner;

public class DijagonalaSuma {
	public static double sumirajSilaznuDijagonalu(double[][] niz) {
		double suma=0.0;
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz[0].length; j++) {
				if(i==j) {
					suma+=niz[i][j];
				}
			}
		}
		return suma;
	}
	
	public static double sumirajUzlaznuDijagonalu(double[][] niz) {
		double suma=0.0;
		for (int i=niz.length; i>=0; i--) {
			for (int j = 0; j < niz[0].length; j++) {
				if(i+j==niz.length-1) {
					suma+=niz[i][j];
				}
			}
		}
		return suma;
	}

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Unesite elemente matrice 4x4, red po red:");
		double[][] matrix=new double[4][4];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j]=input.nextDouble();
			}
		}
		System.out.println("Suma svih elemenata duž silazne dijagonale je "+sumirajSilaznuDijagonalu(matrix));
		System.out.println("Suma svih elemenata duž uzlazne dijagonale je "+sumirajUzlaznuDijagonalu(matrix));
		
		input.close();
	}

}
