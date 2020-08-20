import java.util.Arrays;

public class RadniSatiSilazno {
	

	public static void main(String[] args) {
		int[][] hours={
				{2, 4, 3, 4, 5, 8, 8},
				{7, 3, 4, 3, 3, 4, 4},
				{3, 3, 4, 3, 3, 2, 2},
				{9, 3, 4, 7, 3, 4, 1},
				{3, 5, 4, 3, 6, 3, 8},
				{3, 4, 4, 6, 3, 4, 4},
				{3, 7, 4, 8, 3, 8, 4}
				};
		int[][] perEmployee=new int[7][2];
		int t=0;
		for (int i = 0; i < hours.length; i++) {
			for (int j = 0; j < hours[0].length; j++) {
				t+=hours[i][j];
			}
			perEmployee[i][0]=i;
			perEmployee[i][1]=t;
			t=0;
		}
		Arrays.sort(perEmployee, (a,b) -> Integer.compare(a[1], b[1]));
		System.out.println("Uposlenici i ukupan broj odradjenih sati:");
		for (int i=perEmployee.length-1; i>=0; i--) {
			System.out.println("Uposlenik "+perEmployee[i][0]+": "+perEmployee[i][1]+" sati");
		}
	}

}
