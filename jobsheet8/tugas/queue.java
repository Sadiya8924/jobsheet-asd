public class queue {
    pembeli[] antrian;
    int front, rear, size, max;

    queue(int n) {
        max = n;
        antrian = new pembeli[max];
        size = 0;
        front = rear = -1;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == max;
    }

    void enqueue(pembeli antri) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh!");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % max;
            }
            antrian[rear] = antri;
            size++;
            System.out.println(antri.nama + " telah ditambahkan ke antrian.");
        }
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong!");
            return -1;
        } else {
            pembeli temp = antrian[front];
            front = (front + 1) % max;
            size--;
            return temp.noHp;
        }
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong!");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].nama + " - " + antrian[i].noHp);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nama + " - " + antrian[i].noHp);
            System.out.println("Jumlah elemen = " + size);
        }
    }

    void peek() {
        if (!isEmpty()) {
            System.out.println("pembeli paling depan: " + antrian[front].nama + " - " + antrian[front].noHp);
        } else {
            System.out.println("Antrian masih kosong!");
        }
    }

    void peekRear() {
        if (!isEmpty()) {
            System.out.println("pembeli paling belakang: " + antrian[rear].nama + " - " + antrian[rear].noHp);
        } else {
            System.out.println("Antrian masih kosong!");
        }
    }

    void peekPosition(String nama) {
        if (!isEmpty()) {
            for (int i = front; i != rear; i = (i + 1) % max) {
                if (antrian[i].nama.equals(nama)) {
                    System.out.println(nama + " berada di posisi antrian ke-" + ((i - front + size) % size + 1));
                    return;
                }
            }
            if (antrian[rear].nama.equals(nama)) {
                System.out.println(nama + " berada di posisi antrian ke-" + ((rear - front + size) % size + 1));
            } else {
                System.out.println(nama + " tidak ditemukan dalam antrian.");
            }
        } else {
            System.out.println("Antrian masih kosong!");
        }
    }

    void daftarPembeli() {
        if (!isEmpty()) {
            System.out.println("Daftar pembeli:");
            for (int i = front; i != rear; i = (i + 1) % max) {
                System.out.println(antrian[i].nama + " - " + antrian[i].noHp);
            }
            System.out.println(antrian[rear].nama + " - " + antrian[rear].noHp);
        } else {
            System.out.println("Antrian masih kosong!");
        }
    }
}