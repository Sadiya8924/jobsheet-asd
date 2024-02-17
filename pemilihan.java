/**
 * pemilihan
 */
import java.util.Scanner;
public class pemilihan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input nilai
        System.out.print("Masukkan nilai Tugas : ");
        float Tugas = sc.nextFloat();
        System.out.print("Masukkan nilai Kuis : ");
        float Kuis = sc.nextFloat(); 
        System.out.print("Masukkan nilai UTS : ");
        float UTS = sc.nextFloat();
        System.out.print("Masukkan nilai UAS : ");
        float UAS = sc.nextFloat();
        sc.close();

        if (Tugas > 100 || Tugas < 0 || Kuis > 100 || Kuis < 0 || UTS > 100 || UTS < 0 || UAS > 100 || UAS < 0) {
            System.out.println("Nilai tidak valid. Masukkan nilai antara 0 dan 100.");
        } else {
            //hitung bobot nilai
            float nilaiAkhir = (Tugas * 20 / 100) + (Kuis * 20 / 100) + (UTS * 30 / 100) + (UAS * 30 / 100);

        //konversi nilai menjadi huruf
        String nilaiHuruf;
            if (80 < nilaiAkhir){
                nilaiHuruf = "A";
            }
            else if (73 < nilaiAkhir){
                nilaiHuruf = "B+";
            }
            else if(65 < nilaiAkhir){
                nilaiHuruf = "B";
            }
            else if(60 < nilaiAkhir){
                nilaiHuruf = "C+";
            }
            else if(50 < nilaiAkhir){
                nilaiHuruf = "C";
            }
            else if(39 < nilaiAkhir){
                nilaiHuruf = "D";
            }
            else{
                nilaiHuruf = "E";
            }
            System.out.println("Nilai angka = " + nilaiAkhir);
            System.out.println("Nilai huruf = " + nilaiHuruf);
        
            if (nilaiHuruf == "D" && nilaiHuruf == "E"){
                System.out.println("ANDA TIDAK LULUS");
            }
            else{
                System.out.println("SELAMAT ANDA LULUS");
            }
        }
    }
}