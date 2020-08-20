import java.util.Scanner;

public class Pitanja {
	
	public static void pitanjaOdgovori(int num) {
		int correct=0;
		int incorrect=0;
		Scanner input=new Scanner(System.in);
		for(int i=0; i<num; i++) {
			int a=(int) (Math.random()*10);
			int b=(int) (Math.random()*10);
			if(a<b) {
				int c=a;
				a=b;
				b=c;
			}
			int result=a-b;
			System.out.println("Koliko je "+a+"-"+b+"?");
			int user=input.nextInt();
			if(user==result) correct++;
			else incorrect++;
		}
		input.close();
		System.out.println("Broj tacnih odgovora: "+correct);
		System.out.println("Broj netacnih odgovora: "+incorrect);
	}
	

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Koliko pitanja zelite?");
		int questions=input.nextInt();
		pitanjaOdgovori(questions);
		input.close();
	}

}
