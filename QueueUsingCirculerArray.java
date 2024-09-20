
    class QueueUsingCirculerArray<T> implements QueueInterface <T> {
        T[] arr;
        final int CAPACITY = 6;
        int front;
        int size;

        @SuppressWarnings("unchecked")
        public QueueUsingCirculerArray() {
            arr = (T[]) new Object[CAPACITY];
            front = 0;
            size = 0;
        }

        // append
        public void append(T anItem) {
            if (size == CAPACITY)
                throw new StackOverflowError("You can't! ");
            arr[(front + size) % CAPACITY] = anItem;
            size++;
        }

        // deappend
        public void deappend() {
            if (size == 0)
                throw new RuntimeException("The Quese is empty");
            front = (front + 1) % CAPACITY;
            size--;
        }

        // getFront
        public T getFront() {
            if (size == 0)
                throw new RuntimeException("The Quese is empty");
            return arr[front];
        }

    }

