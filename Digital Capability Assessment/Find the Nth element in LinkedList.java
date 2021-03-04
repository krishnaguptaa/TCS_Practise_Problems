/*Find the Nth element
Write a program to create a Singly Linked List and find the Nth element from the end of the list.
Hint : Insertion at the beginning.
Output:
output consists of single line, print the element in the given position in a list, else print"No node found"
Sample Input:
5
10 8 6 4 0
2
Output:
8
Case 1
Input (stdin)
5
10 8 6 4 0
2
Output (stdout)
8
*/
import java.util.*;
class Main{
   class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
   }
    
   Node head;
   
   Node newNode(int data){
        Node node = new Node(data);
        return node;
   }
  
   void add(int data){
       if(head == null){
          head = newNode(data);
       }
       else{
          Node n = head;
          while(n.next!=null){
               n = n.next;
          }
          n.next = newNode(data);
       }
   }
   void get(int index){
       int i = 0;
       Node n = head;
       while(i<index-1 && n.next!=null){
            n = n.next;
            i++;
       }
       if(n.next==null){
           System.out.println("No node found");
       }else{
           System.out.println(n.data);
       }
   }
  public static void main(String args[]){
    Main list = new Main();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    while(n>0){
       int d = sc.nextInt(); 
       list.add(d);
       n--;
    }
    int index = sc.nextInt();
    list.get(index);
  }
}
