public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(111, "Anton");
        queue.enqueue(112, "Prita");
        queue.enqueue(113, "Yusuf");
    
        queue.displayQueue();
        queue.dequeue();
        queue.enqueue(114, "Doni");
        queue.displayQueue();
    }
}