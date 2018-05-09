package edu.wwcc.cs241.Jumper.Jonathan;
/*
 * Jonathan Jumper
 * CS241 JAVA II
 * edu.wwcc.cs241.Jumper.Jonathan
 * 5/2/2018
 */

/**
 * @brief List of Nodes.
 * <p>
 * Needs basic CRUD (Create, Read, Update, Delete) methods.
 * <p>
 * Create: constructors
 * Read: getters
 * Updates: setters
 * Delete: out of scope (destroy var or node)
 * <p>
 * Not changing my LinkedList I'm changing my Nodes, except the intial Node.
 */
public class LinkedList<V> {
    private Node<V> node;

    /**
     * Constructor
     */
    public LinkedList()
    {
        this.node = null;
    }

    /**
     * Constructor with Node param.
     *
     * @param node
     */
    public LinkedList(Node<V> node)
    {
        this.node = node;
    }

    /**
     * Append generic value as new Node to LL.
     *
     * @param value
     *     Generic value for new Node.
     */
    public void append(V value)
    {
        Node<V> node = new Node<>(value);
        if (null != this.node)
        {
            node.setNext(this.node);
        }
        this.node = node;
    }

    /**
     * Append new Node to LL.
     *
     * @param node
     *     New node to be prepend to LL.
     */
    public void append(Node<V> node)
    {
        if (null == this.node)
        {
            this.node = node;
            return;
        }
        //find the end of the ll and append to it.
        Node<V> last = this.node.getLast();
        last.setNext(node);
        node.setPrev(last);
    }

    /**
     * @return int Returns length of LL.
     */
    public int length()
    {
        int count = 0;
        Node<V> current = this.node;
        while (current != null)
        {
            current = current.getNext();
            ++count;
        }
        return count;
    }

    /**
     * Prepend new Node to LL.
     *
     * @param node
     *     New node to be prepend to LL.
     */
    public void prepend(Node<V> node)
    {
        if (null != node.getNext())
        {
            throw new IllegalArgumentException("Can not Prepend node with prev property set (has a value)");
//            IllegalArg exception is better because we are passing an invalid value/
//            throw new IndexOutOfBoundsException("Can not prepend node with prev property set (has a value)");
        }
        if (null != this.node)
        {
        }
//        if (null != this.node)
//        {
//            node.setNext(this.node);
//            this.node.setPrev(node);
//        }
//        this.node = node;
    }

    /**
     * Setter for node property.
     *
     * @param node
     *     Node to use as start of LL.
     */
    public void setNode(Node<V> node)
    {
        this.node = node;
    }

    public String toString()
    {
        return node.toString();
    }

    /*  /**
     * Insert new value at index.
     *
     * @param value
     *     int
     * @param index
     *     int
     */
 /

    public void insertAt(V value, int index)
    {
        int length = this.length();
        // Check for invalid conditions.

        /*
        Sometimes prints exception message before prior output
        *****todo: CAN WE FIX THIS???****
         */
        if (0 == length && 0 != index)
        {
            throw new IndexOutOfBoundsException(" ** Linked list is empty ** ");
        }
        if (index < 0)
        {
            throw new IndexOutOfBoundsException(" ** Index is < 0 ** ");
        }
        if (length < index)
        {
            throw new IndexOutOfBoundsException(" ** Index is > list length ** ");
        }
        // Handle special case of index = 0.
        if (0 != index) // I was taught to revers so if I just put = it will flag me first
        {
            // Needs to find the Parent Node before the index
            // so new Node can be added to parent's next pointer.
            --index; // This gets the value of the NODE AT THE INDEX of the node just before this index number
            // I want the new node to be at.
            // Initialization of vars for while loop.
            Node<V> parentNode = this.setNode(Node V >); //Initially it starts with the 1st node in LL and stuffs it's head value into var parentNode
            Node<V> nextNode = this.setNode(Node V).next;
            //Node<V> nextNode = this.setNode(Node V);
            // "" takes the ".next" value of parentNode and stuffs it into nextNode
            int position = 0;
            // Loop until just before insert point.
            while (position < index)
            {
                parentNode = nextNode;
                nextNode = nextNode.setNext(Node V); ++position;
            }
            // Inserts new Node value and link it with the old node
            // that was at this position.
            parentNode.getLast() = new Node<V>(value, setNode());
//        } else
//        {
//            // This calls my prepend method to create a LL if index == null
//            this.prepend((V)value, Node(index));
        }

        /*
         * Another way to express the test:
         * This takes the probability that you will
         * most likely not hit an empty LinkedList
         *
         * So it tests and the THEN is run right away
         * Will jump to ELSE if False
         */
        // Handle special case of index = 0.
/*        if (0 != index) // I was taught to revers so if I just put = it will flag me first
        {
            // Needs to find the Node before the index
            // so new Node can be added to it's next pointer.
            --index;
            Node<L> current = this.head;
            Node<L> nextNode = this.head.next;
            int position = 0;
            // Loop until just before insert point.
            while (position < index)
            {
                current = nextNode;
                nextNode = nextNode.next;
                ++position;
            }
            // Inserts new Node value and link it with the old node
            // that was at this position.
            current.next = new Node<>(value, nextNode);
        } else
        {
            // This calls my prepend method to create a LL if index == null
            this.prepend(value);
        }
*/
//    }
//********* INSERT AT METHOD **********
    }
