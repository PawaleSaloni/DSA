package com.demo;

public class LinkedList {
    
    Node head; 
    Node previousNode;
    Node toDelete;  

    public LinkedList() {
        head = null;   
    }

    //Insert
    public void insert(int item){
        Node theNode = new Node(item);   
        if(head == null) {               
            head = theNode;              
        }
        else{
            Node current = head;             
            while (current.next != null) {   
                current = current.next;
            }
            current.next = theNode;  
        }        
    }

    //Search
    public boolean search(int data){
        boolean status = false;
        Node current = head;             
        while (current != null) { 
            previousNode = current;
            current = current.next;
            if (current.data == data) {
                toDelete = current;
                status = true;  
                System.out.println(status);
                return status;
            }
        }
        System.out.println(status);  
        return status;
    }

    //Remove
    public void remove(int data){
        if (head.data==data){
            head =head.next;
        }
        else{
            Node current= toDelete;
            if(search(data)){
                previousNode.next=current.next;
                current = null;
            }
        }
    }

    //Display
    public void display(){
        System.out.println("-------------");
        Node current = head;             
        while(current != null){          
            System.out.println(current.data+ "--->");  
            current = current.next;       
        }
        System.out.println("-----------");
    }
}
