import java.util.Scanner;

public class RockPaperScissors {
	
	public static void main(String[] args) {
		rps();		
	}

	public static void rps() {
		Scanner input=new Scanner(System.in);
		int userInput;
		int computer;
		int userWinn=0;
		int compWinn=0;
		while(userWinn!=2 && compWinn!=2){
			System.out.print("Unesite 0 (makaze), 1 (papir) ili 2 (bunar): ");
			userInput=input.nextInt();
			switch (userInput) {
			case 0:
				System.out.print("Izabrali ste makaze. ");
				computer= (int)(Math.random()*3);
				switch (computer) {
				case 0:
					System.out.println("Ra�unar je izabrao makaze. Nerije�eno je.");
					userWinn=0;
					compWinn=0;
				break;
				case 1:
					System.out.println("Ra�unar je izabrao papir. Pobijedili ste.");
					userWinn++;
					compWinn=0;
					break;
				case 2:
					System.out.println("Ra�unar je izabrao bunar. Ra�unar je pobijedio.");
					compWinn++;
					userWinn=0;
					break;
				}
				break;
			case 1:
				System.out.print("Izabrali ste papir. ");
				computer= (int)(Math.random()*3);
				switch (computer) {
				case 0:
					System.out.println("Ra�unar je izabrao makaze. Ra�unar je pobijedio.");
					compWinn++;
					userWinn=0;
				break;
				case 1:
					System.out.println("Ra�unar je izabrao papir. Nerije�eno je.");
					userWinn=0;
					compWinn=0;
					break;
				case 2:
					System.out.println("Ra�unar je izabrao bunar. Pobijedili ste.");
					userWinn++;
					compWinn=0;
					break;
				}
				break;
			case 2:
				computer= (int)(Math.random()*3);
				System.out.print("Izabrali ste bunar. ");
				switch (computer) {
				case 0:
					System.out.println("Ra�unar je izabrao makaze. Pobijedili ste.");
					userWinn++;
					compWinn=0;
				break;
				case 1:
					System.out.println("Ra�unar je izabrao papir. Ra�unar je pobijedio.");
					compWinn++;
					userWinn=0;
					break;
				case 2:
					System.out.println("Ra�unar je izabrao bunar. Nerije�eno je.");
					userWinn=0;
					compWinn=0;
					break;
				}
				break;
				default:
					System.out.println("Unijeli ste pogre�an broj.");
					userWinn=0;
					compWinn=0;
			}			
		}			
			System.out.println("Dvije pobjede za redom => Igra je gotova.");
			input.close();
		}
}
