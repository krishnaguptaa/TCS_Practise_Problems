package TCSCodeVita;

import java.util.Scanner;

public class BankCompare {
/*  Find out out of tow banks a and b which gives max interest for given time period with different number of slabs
    with different intest rates by Formula
	EMI = loanAmount * monthlyInterestRate /(1 - 1 / (1 + monthlyInterestRate)^(numberOfYears * 12))

*   P = Principal 
*   N = Years
*   slabs = no. of slabs
*   R = Rate Per Month for slab
*   n = No. of Month for slab
*   
*   Problem Description
There are two banks; Bank A and Bank B. Their interest rates vary. You have received offers from both bank in terms of annual rate of interest, tenure and variations of rate of interest over the entire tenure.
You have to choose the offer which costs you least interest and reject the other.
Do the computation and make a wise choice.
The loan repayment happens at a monthly frequency and Equated Monthly Installment (EMI) is calculated using the formula given below :
EMI = loanAmount * monthlyInterestRate /
( 1 - 1 / (1 + monthlyInterestRate)^(numberOfYears * 12))

Constraints
1 <= P <= 1000000
1 <=T <= 50
1<= N1 <= 30
1<= N2 <= 30

Input Format
First line : P – principal (Loan Amount)
Second line : T – Total Tenure (in years).
Third Line : N1 is number of slabs of interest rates for a given period by Bank A. First slab starts from first year and second slab starts from end of first slab and so on.
Next N1 line will contain the interest rate and their period.
After N1 lines we will receive N2 viz. the number of slabs offered by second bank.
Next N2 lines are number of slabs of interest rates for a given period by Bank B. First slab starts from first year and second slab starts from end of first slab and so on.
The period and rate will be delimited by single white space.
*
*
*/ 
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float P = sc.nextFloat();  
    float N = sc.nextFloat();  
    float sum = 0;
    float banks [] = {0,0};
    int index = 0;
    
    for (int k = 0; k < 2; k++) {
    	float slabs = sc.nextFloat();
        float Rnarr [] = new float [(int) (slabs*2)];
        sum = 0;
        for (int i = 0; i < Rnarr.length; i++) {
			Rnarr[i] = sc.nextFloat();
			Rnarr[i+1] = sc.nextFloat();
			i++;
		}
        
        for (int i = 0; i < Rnarr.length; i++) {
			sum = sum + getEMI(P,Rnarr[i],N,Rnarr[i+1]);
			i++;
		}
        
        
        banks[index] = sum;
        index++;
        System.out.println(sum);
        
	}
    
    if (banks[0]>banks[1]) {
		System.out.println("Bank A");
	}else {
		System.out.println("Bank B");
	}
    	
	}
// Method to calculate EMI 
	public static float getEMI(float P, float R,float N,float n) {
		double EMI = P * R /( 1 - 1 / Math.pow((1 + R), (N * 12)));
		float a = (float) EMI;
		return a*n;       
	}
}
