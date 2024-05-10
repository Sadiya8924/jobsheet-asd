public class Queue {
    Node front, rear;

    Queue() {
        front = rear = null;
    }

    boolean isEmpty() {
        return front == null;
    }

    void enqueue(int nim, String nama) {
        Node newNode = new Node(nim, nama);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println("Mahasiswa dengan NIM " + nim + " telah ditambahkan ke antrian.");
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong. Tidak dapat dequeue.");
            return;
        }
        Node removedNode = front;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        System.out.println("Mahasiswa dengan NIM " + removedNode.nim + " telah dikeluarkan dari antrian.");
    }

    void displayQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        Node temp = front;
        System.out.println("Isi Antrian:");
        while (temp != null) {
            System.out.println("NIM: " + temp.nim + ", Nama: " + temp.nama);
            temp = temp.next;
        }
    }
}