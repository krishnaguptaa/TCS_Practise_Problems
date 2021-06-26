package TCSCodeVita;
public class HolesBalls {

	public static void main(String[] args) {
	//Inputs Hole Array h and Ball Array b and array for depth of each hole n
		int h[] = {20, 15, 10, 5, 25};
		int b[] = {5, 10, 15, 20, 25, 30, 4, 9, 14, 19} ;
		int n[] = new int [h.length];
	    int k   = 1;
    // Loop for Initializing depth of each hole
	    for (int i = 0; i<n.length; i++) {
			n[i] = k;
			   k = k+1;
		}
    //Looping through Balls 
	for (int i = 0; i < b.length; i++) {
		int ball = b[i];
		boolean filled = false;
		
		// Looping through Holes
		for (int j = h.length-1; j >=0; j--) {
			
			if (ball<=h[j] && n[j]>0) {
			    n[j] = n[j]-1;
				System.out.println(j+1);
				filled = true;
				break;
			}
			}
		    if (filled==false) {
			    System.out.println("0");
		    }
		}
		
	}
	}
