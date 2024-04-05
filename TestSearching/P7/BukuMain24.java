import java.util.Scanner;
public class BukuMain24 {
    public static void main(String[] args){
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        PencarianBuku24 data = new PencarianBuku24();
        int jmlBuku = 5;

        System.out.println("---------------------------------------------------------");
        System.out.println("Masukkan data Buku secara Urut dari kode buku Terkecil: ");
        for (int i = 0; i < jmlBuku; i++){
            System.out.println("-------------------");
            System.out.print("Kode buku \t: ");
            int kodeBuku = sc1.nextInt();
            System.out.print("Judul buku \t: ");
            String judulBuku = sc2.nextLine();
            System.out.print("Tahun terbit \t: ");
            int tahunTerbit = sc1.nextInt();
            System.out.print("Pengarang \t: ");
            String pengarang = sc2.nextLine();
            System.out.print("Stock \t\t: ");
            int stock = sc1.nextInt();

            Buku24 m = new Buku24(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }
        System.out.println("---------------------------------------------------------");
        System.out.println("Data keseluruhan buku : ");
        data.tampil();

        System.out.println("_________________________________________________________");
        System.out.println("_________________________________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan kode buku yang dicari : ");
        System.out.print("Kode buku : ");
        int cari = sc1.nextInt();
        System.out.println("Menggunakan sequential Search");
        int posisi = data.FindSearch(cari);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);

        sc1.close();
        sc2.close();
    }
}