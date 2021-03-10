/*Insert and delete using Singly Linked List
Write a program to create a Singly Linked List using dynamic memory allocation. If linked list is empty, print "Linked list is empty".
Hint:
1. Insert an element at beginning of linked list.
2. Insert an element at end of linked list.
3. Traverse linked list.
4. Delete element from beginning.
5. Delete element from end.
6. Exit
Sample Input:
1
Enter value of element
10
2
Enter value of element
20
3
4
5
6
Sample Output:
10 20
10 deleted from beginning successfully.
20 deleted from end successfully.
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
         }else{
           insertAtLast(data);
         }
     }
     void insertAtFirst(int data){
         if(head==null){
             add(data);
         }else{
              Node temp = head;
              Node node = newNode(data);
              node.next = head;
              head = node;
         }
     }
     void insertAtLast(int data){
         Node node = head;
         while(node.next!=null){
              node = node.next;
         }
         node.next = newNode(data);
     }
     int deleteFirst(){ 
       Node node = head;
       head = head.next;
       return node.data;
     }
     int deleteLast(){   
       Node node = head;
       Node prev = node;
       while(node.next!=null){
          prev = node;
          node = node.next;
       }
      Node temp = node;
      prev.next = null;
      return temp.data;
     }
     public void print(){
       if(head==null){
          System.out.println("Linked list is empty");
       }else{
         Node node = head;
         while(node.next!=null){
               System.out.print(node.data+" ");
               node = node.next;
         }
         System.out.print(node.data);
         System.out.println();
       }
     }
   
  
  public static void main(String args[]){   
      Scanner sc = new Scanner(System.in);
      Main list = new Main();
      boolean continue1 = true;
      
      while(continue1==true){
         int choice = sc.nextInt();
         if(choice==1){
             System.out.println("Enter value of element");
             int d = sc.nextInt();
             list.insertAtFirst(d); 
         }else if(choice==2){
             System.out.println("Enter value of element");
             int d = sc.nextInt();
             list.insertAtLast(d); 
         }else if(choice==3){
             list.print();
         }else if(choice==4){
             System.out.println(list.deleteFirst()+" deleted from beginning successfully.");
         }else if(choice==5){
              System.out.println(list.deleteLast()+" deleted from end successfully.");
         }else{
           continue1 = false;
         }
      }
      
  }
}
