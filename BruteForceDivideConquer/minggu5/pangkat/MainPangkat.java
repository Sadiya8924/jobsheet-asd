import java.util.Scanner;
public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("========================");
        System.out.print("Masukkan jumlah elemen yang di hitung: ");
        int elemen = sc.nextInt();

        Pangkat[] png = new Pangkat[elemen];
        for(int i = 0; i < elemen; i++){
            png[i] = new Pangkat(i, i);
            System.out.print("Masukkan nilai yang di pangkatkan: ");
            png[i].nilai = sc.nextInt();
            System.out.print("Masukkan nilai pangkat: ");
            png[i].pangkat = sc.nextInt();
        }

        System.out.println("Pilih metode penghitungan: ");
        System.out.println("1. Metode penghitungan Brute Force");
        System.out.println("2. Metode penghitungan Divide Conquer");
        System.out.print("Pilihan: ");
        int metode = sc.nextInt();
        
        switch (metode) {
            case 1:         
                System.out.println("HASIL PANGKAT - BRUTE FORCE");
                for(int i = 0; i < elemen; i++){
                    System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                }
                break;
            case 2:
                System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
                for(int i = 0; i < elemen; i++){
                    System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                }
                break;
            default : 
                System.out.println("Pilihan tidak valid");
                break; 
        }sc.close();
    }
}