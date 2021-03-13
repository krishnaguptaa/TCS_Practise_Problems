/*Before the outbreak of corona virus to the world, a meeting happened in a room in Wuhan. A person who attended that meeting had COVID-19 and no one in the room knew about it! 
So everyone started shaking hands with everyone else in the room as a gesture of respect and after meeting unfortunately every one got infected! 
Given the fact that any two persons shake hand exactly once, Can you tell the total count of handshakes happened in that meeting?
Input Format:
The first line contains the number of test cases T, T lines follow. 
Each line then contains an integer N, the total number of people attended that meeting.
Output Format:
Print the number of handshakes for each test-case in a new line
Sample Input:
2
1
2
Output:
0
1
*/
import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while(n>0){
      n--;
      int num = sc.nextInt();
      int num1 = num-1;
      System.out.println((num1*(num1+1)/2));
    }
  }
}
