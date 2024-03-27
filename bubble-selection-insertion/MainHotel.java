import java.util.Scanner;
public class MainHotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HotelService service = new HotelService();

        service.tambah(new Hotel("Hotel A", "Kota A", 100, (byte) 4));
        service.tambah(new Hotel("Hotel B", "Kota B", 150, (byte) 3));
        service.tambah(new Hotel("Hotel C", "Kota C", 120, (byte) 5));

        System.out.println("Daftar Hotel Sebelum Sorting:");
        service.tampilAll();

        System.out.println("====================================");
        System.out.println("Pilih pengurutan berdasarkan:\n1. Berdasarkan harga\n2. Berdasarkan bintang");
        System.out.print("Pilihan anda: ");
        int pilihan = sc.nextInt();
        System.out.println("====================================");

        switch(pilihan){
            case 1:
                service.bubbleSort();
                System.out.println("\nDaftar Hotel Setelah Sorting berdasarkan Harga:");
                service.tampilAll();
                break;
            case 2:
                service.selectionSort();
                System.out.println("\nDaftar Hotel Setelah Sorting berdasarkan Bintang:");
                service.tampilAll();
                break;
            default: 
                System.out.println("Pilihan tidak valid");
                break;
        }
        sc.close();
    }
}