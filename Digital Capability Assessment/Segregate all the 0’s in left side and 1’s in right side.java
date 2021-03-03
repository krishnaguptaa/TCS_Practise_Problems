/*segregate all the 0’s in left side and 1’s in right side
Write a program to segregate all the 0’s in left side and 1’s in right side in the same array with O(n) complexity. 
Sample Input:
5
0 1 0 1 0
Output:
0 0 0 1 1
*/
import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    int left = n-1;
    int right = 0;
    for(int i=0;i<n;i++){
        int temp = sc.nextInt();
        if(temp==1){
           arr[left] = temp;
           left--;
        }else{
           arr[right] = temp;
           right++;
        }
    }
  // Print
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]);
    }
 }
}
