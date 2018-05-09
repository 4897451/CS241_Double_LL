package edu.wwcc.cs241.Jumper.Jonathan;

import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        // TODO: 5/3/2018   write your code here
        LinkedList<Integer> ll = new LinkedList<>();
        ll.append(555);
        System.out.print(ll);
        System.out.println("\nLinkedList length = " + ll.length());
        //ll.print();
        System.out.print(ll);
        System.out.println("\nLinkedList length = " + ll.length());
        ll.append(111);
        System.out.println("* CREATED FIRST NODE *");
        System.out.println("\nLinkedList length = " + ll.length());
        // ll.print();
        System.out.print(ll);
        System.out.println("\nLinkedList length = " + ll.length());
        System.out.print(ll);
        System.out.println("\nLinkedList length = " + ll.length());
        System.out.println();
        ll.append(222);
        ll.append(333);
        System.out.println("* Finished appending and creating the LinkedList. 111,222,333 *");
        System.out.println("\nLinkedList length = " + ll.length());
        // ll.print();
        System.out.print(ll);
        System.out.println("\nLinkedList length = " + ll.length());
        System.out.println();
        System.out.println("* Prepend Method (added 444 to beginning) *");
        ll.append(444);
        System.out.print(ll);
        System.out.println("\nLinkedList length = " + ll.length());
        System.out.println("\nLinkedList length = " + ll.length());
        //ll.print();
        System.out.print(ll);
        System.out.println("\nLinkedList length = " + ll.length());
        System.out.println();
        System.out.println("* REMOVE AT INDEX 0 *");
        //ll.removeAt(0);
        System.out.print(ll);

        //ll.print();
        System.out.print(ll);
        System.out.println("\nLinkedList length = " + ll.length());
        System.out.println();
        System.out.println("* REMOVE FIRST *");
        //ll.removeFirst();
        System.out.println("\nLinkedList length = " + ll.length());
        //ll.print();
        System.out.print(ll);
        System.out.println("\nLinkedList length = " + ll.length());
        System.out.println();
        System.out.println("* REMOVE LAST *");
        //ll.removeLast();
        System.out.println("\nLinkedList length = " + ll.length());
        //ll.print();
        System.out.print(ll);
        System.out.println("\nLinkedList length = " + ll.length());
        //******RANDOM!!!*****


        /*
         * Random for insertAt() method
         */
        System.out.println("\n* STARTING RANDOM INSERT AT INDEX *\n");
        /*
         * Stub for future randomizer method
         */
        //ll.insertRandomizer();
        Random r = new Random();
        for (int i = 0; i < 5; i++)
        {
            //ll.print();
            System.out.println("\nLinkedList length = " + ll.length());
            //System.out.println("\nLinkedList length = " + ll.length());
            // System.out.println("LinkedList length = " + ll.length() + "\n");
            int value = r.nextInt(10);
            int position = r.nextInt(6);
            System.out.println("Inserting value: " + "*" + value + "*" + " at index: " + position);
            /*
             * Calling insertAt() method
             */
            ll.insertAt(value, position);
            //ll.append(value, position);
        }
        System.out.println("Final LinkedList length = " + ll.length());


    }
}
