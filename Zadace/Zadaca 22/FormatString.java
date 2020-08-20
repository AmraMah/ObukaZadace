
public class FormatString {

	public static String format(int number, int width) {
		@SuppressWarnings("deprecation")
		String s=new Integer(number).toString();
		int numLength=s.length();
		String str="";
		if(numLength<width) {
			for(int i=0; i<width-numLength; i++) {
				str+="0";
			}			
		}		
		str+=s;
		return str;
	}

	public static void main(String[] args) {
		String str=format(12345,7);
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i));
		}
	}

}
