import java.util.Scanner;

public class NajveciElement {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Unesite broj redova i broj kolona niza:");
		int row=input.nextInt();
		int column=input.nextInt();
		while(row<=0 || column<=0) {
			System.out.println("Pogresan unos. Unesite broj redova i broj kolona:");
			row=input.nextInt();
			column=input.nextInt();	
		}
		double [][] matrix=new double[row][column];
		System.out.println("Unesite "+row+"x"+column+" matricu:");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix[i][j]=input.nextDouble();
			}
		}
		int[] location=najveciElement(matrix);
		System.out.print("Lokacija najveceg elementa: ("+location[0]+","+location[1]+").");
		input.close();
	}
	
	public static int[] najveciElement(double[][] niz) {
		int a=0;
		int b=0;
		double max=0.0;
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz[0].length; j++) {
				if(niz[i][j]>max) {
					max=niz[i][j];
					a=i;
					b=j;
				}
			}
		}
		int [] maxLocation= {a, b};
		return maxLocation;
	}

}
