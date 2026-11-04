class MyCircularDeque {

    int front;
    int rear;
    int[] queue;
    int k;

    public MyCircularDeque(int k) {
        this.k = k;
        front = -1;
        rear = -1;
        queue = new int[k];
    }
    
    public boolean insertFront(int value) {
        if(isFull()) return false;

        if(isEmpty()){
            front = 0;
            rear = 0;
        }else{
            front = (front - 1 + k)%k;
        }

        queue[front] = value;
        return true;

    }

    

    public boolean insertLast(int value) {

        if(isFull()){
            return false;
        }

        if(isEmpty()){
            front = 0;
        }

        rear = (rear + 1)%k;
        queue[rear] = value;
        return true;
    }

    public boolean deleteFront() {
        if(isEmpty()) return false;

        if(front == rear){
            front = -1;
            rear = -1;
        }else{
            front = (front + 1) % k;
        }
        return true;
         
    }
    
    public boolean deleteLast() {
        if(isEmpty()){
            return false;
        }

        if(front ==  rear){
            front = -1;
            rear = -1;
        }else{
            rear = (rear - 1 + k)%k;
        }
        return true;
    }
    
    public int getFront() {
        if(isEmpty()) return -1;
        return queue[front];
    }
    
    public int getRear() {
        if(isEmpty()) return -1;
        return queue[rear];
    }
    
    public boolean isEmpty() {
        return front == -1;
    }
    
    public boolean isFull() {
        return (rear + 1) % k == front;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */