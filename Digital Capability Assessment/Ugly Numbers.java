/*Ugly Numbers
Ugly numbers are numbers whose only prime factors are 2, 3 or 5. The sequence 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, … shows the first 11 ugly numbers. By convention, 1 is included. Write a program to find Nth Ugly Number.
Input:
The first line of input contains an integer T denoting the number of test cases. T testcases follow. For each testcase there is one line of input that contains the number N.
Output:
Print the Nth Ugly Number.
﻿Constraints:
1 ≤ T ≤ 104
1 ≤ N ≤ 104
Example:
Input:
2
10
4
Output:
12
4
*/
import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while(n>0){
      n--; 
      int nth = sc.nextInt();
      int i = 1; 
      int count = 0;
      while(count<nth){
          if(isUgly(i)){
              count++;
          }
          i++;
      }
      System.out.println(i-1);
    } 
  }
  public static boolean isUgly(int n){
     n = maxDivide(n,2);
     n = maxDivide(n,3);
     n = maxDivide(n,5);
    
     return n==1?true:false;
  }
  public static int maxDivide(int n,int m){
     while(n%m==0){
       n = n/m;
     }
     return n;
  }
}
