import java.util.Arrays;
import java.util.Scanner;

public class BrojPojavljivanja {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Unesite cijele brojeve izmeðu 1 i 100 (0 za kraj): ");
		int num=input.nextInt();
		String str="";
		while(num!=0) {
			if(num<0 || num>100) {
				System.out.println("Unijeli ste broj izvan raspona.");
				break;
			}
			str+=num;
			str+=" ";
			num=input.nextInt();
		}
		String[] arrayStr=str.split(" ");
		int[] arrayInt=new int[arrayStr.length];
		for (int i = 0; i < arrayInt.length; i++) {
			arrayInt[i]=Integer.parseInt(arrayStr[i]);			
		}
		countNumbers(arrayInt);
		input.close();
	}
		
	
	
	public static void countNumbers(int[] a) {
		Arrays.sort(a);
		int counter=0;
		for (int i = 0; i < a.length; i+=counter) {
			counter=0;
			for (int j = i; j < a.length; j++) {
					if(a[i]==a[j]) {
						counter++;
					}
			}
			if(counter==1) {
				System.out.println("Broj "+a[i]+" se pojavljuje 1 put.");
			}
			else {
				System.out.println("Broj "+a[i]+" se pojavljuje "+counter+" puta.");
			}
		}
	}
		
}
