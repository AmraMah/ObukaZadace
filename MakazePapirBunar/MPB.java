import java.util.Scanner;
public class MPB {

	public static void main(String[] args) {
		
		Scanner unos=new Scanner (System.in);
		System.out.println("Unesite 0,1 ili 2 (0 - makaze, 1 - papir, 2 - bunar)");
		int korisnik=unos.nextInt();
		
		int kompjuter=(int) (Math.random()*3);
		
		if (korisnik==kompjuter) {
			if(korisnik==0) {
				System.out.println("Izabrali ste makaze. Racunar je izabrao makaze. Neriješeno je.");
			}
			else if (korisnik==1) {
				System.out.println("Izabrali ste papir. Racunar je izabrao papir. Neriješeno je.");
			}
			else {
				System.out.println("Izabrali ste bunar. Racunar je izabrao bunar. Neriješeno je.");
			}
		}
		
		else {
			if ((korisnik==0)&&(kompjuter==1)){
				System.out.println("Izabrali ste makaze. Racunar je izabrao papir. Pobijedili ste.");
			}
			else if ((korisnik==0)&&(kompjuter==2)){
				System.out.println("Izabrali ste makaze. Racunar je izabrao bunar. Raèunar je pobijedio.");
			}
			else if((korisnik==1)&&(kompjuter==0)){
				System.out.println("Izabrali ste papir. Racunar je izabrao makaze. Raèunar je pobijedio.");
			}
			else if((korisnik==1)&&(kompjuter==2)){
				System.out.println("Izabrali ste papir. Racunar je izabrao bunar. Pobijedili ste.");
			}
			else if((korisnik==2)&&(kompjuter==0)){
				System.out.println("Izabrali ste bunar. Racunar je izabrao makaze. Pobijedili ste.");
			}
			else{
				System.out.println("Izabrali ste bunar. Racunar je izabrao papir. Raèunar je pobijedio.");
			}
		}
		
		
	}

}
