import java.util.Scanner;

public class FB {

	public static void main(String[] args) {
		
		Scanner unos=new Scanner(System.in);
		System.out.print("Unesite cijeli broj: ");
		int a=unos.nextInt();
		unos.close();
		
		if(a%3==0 && a%5==0)
			System.out.print("FizzBuzz");
		else if (a%3==0)
			System.out.print("Fizz");
		else if (a%5==0) 
			System.out.print("Buzz");
		else
			System.out.print(a);

	}

}
