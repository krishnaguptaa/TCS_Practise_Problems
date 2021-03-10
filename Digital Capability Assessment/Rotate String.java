/*Rotate the String
Write a program to Rotate the string in the specified direction and print the output.
Input Format:
First line contains the String A.
Second line contains the number of positions you have to shift the elements in the string.
Third line contains the direction either 'L' or 'R'.
Output Format:
Print the rotated string
Constrain:
1<=len(A)<1000
Sample Input:
faceprep
3
L
Sample Output:
eprepfac
*/
import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      int shift = sc.nextInt();
      char dir = sc.next().charAt(0);
      
      String ans = rotate(s.toCharArray(),shift,dir);
      System.out.println(ans);
  }
  
  public static String rotate(char ch[], int n, char dir){
     if(dir=='L'){
        while(n>0){
            n--;
            char temp = ch[0];
            for(int i=0; i<ch.length-1; i++){
                ch[i] = ch[i+1];
            }
            ch[ch.length-1] = temp;
       }
     }else{
        while(n>0){
            n--;
            char temp = ch[ch.length-1];
            for(int i= ch.length-1; i>0; i--){
                ch[i] = ch[i-1];
            }
            ch[0] = temp;
        }
     }
    String ans = new String(ch);
    return ans;
  }
}
