
public class SavrseniBrojeviMetoda {
	
	public static void perfectNums() {
		int sum=0; //suma djelilaca
		for(int i=1; i<=10000; i++) {
			for(int j=1; j<i; j++) {
				if(i%j==0) {
					sum+=j;
				}				
			}
			if(sum==i) {
				System.out.println(i);
				sum=0;
			}
			else {
				sum=0;
			}
		}
	}
	

	public static void main(String[] args) {
		System.out.println("Ispis savršenih brojeva od 0 do 10000:");
		perfectNums();
	}

}
