
public class Ormarici {

	public static void main(String[] args) {
		int n=100; //broj ormarica=broj ucenika
		boolean[] array=new boolean[n]; //svi ormarici zatvoreni na pocetku (false)
		for(int i=1; i<=n; i++) { //petlja za ucenike
			for(int j=i-1; j<array.length; j+=i) { //petlja za ormarice (indeksi u nizu) za koje ce se desiti promjena
			if(array[j])
				array[j]=false;		//ako je bio otvoren, zatvori
			else
				array[j]=true;		//ako je bio zatvoren, otvori
			}
		}

		System.out.println("Redni brojevi otvorenih ormarica:");
		for (int i = 0; i < array.length; i++) {
			if(array[i]) {
				//ispisuje redni broj ormariæa kao indeks u nizu+1, 
				//da ne bi bio nulti ormariæ
				System.out.print((i+1)+". ");
			}
		}
		
	}

}
