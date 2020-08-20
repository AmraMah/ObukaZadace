
public class NajviseJedinica {

	public static void main(String[] args) {
		int n=4;
		int[][] matrix=new int[n][n];
		System.out.println("Nasumicna matrica jedinica i nula:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j]=(int)(Math.random()*2);
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		int maxRow=0;
		int maxColumn=0;
		int ones=0;
		int max=0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(matrix[i][j]==1) {
					ones++;
				}			
			}
			if(ones>max) {
				max=ones;
				maxRow=i;
			}	
			ones=0;
		}	
		max=0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(matrix[j][i]==1) {
					ones++;
				}
			}
			if(ones>max) {
				max=ones;
				maxColumn=i;
			}	
			ones=0;
		}
		System.out.println("Red sa najvise jedinica: "+maxRow);
		System.out.println("Kolona sa najvise jedinica: "+maxColumn);
	}

}
