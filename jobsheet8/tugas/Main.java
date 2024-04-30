import java.util.Scanner;
public class Main {
    public static void menu() {
        System.out.println("Pilih menu: ");
        System.out.println("1. Antri Pembeli");
        System.out.println("2. Layani Pembeli");
        System.out.println("3. Cek Pembeli Paling Depan");
        System.out.println("4. Cek Pembeli Paling Belakang");
        System.out.println("5. Cek Posisi Pembeli");
        System.out.println("6. Daftar Pembeli");
        System.out.println("7. Keluar");
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        queue antrian = new queue(5);
        int pilih;

        do {
            menu();
            System.out.print("Pilihan: ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama Pembeli: ");
                    String nama = sc.nextLine();
                    System.out.print("Nomor HP Pembeli: ");
                    int noHP = sc.nextInt();
                    sc.nextLine();
                    pembeli pembeliBaru = new pembeli(nama, noHP);
                    antrian.enqueue(pembeliBaru);
                    break;
                case 2:
                    int noHPLayani = antrian.dequeue();
                    if (noHPLayani != -1) {
                        System.out.println("Pembeli dengan nomor HP " + noHPLayani + " telah dilayani.");
                    }
                    break;
                case 3:
                    antrian.peek();
                    break;
                case 4:
                    antrian.peekRear();
                    break;
                case 5:
                    System.out.print("Nama Pembeli yang Ingin Dicek: ");
                    String namaCek = sc.nextLine();
                    antrian.peekPosition(namaCek);
                    break;
                case 6:
                    antrian.daftarPembeli();
                    break;
                case 7:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 7);
        sc.close();
    }
}
