package day28collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queues01 {

    /*
        1)Queue's are for storing multiple non-primitive data in the same data type
        2)Queue's are used for FIFO(First In First Out)
     */

    public static void main(String[] args) {

        Queue<String> wareHouse = new LinkedList<>();
        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Bread");
        wareHouse.add("Honey");
        wareHouse.add("Tomatoes");

        System.out.println(wareHouse);// [Milk, Meat, Bread, Honey, Tomatoes]

        String el1 = wareHouse.poll();//Retrieves and removes the head of this queue, or returns null if this queue is empty.
        //Returns the head of this queue, or null if this queue is empty
        System.out.println(el1);//Milk
        System.out.println(wareHouse);// [ Meat, Bread, Honey, Tomatoes]

        String el2 = wareHouse.peek(); //Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
        //Returns the head of this queue, or null if this queue is empty
        System.out.println(el2);//Meat
        System.out.println(wareHouse);// [ Meat, Bread, Honey, Tomatoes]

        String el3 = wareHouse.element();//Retrieves, but does not remove, the head of this queue. This method differs from peek only in that it throws an exception if this queue is empty.
        //Returns:the head of this queue
        System.out.println(el3);//Meat
        System.out.println(wareHouse);// [ Meat, Bread, Honey, Tomatoes]

        Queue<String> emptyWareHouse = new LinkedList<>();

        String el4 = emptyWareHouse.peek();
        System.out.println(el4);//null

        //String el5 = emptyWareHouse.element();//If the Queue is empty, element() method throws "NoSuchElementException"
        //System.out.println(el5);

        /*
            Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions.
            When using a capacity-restricted queue, this method is generally preferable to add, which can fail to insert an element only by throwing an exception.
            Returns: true if the element was added to this queue, else false
            Throws:
            ClassCastException – if the class of the specified element prevents it from being added to this queue
            NullPointerException – if the specified element is null and this queue does not permit null elements
            IllegalArgumentException – if some property of this element prevents it from being added to this queue
         */
        boolean result1 = wareHouse.offer("Chocolate");
        System.out.println(result1);//true
        System.out.println(wareHouse);

        /*
            Retrieves and removes the head of this queue.
            This method differs from poll() only in that it throws an exception if this queue is empty.
            Returns: the head of this queue
            Throws: NoSuchElementException – if this queue is empty
         */
        String el6 = wareHouse.remove();
        System.out.println(el6);//Meat
        System.out.println(wareHouse);// [ Bread, Honey, Tomatoes, Chocolate]


        String el7 = emptyWareHouse.poll();
        System.out.println(el7);//null

        String el8 = emptyWareHouse.remove();//NoSuchElementException
        System.out.println(el8);
    }
}
