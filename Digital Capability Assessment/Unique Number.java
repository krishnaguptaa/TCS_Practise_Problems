/*Unique Number
Write a program to find the count of numbers which consists of unique digits.
Input:
Input consist of two Integer lower and upper value of an range
Output:
Output consists of single line, print the count of unique digits in given range. Else Print"No Unique Number"
Sample Input:
10
15
Sample Ouput:
5
*/
import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int count = 0;
    int i = n;
    while(i<=m){
      if(isUnique(i)==true){
        count++;
      }
      i++;
    }
    if(count>0){
       System.out.println(count);
    }else{
       System.out.println("No Unique Number");
    }
  }
  static boolean isUnique(int n){
     HashSet<Integer> h = new HashSet<>(); 
     while(n>0){
       int temp = n%10;
       n = n/10;
       if(h.contains(temp)){
          return false;
       }else{
          h.add(temp);
       }
     }
     return true;
  }
}
