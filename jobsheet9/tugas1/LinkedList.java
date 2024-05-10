public class LinkedList {

    Node head, tail;

    void tambahData(int nim, String nama) {
        Node newNode = new Node(nim, nama);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    void tambahDataPertama(int nim, String nama) {
        Node newNode = new Node(nim, nama);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    void tambahDataSetelah(int nimCari, int nimBaru, String namaBaru) {
        Node temp = head;
        while (temp != null) {
            if (temp.nim == nimCari) {
                Node newNode = new Node(nimBaru, namaBaru);
                newNode.next = temp.next;
                temp.next = newNode;
                if (temp == tail) {
                    tail = newNode;
                }
                break;
            }
            temp = temp.next;
        }
    }

    void tambahDataDiIndeks(int indeks, int nim, String nama) {
        if (indeks < 0) {
            System.out.println("Indeks tidak valid");
            return;
        }
        if (indeks == 0) {
            tambahDataPertama(nim, nama);
        } else {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                if (count == indeks - 1) {
                    Node newNode = new Node(nim, nama);
                    newNode.next = temp.next;
                    temp.next = newNode;
                    if (temp == tail) {
                        tail = newNode;
                    }
                    break;
                }
                temp = temp.next;
                count++;
            }
            if (temp == null) {
                System.out.println("Indeks tidak valid");
            }
        }
    }

    void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println("NIM: " + temp.nim + ", Nama: " + temp.nama);
            temp = temp.next;
        }
    }
}