package CircularLinkedList;

import java.util.Scanner;

public class Deletion {
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
    static Node deleteAtFirst(Node head)
    {
        if(head == null || head.next == head)
        {
            return null;
        }
        Node temp = head;
        while(temp.next!=head)
        {
            temp = temp.next;
        }
        temp.next = head.next;
        head = head.next;
        return head;
    }

    static Node deleteAtLast(Node head)
    {
        if(head==null || head.next == head)
        {
            return null;
        }

        Node temp = head;
        while(temp.next.next!=head)
        {
            temp = temp.next;
        }
        temp.next = head;
        return head;
    }
    static Node deleteByvalue(Node head,int value)
    {
        if(head==null)
        {
            return null;
        }
        if(head.data==value)
        {
            return deleteAtFirst(head);
        }
        Node ptr = head;
        Node preptr;
        do {
            preptr = ptr;
            ptr = ptr.next;
            if(ptr.data==value)
            {
                preptr.next = ptr.next;
                return head;
            }
        } while (ptr!=head);
        System.out.println("Value not found");
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
    public static void main(String[] args) {
        
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
        
        int valueToDelete = sc.nextInt();
        head = deleteByvalue(head, valueToDelete);
        displayForward(head);

        sc.close();
	}
}