/*Birthday Party
Madhav went to Riya's Birthday Party. He was a geek so he had no idea regarding which gift she'l like.So he took an array of integers with him. The array followed a particular order. First element of array is 1.Second element of array is 6.
Other elements of the array are two less than the mean of the number preceding and succeeding it.As it is obvious, Riya felt that this idea was stupid and hence she wanted to punish Madhav.She decided to ask Madhav the nth number of the array. If he tells the wrong answer, she would slap him.Help Madhav to escape from this embarrassing situation
Input:
The input starts with T, the number of Test Cases.
Next T lines contain integer N.
Output:
For each test case, output an integer which is the Nth number of the array. As the answer can be very large, output it modulo 109+7
Constraints:
1 ≤ T ≤ 105
1 ≤ N ≤ 1018
Sample Input:
2
1
3

Output:
1
15
*/


import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while(n>0){
      n--;
      int index = sc.nextInt();
      int ans = solve(index);
      System.out.println(ans);
    } 
  }
  
  static void solve(int n){
     int f = 1;
     int s = 6;
     int t = (s+2)*2-f;
     for(int i=1;i<=n;i++){
        f = s;
        s = t;
        t = (s+2)*2-f;
     }
         return s
     }
  }
}

/*
Second Method by forming formula for Nth element as it is Nth element = n*(2*n-1) and having number greater than int,
we operate % 1000000007 to answer 

import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while(n>0){
      n--;
      int index = sc.nextInt();
      int ans = solve(index);
      System.out.println(ans);
    } 
  }
  
  static int solve(int n){
      long c = 1000000007;
      long ans = n*(2*n-1)%c;
      int a = (int) ans;
         return a;
  }
}
*/
