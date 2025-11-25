package com.demo;

public class Node {
    int data;      
    Node next; 
    
    public Node(){
        data = 0;
        next = null;
    }

    Node(int value) {
        this.data = value;   
        this.next = null;    
    } 
    
    public void display(){
        System.out.println(this.data);
    }
}
