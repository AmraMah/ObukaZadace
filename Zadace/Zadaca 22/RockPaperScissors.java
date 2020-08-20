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
					System.out.println("Raèunar je izabrao makaze. Neriješeno je.");
					userWinn=0;
					compWinn=0;
				break;
				case 1:
					System.out.println("Raèunar je izabrao papir. Pobijedili ste.");
					userWinn++;
					compWinn=0;
					break;
				case 2:
					System.out.println("Raèunar je izabrao bunar. Raèunar je pobijedio.");
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
					System.out.println("Raèunar je izabrao makaze. Raèunar je pobijedio.");
					compWinn++;
					userWinn=0;
				break;
				case 1:
					System.out.println("Raèunar je izabrao papir. Neriješeno je.");
					userWinn=0;
					compWinn=0;
					break;
				case 2:
					System.out.println("Raèunar je izabrao bunar. Pobijedili ste.");
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
					System.out.println("Raèunar je izabrao makaze. Pobijedili ste.");
					userWinn++;
					compWinn=0;
				break;
				case 1:
					System.out.println("Raèunar je izabrao papir. Raèunar je pobijedio.");
					compWinn++;
					userWinn=0;
					break;
				case 2:
					System.out.println("Raèunar je izabrao bunar. Neriješeno je.");
					userWinn=0;
					compWinn=0;
					break;
				}
				break;
				default:
					System.out.println("Unijeli ste pogrešan broj.");
					userWinn=0;
					compWinn=0;
			}			
		}			
			System.out.println("Dvije pobjede za redom => Igra je gotova.");
			input.close();
		}
}
