package 자료구조;

interface Queue {
    boolean isEmpty();
    boolean isFull();
    void enqueue(char item);
    char dequeue();
    char peek();
    void clear();
}
 
public class ArrayQueue implements Queue {
    
    private int front;
    private int rear;
    private int queueSize;
    private char queueArr[];
 
    // 큐를 생성하는 생성자
    public ArrayQueue(int queueSize) {
        front = -1;    // front 포인터 초기화
        rear = -1;    // rear 포인터 초기화
        this.queueSize = queueSize;    // queue 사이즈 설정
        queueArr = new char[this.queueSize];    // 큐 배열 생성
    }
    
    public boolean isEmpty() {
        return (front == rear);
    }
    
    public boolean isFull() {
        return (rear == this.queueSize-1);
    }
    
    public void enqueue(char item) {
        if(isFull()) {
            System.out.println("Queue is full!");
        } else {             
            queueArr[++rear] = item;    // 다음 rear 포인터가 가리키는 위치에 데이터 추가
            System.out.println("Inserted Item : " + item);
        }
    }
    
    // 큐에서 데이터 추출 후 삭제
    public char dequeue() {
        if(isEmpty()) {
            System.out.println("Deleting fail! Queue is empty!");
            return 0;
        } else {
            // 큐에서 삭제할 데이터 반환
            System.out.println("Deleted Item : " + queueArr[front+1]);
 
            // front 포인터는 삭제할 위치에 있는 상태이므로 다음과 같이 (front + 1) % size 로 설정.
            // front + 1 로 설정하면 front 포인터가 마지막 요소에 위치했을 경우,
            // ArrayOutOfBoundException이 발생하기 때문에 (front + 1) % size 로 설정해줌.
            // ex) 큐의 size가 5일 때 (index 범위는 0 ~ 4)
            // index of front 3: (3 + 1) % 5 = 4
            // index of front 4: (4 + 1) % 5 = 0
            front = (front + 1) % this.queueSize;
 
            return queueArr[front];
        }
                
    }
    
    // 큐의 첫번째 데이터 추출
    public char peek() {
        if(isEmpty()) {
            System.out.println("Peeking fail! Queue is empty!");
            return 0;
        } else { 
            // front 포인터는 삭제한 위치에 있으므로 +1을 해줘서 첫번째 요소를 추출하도록 지정.
            System.out.println("Peeked Item : " + queueArr[front+1]);
            return queueArr[front+1];
        }
    }
    
    // 큐 초기화
    public void clear() {
        if(isEmpty()) {
            System.out.println("Queue is already empty!");
        } else {
            front = -1;    // front 포인터 초기화
            rear = -1;    // rear 포인터 초기화
            queueArr = new char[this.queueSize];    // 새로운 큐 배열 생성
            System.out.println("Queue is clear!");
        }
    }
    
    // 큐에 저장된 모든 데이터를 출력
    public void printQueue() {
        if(isEmpty()) {
            System.out.println("Queue is empty!");
        } else {
            System.out.print("Queue elements : ");
            // front 포인터는 -1 또는 삭제된 요소의 위치에 있기 때문에,
            // +1 위치를 시작점으로 지정.
            for(int i=front+1; i<=rear; i++) {
                System.out.print(queueArr[i] + " ");
            }
            System.out.println();
        }
    }
 
    public static void main(String args[]) {
        int queueSize = 5;
        ArrayQueue arrQueue = new ArrayQueue(queueSize);
        
        arrQueue.enqueue('A');
        arrQueue.printQueue();
        
        arrQueue.enqueue('B');
        arrQueue.printQueue();
        
        arrQueue.enqueue('C');
        arrQueue.printQueue();
        
        arrQueue.enqueue('D');
        arrQueue.printQueue();
        
        arrQueue.enqueue('E');
        arrQueue.printQueue();
        
        arrQueue.dequeue();
        arrQueue.printQueue();
        
        arrQueue.dequeue();
        arrQueue.printQueue();
        
        arrQueue.dequeue();
        arrQueue.printQueue();
        
        arrQueue.dequeue();
        arrQueue.printQueue();
        
        arrQueue.peek();
        arrQueue.printQueue();

//        arrQueue.clear();
        arrQueue.printQueue();
        
        System.out.println("the new");
        arrQueue.enqueue('A');
        arrQueue.printQueue();
        
        arrQueue.enqueue('B');
        arrQueue.printQueue();
        
        arrQueue.enqueue('C');
        arrQueue.printQueue();
        
        arrQueue.enqueue('D');
        arrQueue.printQueue();
        
        arrQueue.enqueue('E');
        arrQueue.printQueue();
        
        arrQueue.dequeue();
        arrQueue.printQueue();
        
        arrQueue.dequeue();
        arrQueue.printQueue();
        
        arrQueue.dequeue();
        arrQueue.printQueue();
        
        arrQueue.dequeue();
        arrQueue.printQueue();
        
        arrQueue.peek();
        arrQueue.printQueue();
        
        arrQueue.clear();
        arrQueue.printQueue();
    }
    
}
