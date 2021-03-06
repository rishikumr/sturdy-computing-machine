//Task:Write a Calculator class with a single method: int power(int,int). The power method takes two integers, n and p , as parameters and returns the integer result of n^p. If either n or p is negative, then the method must throw an exception with the message: n and p should be non-negative.


import java.io.*;
import java.util.*;


class Node{
     char ch;
    Node link;
    
}

public class Queues_and_Stacks {
    
    private int n;
    private Node top;
   
    private int p;
    private Node start;
    private Node end;

    
   
    //  Initializes an empty stack.
    
    public Queues_and_Stacks(){
        top =null;
        n=0;
        p=0;
        start=null;
        end=null;       
    }
    
    void pushCharacter(char ch){
        Node neww = new Node();
        neww.ch = ch;
        
        if(n!=0)
        {
            neww.link=top;
           
        }
         top = neww;
        n++;
      //  System.out.println(ch);
        
        
    }
    
     char popCharacter(){
            
          if (n!=0) {
         char ch1 = top.ch;     
         top = top.link;
         n--;
         // System.out.println(ch1);
        return ch1;
          }
         else{
             return 0;
         }
         
          
        
    }
    
     
    void enqueueCharacter(char ch){
        Node new2= new Node();
         new2.ch=ch;
       if(p==0){ 
        start = new2;
        end = new2;
        p++;
       // System.out.println(ch);
               }
        
        else{ 
        end.link = new2;
        end=new2;
        p++;
       // System.out.println(ch);
        }
        
        
    }
    
   
        
    char dequeueCharacter(){
     
       
        char ch1= start.ch;
        if(p!=0)
        {
           start=start.link;
           p--;
          // System.out.println(ch1);
        }
           return ch1;
        
    }
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Queues_and_Stacks object:
        Queues_and_Stacks p = new Queues_and_Stacks();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
	
	
