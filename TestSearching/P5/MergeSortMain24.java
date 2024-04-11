public class MergeSortMain24 {
    public static void main(String[] args) {
        int data[] = { 10, 40, 30, 50, 70, 20, 100, 90 };
        System.out.println("sorting dengan merge sort");
        MergeSorting06 mSort = new MergeSorting06();
        System.out.println("data awal");
        mSort.printArray(data);
        mSort.mergeSort(data);
        System.out.println("setelah diurutkan");
        mSort.printArray(data);

        int keySequential = 50;
        List<Integer> indicesSequential = mSort.sequentialSearchAll(data, keySequential);
        if (indicesSequential.size() > 1) {
            System.out.println("Peringatan: Lebih dari satu hasil ditemukan untuk judul buku dengan ID " + keySequential);
            System.out.println("Indeks hasil: " + indicesSequential);
        } else if (indicesSequential.size() == 1) {
            System.out.println("Judul buku dengan ID " + keySequential + " ditemukan pada indeks " + indicesSequential.get(0));
        } else {
            System.out.println("Judul buku dengan ID " + keySequential + " tidak ditemukan");
        }
    
        int keyBinary = 70;
        int indexBinary = mSort.binarySearch(data, keyBinary);
        if (indexBinary != -1) {
            System.out.println("Judul buku dengan ID " + keyBinary + " ditemukan pada indeks " + indexBinary);
        } else {
            System.out.println("Judul buku dengan ID " + keyBinary + " tidak ditemukan");
        }
    }
}