import java.io.*;
import java.util.*;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

class Linked_List {

public static  Node insert(Node head,int data) {
        
        if(head == null)
        {
                Node new1=new Node(data);
                    head = new1;
        }
        else
        {
                  Node node1 = head;
                 while(node1.next != null)
                    {
                     node1=node1.next;
                    }
                Node new1=new Node(data);
                node1.next=new1;
        
        }
        return head;
    }
public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}