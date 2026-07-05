package CircularLinkedList;

import java.util.Scanner;

public class Insertion {
    static class Node
    {
        int data;
        Node next;
        Node(int value)
        {
            data = value;
            next = null;
        }
    }
    static Node insertAtBeginning(Node head,int value)
    {
        Node newNode = new Node(value);
        if(head==null)
        {
            head = newNode;
            newNode.next = head;
        }
        else{
            Node temp = head;
            while(temp.next!=head)
            {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
            head = newNode;
        }
        return head;
    }
    static Node insertAtEnd(Node head,int value)
    {
        Node newNode = new Node(value);
        if(head==null)
        {
            head = newNode;
            newNode.next = head;
            return head;
            }
        Node temp = head;
        while(temp.next!=head)
        {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
        return head;
    }
    static Node insertAfter(Node head,int key,int value)
    {
        if(head==null)
        {
            return head;
        }
        Node temp = head;
        do{
            if(key==temp.data)
            {
                Node newNode = new Node(value);
                newNode.next = temp.next;
                temp.next = newNode;
                return head;
            }
            temp = temp.next;
        }while(temp!=head);
        return head;
    }
    static void displayForward(Node head)
    {
        if(head==null)
        {
            return;
        }
        Node temp = head;
        do
        {
            System.out.println(temp.data);
            temp = temp.next;
        }while(temp!=head);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int value = sc.nextInt();
		Node head = new Node(value);
		Node temp = head;
		for(int i=1;i<n;i++){
		    value = sc.nextInt();
		    Node newNode = new Node(value);
		    temp.next = newNode;
		    temp = newNode;
		}
		temp.next = head;
		
		// int key = sc.nextInt();
		int newvalue = sc.nextInt();
		
		// head = insertAtBeginning(head,newvalue);
		head = insertAtEnd(head,newvalue);
		// head = insertAfter(head,key,newvalue);
		
		displayForward(head);

        sc.close();
	}
}

