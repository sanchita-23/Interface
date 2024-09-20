import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class QueueTest {
    QueueInterface<Integer> q1;
    QueueInterface<Integer> q2;

    public QueueTest() {
        q1 = new QueueUsingLikedList<Integer>();
        q2 = new QueueUsingCirculerArray<Integer>();
    }

    @Test
    public void test1() {
        q1.append(6);
        q1.append(4);
        q1.append(7);
        q1.append(3);
        q1.append(8);
        q1.deappend();// front to 1
        q1.deappend();// front to 2
        q1.append(9);
        q1.append(5);
        // System.out.println(q1.getFront()); // 7 is expected
        assertEquals(Integer.valueOf(7), q1.getFront());
    }

    @Test
    public void test2() {
        q2.append(6);
        q2.append(4);
        q2.append(7);
        q2.append(3);
        q2.append(8);
        q2.deappend();// front to 1
        q2.deappend();// front to 2
        q2.append(9);
        q2.append(5);
        // System.out.println(q2.getFront()); // 7 is expected
        assertEquals(Integer.valueOf(7), q2.getFront());
    }
}