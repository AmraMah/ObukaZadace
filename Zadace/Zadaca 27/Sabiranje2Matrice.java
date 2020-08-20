import java.util.Scanner;

public class Sabiranje2Matrice {
	 public static double[][] saberiMatrice(double[][] a, double[][] b) {
			 int row=a.length;
			 int col=a[0].length;
			 double[][] c=new double[row][col];
			 for (int i = 0; i < row; i++) {
				 for (int j = 0; j < col; j++) {
					c[i][j]=a[i][j]+b[i][j];
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
		 if(m1.length!=m2.length || m1[0].length!=m2[0].length) {
			 System.out.println("Matrice nisu istih dimenzija!");
		 }
		 else {
			 System.out.println("Zbir dvije matrice:");
			 double [][] m12=saberiMatrice(m1,m2);
			 for (int i = 0; i < m12.length; i++) {
				 for (int j = 0; j < m12[0].length; j++) {
					 System.out.print(m12[i][j]+" ");
				 }
				 System.out.println();
			 }
		 }
		input.close();
	}
}
