package edu.wwcc.cs241.Jumper.Jonathan;/*
 * Jonathan Jumper
 * CS241 JAVA II
 * edu.wwcc.cs241.Jumper.Jonathan
 * 5/1/2018
 */

// Using V for generic value instead of N to follow normal conventions.
public class Node<V> {
    private Node<V> next;
    private Node<V> prev;
    private V value;

    /**
     * Default value constructor.
     */
    public Node()
    {
        this.value = null;
        this.prev = null;
        this.next = null;
    }

    /**
     * All properties Constructor.
     *
     * @param value
     * @param prev
     * @param next
     */
    public Node(V value, Node<V> prev, Node<V> next)
    {
        this.value = value;
        this.prev = prev;
        this.next = next;
    }

    /**
     * Value only Constructor.
     *
     * @param value
     */
    public Node(V value)
    {
        this.value = value;
        this.prev = null;
        this.next = null;
    }

    /**
     * Tail recursive method to find last Node in list.
     *
     * @return
     */
    public Node<V> getLast()
    {
        Node<V> next = this.next;
        if (null != next)
        {
            // Recursive call.
            next = next.getLast();
        }
        return next;
    }

    public Node<V> getNext()
    {
        return this.next;
    }

    public void setNext(Node<V> node)
    {
        this.next = node;
    }

    public Node<V> getPrev()
    {
        return prev;
    }

    public void setPrev(Node<V> node)
    {
        this.prev = node;
    }
}
