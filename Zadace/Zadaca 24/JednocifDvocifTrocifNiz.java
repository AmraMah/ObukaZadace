
public class JednocifDvocifTrocifNiz {

	public static void main(String[] args) {
		int[] array=new int[20];
		int oneDigit=0;
		int twoDigit=0;
		for(int i=0; i<array.length; i++) {
			array[i]=(int) (Math.random()*1000);
			if(array[i]<10) {
				oneDigit++;
			}
			else if(array[i]<100) {
				twoDigit++;
			}
		}
		int[] oneDigitArray=new int[oneDigit];
		int[] twoDigitsArray=new int[twoDigit];
		int[] threeDigitsArray=new int[array.length-oneDigit-twoDigit];
		int j=0;
		int k=0;
		int l=0;
		for (int i = 0; i < array.length; i++) {
			if(array[i]<10) {
				oneDigitArray[j]=array[i];
				j++;
			}
			else if(array[i]<100) {
				twoDigitsArray[k]=array[i];
				k++;
			}
			else {
				threeDigitsArray[l]=array[i];
				l++;
			}
		}
		System.out.println("Prvi generisani niz:");
		ispisiNiz(array);
		System.out.println("Niz jednocifrenih brojeva:");
		ispisiNiz(oneDigitArray);
		System.out.println("Niz dvocifrenih brojeva:");
		ispisiNiz(twoDigitsArray);
		System.out.println("Niz trocifrenih brojeva:");
		ispisiNiz(threeDigitsArray);		
	}
	
	public static void ispisiNiz(int[] niz) {
		for(int i=0; i<niz.length; i++) {
			System.out.print(niz[i]+" ");
		}
		System.out.println();
	}

}
