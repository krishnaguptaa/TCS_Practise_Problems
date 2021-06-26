/*The United Nations Organization released an official document regarding the most important events from the beginning of time (date: 00-00-0000) with a brief description of the events. The date of all the events is mentioned in the ‘DD-MM-YYYY’ format.
Find the total number of distinct years referenced in the document.
Input Format
Given input is in the form of string containing the content of the document.
Output Format
Return the total number of distinct years referenced in the document.
Refer the sample output for formatting
Sample Input:
UN was established on 24-10-1945. India got freedom on 15-08-1947.
Sample Output
2
*/
import java.util.*;
class Main{
  public static void main(String args[]){
    Set<Integer> arr=new HashSet<>();
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    
    System.out.println(distinctyear(str));
}
  public static int distinctyear(String str) { 
        String str2 = "";   
        Set<String> uniqueDates = new HashSet<>(); 
        for (int i = 0; i < str.length(); i++) { 
            if (Character.isDigit(str.charAt(i))) { 
                str2 += (str.charAt(i)); 
            } 
            // if we found - then clear the str2  
            if (str.charAt(i) == '-') { 
                str2 = ""; 
            } 
            // if length of str2 becomes 4  
            // then store it in a set  
            if (str2.length() == 4) { 
                uniqueDates.add(str2); 
                str2 = ""; 
            } 
        } 
        // return the size of set  
        return uniqueDates.size(); 
    }     
}
