import java.util.Scanner;
class NasabahMain {
    
    public static void menu(){
        System.out.println("Pilih menu: ");
        System.out.println("1. Antrian baru");
        System.out.println("2. antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek antrian paling belakang");
        System.out.println("5. Cek semua antrian");
        System.out.println("---------------------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc.nextInt();
        sc.nextLine();
        Nasabah antri = new Nasabah(jumlah);
        int pilih;

        do{
            menu();
            System.out.println("Pilihan: ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch(pilih){
                case 1:
                    System.out.print("No Rekening: ");
                    String norek = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Alamat: ");
                    String alamat = sc.nextLine();
                    System.out.print("Umur: ");
                    int umur = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Jumlah saldo: ");
                    double saldo = sc.nextDouble();
                    sc.nextLine();
                    Nasabah nb = new Nasabah(norek, nama, alamat, umur, saldo);
                    antri.Enqueue(nb);
                    break;
                case 2:
                    Nasabah data= antri.Dequeue();
                    if(!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) && data.umur != 0 && data.saldo != 0){
                        System.out.println("Data yang dikeluarkan: " + data);
                        break;
                    }
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.peekRear();
                    break;
                case 5:
                    antri.print();
                    break;                    
            } 
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
        sc.close();
    }
}