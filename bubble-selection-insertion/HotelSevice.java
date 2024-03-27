class HotelService {
    Hotel[] rooms;
    int size;
    static final int MAX_SIZE = 100;

    public HotelService() {
        rooms = new Hotel[MAX_SIZE];
        size = 0;
    }

    public void tambah(Hotel H) {
        if (size < MAX_SIZE) {
            rooms[size++] = H;
        } else {
            System.out.println("Kapasitas penuh, tidak bisa menambahkan hotel baru.");
        }
    }

    public void tampilAll() {
        for (int i = 0; i < size; i++) {
            System.out.println("Hotel: " + rooms[i].nama + ", Kota: " + rooms[i].kota + ", Harga: " + rooms[i].harga + ", Bintang: " + rooms[i].bintang);
        }
    }

    public void bubbleSort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (rooms[j].harga > rooms[j + 1].harga) {
                    Hotel temp = rooms[j];
                    rooms[j] = rooms[j + 1];
                    rooms[j + 1] = temp;
                }
            }
        }
    }

    public void selectionSort() {
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (rooms[j].bintang > rooms[minIndex].bintang) {
                    minIndex = j;
                }
            }
            Hotel temp = rooms[minIndex];
            rooms[minIndex] = rooms[i];
            rooms[i] = temp;
        }
    }
}