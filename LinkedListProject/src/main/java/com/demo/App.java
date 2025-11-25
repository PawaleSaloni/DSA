package com.demo;

public class App {
    public static void main(String[] args) {
        
        // Creating a new LinkedList object
        LinkedList list = new LinkedList();

        list.insert(45);
        list.insert(67);
        list.insert(87);
        list.insert(64);
        list.insert(112);

        list.display();

        list.search(87);
        list.search(67);

        list.remove(45);
        list.display();
    }
    
}
