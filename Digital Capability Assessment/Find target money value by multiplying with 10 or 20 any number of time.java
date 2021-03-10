/*Hack the money
You are a bank account hacker.Initially you have 1 rupee in your account, and you want exactly N rupees in your account.You wrote two hacks, First hack can multiply the amount of money you own by 10, while the second can multiply it by 20. These hacks can be used any number of time . Can you achieve the desired amount N using these hacks.
Constraints:
1<=T<=100
1<=N<=10^12
Input:
The first line of the input contains a single integer T denoting the number of test cases.
The description of T test cases follows.The first and only line of each test case contains a single integer N. 
Output :
For each test case, print a single line containing the string "Yes" if you can make exactly N rupees or "No" otherwise.
Sample Input:
5
1
2
10
25
200
Output:
Yes
No
Yes
No
Yes
*/

import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while(n>0){
      n--;
      int num = sc.nextInt();
      if(canHack(1,num)){
         System.out.println("Yes");
      }else{
         System.out.println("No");
      }
    }    
  }
  public static boolean canHack(int current,int n){
     if(current==n){
       return true;
     }
     if(current>n){
       return false;
     }else{
       if(canHack(current*10,n)){
          return true;
       }
       if(canHack(current*20,n)){
          return true;
       }
     }
    return false;
 }
