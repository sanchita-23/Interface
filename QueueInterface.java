public interface QueueInterface<T> {

    
 
    // add anITem to the back of the queue
    public void append(T anItem);

    // server or remove the item at the front of the Q
    public void deappend();

    // gets you the front item of the Q
    public T getFront();
}
