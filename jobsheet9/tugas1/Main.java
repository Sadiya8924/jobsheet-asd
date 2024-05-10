public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.tambahData(111, "Anton");
        list.tambahData(112, "Prita");
        list.tambahData(113, "Yusuf");
        list.tambahData(114, "Doni");

        list.tambahDataPertama(110, "Budi");
        list.tambahDataSetelah(112, 115, "Sari");
        list.tambahDataDiIndeks(2, 116, "Rina");
        list.print();
    }
}