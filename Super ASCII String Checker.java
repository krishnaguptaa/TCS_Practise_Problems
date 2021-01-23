package TCSCodeVita;

public class SuperASCIIString {

	public static void main(String[] args) {
    
		String S = "abdd";
		boolean superAscii=false;
		
	  /*Looping through string and finding the ascii value of each character and its frequency
		in string if ascii value and frequency of each character matches then
	    sting is the super ascii string*/
		for (int i = 0; i < S.length(); i++) {
		    superAscii=false;
			char c = S.charAt(i);
			int Ascii = (int)c-97+1;
			int count = 0;
			
			for (int j = 0; j < S.length(); j++) {
				if (c==S.charAt(j)) {
					count++;
				}
			}
			
			if (Ascii==count) {
				superAscii=true;
			}else {
				superAscii=false;
				break;
			}
			
			
		}
		if (superAscii) {
			System.out.println("SuperAscii");
		}else {
			System.out.println("Not SuperAscii");
		}
	}
}
