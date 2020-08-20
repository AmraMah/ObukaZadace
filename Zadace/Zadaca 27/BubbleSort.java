import java.util.Scanner;

public class BubbleSort {
	
	public static void bubbleSort(double [] array) {
		
		boolean swapped=true;
		while(swapped) {
			swapped=false;
			for (int i = 0; i < array.length-1; i++) {
				for (int j = 0; j < array.length-i-1; j++) {
					if(array[j]>array[j+1]) {
						double n=array[j];
						array[j]=array[j+1];
						array[j+1]=n;
						swapped=true;
					}
				}
			}			
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double [] doubles= new double[10];
		System.out.println("Unesite 10 brojeva:");
		for (int i = 0; i < doubles.length; i++) {
			doubles[i]=input.nextDouble();
		}
		System.out.println("Sortiran niz:");
		bubbleSort(doubles);
		input.close();
	}

}
