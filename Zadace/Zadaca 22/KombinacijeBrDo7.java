
public class KombinacijeBrDo7 {
	
	public static void kombinejshn() {
		int count=0;
		for(int i=1; i<=7; i++) {
			for(int j=i+1; j<=7; j++) {
				System.out.println(i+" "+j);
				count++;
			}
		}
		System.out.println("Ukupno kombinacija: "+count);
	}

	public static void main(String[] args) {
		System.out.println("Kombinacije brojeva 1-7:");
		kombinejshn();
	}

}
