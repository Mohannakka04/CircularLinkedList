package CircularLinkedList;

import java.util.Scanner;

public class Creation {
    static class Node{
        int data;
        Node next;
        Node(int value)
        {
            data = value;
            next = null;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int value = sc.nextInt();
        
        Node head = new Node(value);
        Node temp = head;
        
        for(int i=1;i<n;i++)
        {
            value = sc.nextInt();
            Node newNode = new Node(value);
            temp.next = newNode;
            temp = newNode;
        }
        temp.next = head;
        temp = head;
        do {
            System.out.println(temp.data);
            temp = temp.next;
        } while (temp!=head);

        sc.close();
    }
}
