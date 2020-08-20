
public class Niz10Nasumicnih {
	
	public static int[] generateArray() {
		int[] array=new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i]=(int) (Math.random()*100);
		}
		return array;
	}

	public static void main(String[] args) {
		int [] numbers= generateArray();
		System.out.println("Ispis elemenata niza 10 nasumicnih cijelih brojeva:");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]+" ");
		}
	}

}
