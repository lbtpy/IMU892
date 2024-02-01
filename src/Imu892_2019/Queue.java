package Imu892_2019;

//循环队列的出队入队
public class Queue {
    static int size = 3;
    public static void main (String[] args){
        cirQueue q = new cirQueue();
        q.front = 0;
        q.rear = q.front;
        q.flag = 0;
        enQueue(3,q);
        enQueue(4,q);
        enQueue(5,q);
        deQueue(q);
        deQueue(q);
        enQueue(6,q);
    }
    public static void enQueue(int x, cirQueue q){
        if(q.rear%size == q.front && q.flag == 1){
            System.out.println("队满");
        }
        System.out.println("入队元素"+x);
        q.dataqueue[q.rear] = x;
        q.rear = (q.rear+1) % size;
        q.flag = 1;
    }
    public static int deQueue(cirQueue q){
        if(q.front == q.rear && q.flag == 0){
            System.out.println("队空");
            return 0;
        }
        System.out.println("出队元素"+q.dataqueue[q.front]);
        q.front = (q.front + 1) % size;
        q.flag = 0;
        return 1;
    }
}
class cirQueue{
    int[] dataqueue = new int[3];
    int front,rear;
    int flag;
}