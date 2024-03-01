import java.util.Scanner;
public class mahasiswaMain{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();
        mahasiswa[] mhArray= new mahasiswa[n];
        
        for (int i = 0; i < n; i++){
            mhArray[i] = new mahasiswa();
            System.out.println("Data Mahasiswa ke-" + (i+1));
            System.out.print("Masukkan nama: ");
            mhArray[i].nama = sc.next();
            System.out.print("Masukkan NIM: ");
            mhArray[i].nim = sc.next();
            System.out.print("Masukkan jenis kelamin: ");
            mhArray[i].jenisKelamin = sc.next();
            System.out.print("Masukkan IPK: ");
            mhArray[i].ipk = sc.nextDouble();
        }
        for (int i = 0; i < n; i++){
            System.out.println("=================================");
            System.out.println("Data Mahasiswa ke-" + (i+1));
            System.out.println("Nama: " + mhArray[i].nama);
            System.out.println("NIM: " + mhArray[i].nim);
            System.out.println("Jenis Kelamin: " + mhArray[i].jenisKelamin);
            System.out.println("Nilai IPK: " + mhArray[i].ipk);
        }
        System.out.println("=================================");

        double rataRataIPK = mahasiswa.hitungRataRataIPK(mhArray);
        System.out.println("Rata-rata IPK mahasiswa: " + rataRataIPK);

        mahasiswa maxIPKStudent = mahasiswa.cariIPKTertinggi(mhArray);
        System.out.println("Mahasiswa dengan IPK terbesar:");
        System.out.println("Nama: " + maxIPKStudent.nama);
        System.out.println("NIM: " + maxIPKStudent.nim);
        System.out.println("Jenis Kelamin: " + maxIPKStudent.jenisKelamin);
        System.out.println("Nilai IPK: " + maxIPKStudent.ipk);
        sc.close();
    }
}