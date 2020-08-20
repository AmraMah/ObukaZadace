import java.util.Scanner;
public class Studenti {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Unesite broj studenata:");
		int number=input.nextInt();
		if(number<=0) {
			System.out.println("Pogresan unos!");
		}
		else {
			String[][] students=new String[number][2];
			for (int i = 0; i < students.length; i++) {
				for (int j = 0; j < students[0].length-1; j++) {
					System.out.println("Unesite ime studenta: ");
					input.nextLine();
					students[i][j]=input.nextLine();
					System.out.println("Unesite ocjenu studenta: ");
					students[i][j+1] =input.next();
					//provjera da li je unesena ocjena u opsegu 5-10:
					while(!(Integer.parseInt(students[i][j+1])>=5 && Integer.parseInt(students[i][j+1])<=10)) {
						System.out.println("Pogresan unos! Unesite ocjenu ponovo: ");
						students[i][j+1] =input.next();
					}
				}
			}
			sortByGrade(students);
		}
		input.close();
	}
	
	
	public static void sortByGrade(String[][] array){
		for (int i = 0; i < array.length-1; i++) {
			for (int j = i+1; j < array.length; j++) {
				if(Integer.parseInt(array[i][1])<Integer.parseInt(array[j][1])) {
					//pomocni string koji cuva ime:
					String s1=array[i][0];
					//pomocni string koji cuva ocjenu:
					String s2=array[i][1];
					array[i][0]=array[j][0];
					array[i][1]=array[j][1];
					array[j][0]=s1;
					array[j][1]=s2;
				}
			}
		}
		System.out.println("Studenti sortirani po ocjenama: ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
}
