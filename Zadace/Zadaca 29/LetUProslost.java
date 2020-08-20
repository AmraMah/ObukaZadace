import java.util.Scanner;

public class LetUProslost {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Koliko godina želite da se vratite u prošlost?");
		long past=scanner.nextLong();
		scanner.close();
		if(past<0 || past>4550e6) {
			System.out.println("Pogresan unos.");
		}
		else {
			/*Brzina aviona je v=1[g/s], a vrijeme raèunamo kao t=s/v, gdje je s put, 
			 * (u našem sluèaju broj godina-past). Pošto je brzina izražena u
			 * godina/sekunda, izraèunali bismo prvo vrijeme izraženo u sekundama (timeInSeconds), 
			 * pa onda to vrijeme pretvorili u minute, sate itd. A pošto je brzina 1, ne mora
			 * se ni raèunati jer je past/1=past.
			*/
			//double timeInSeconds=past/1;
			//Pretpostavka: godina=365 dana, mjesec=30 dana
			long seconds=past/1;
			long hours=seconds/3600;
			long sRest=seconds%3600;  //ostatak sekundi
		    long minutes=sRest/60;
			long mRest=sRest%60;	//sekunde		
			
			long daysTotal=hours/24;
			long years=daysTotal/365;
			long yRest=daysTotal%365;
			long months=yRest/30;
			long days=yRest%30;
			long decades=years/10;
			long century=decades/10;
			long millennium=decades/100;
			System.out.println("Vrijeme potrebno za putovanje "+past+" god. unazad:");
			System.out.println(hours+" sati/sata, "+minutes+" minuta/minute, "+mRest+" sekundi/sekunde");
			System.out.println(years+" godina/godine, "+months+" mjeseci/mjeseca,  "+days+" dana ");
			System.out.println(millennium+" milenija/milenij "+century+" stoljeæa "+decades+" decenija/decenije.");
		
			//1 korak -> 1 godina u proslost.
			long step=75; //cm
			long cmTotal=past*step;
			long km=cmTotal/100000;
			long cmRest=cmTotal%100000;
			long m=cmRest/100;
			long cm=cmRest%100;
			long stadium=105; //u metrima
			long nStadium= (km*1000+m)/stadium;
			long volume= 40075; //km
			long nVolume=km/volume;
			
			System.out.println("Prehodali biste "+km+" kilometara, "+m+" metara, "+cm+" centimetara.");
			System.out.println("Prosjeèan fudbalski stadion biste prehodali "+nStadium+" puta.");
			System.out.println("Obim Zemlje biste prehodali "+nVolume+" puta.");
		}
	}

}
