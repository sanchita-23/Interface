
 // another CDT
public class QueueUsingLikedList<T> implements QueueInterface<T> {
    Node<T> front;
    Node<T> back;

    QueueUsingLikedList() {
        front = null;
        back = null;
    }

    // append
    public void append(T anItem) {
        // 1
        Node<T> newNode = new Node<T>(anItem); // 1
        if (front == null) {
            front = newNode;
            back = newNode;
        } else {
            // only if the queue is not empty
            // 2
            back.next = newNode;

            // 3
            back = newNode;
        }

    }

    // deappend
    public void deappend() {
        if (front == null)
            return;

        if (front.next == null) {
            // the queue of size 1
            front = front.next;
            back = back.next;
        } else {
            // the queue is not empty
            front = front.next;
        }
    }

    // getFront
    public T getFront() {
        if (front == null)
            return null;

        return front.data;
    }

   

 

}

