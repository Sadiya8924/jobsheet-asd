import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double bobotNilai, totalNilai = 0, sks = 18;
        String[][] mataKuliah = new String[9][4];
        double[][] nilai = new double[9][3];

        mataKuliah[1][0] = "Pancasila";
        mataKuliah[2][0] = "Konsep Teknologi Informasi";
        mataKuliah[3][0] = "Critical Thinking and Problem Solving";
        mataKuliah[4][0] = "Matematika Dasar";
        mataKuliah[5][0] = "Bahasa Inggris";
        mataKuliah[6][0] = "Dasar Pemrograman";
        mataKuliah[7][0] = "Praktikum Dasar Pemrograman";
        mataKuliah[8][0] = "Keselamatan dan Kesehatan Kerja";

        mataKuliah[0][0] = "Mata Kuliah";
        mataKuliah[0][1] = "Nilai Angka";
        mataKuliah[0][2] = "Nilai Huruf";
        mataKuliah[0][3] = "Bobot Nilai";

        System.out.println("Program Menghitung IP Semester");

        for (int i = 1; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nilai angka untuk MK " + mataKuliah[i][0] + " : ");
            nilai[i][0] = sc.nextDouble();
            System.out.print("Masukkan bobot sks : ");
            nilai[i][1] = sc.nextDouble();

            String nilaiHuruf;
            if (nilai[i][0] > 80) {
                nilaiHuruf = "A";
                bobotNilai = 4;
            } else if (nilai[i][0] > 73) {
                nilaiHuruf = "B+";
                bobotNilai = 3.5;
            } else if (nilai[i][0] > 65) {
                nilaiHuruf = "B";
                bobotNilai = 3;
            } else if (nilai[i][0] > 60) {
                nilaiHuruf = "C+";
                bobotNilai = 2.5;
            } else if (nilai[i][0] > 50) {
                nilaiHuruf = "C";
                bobotNilai = 2;
            } else if (nilai[i][0] > 39) {
                nilaiHuruf = "D";
                bobotNilai = 1;
            } else {
                nilaiHuruf = "E";
                bobotNilai = 0;
            }
            mataKuliah[i][2] = nilaiHuruf;
            nilai[i][2] = bobotNilai;
        }
        sc.close();
        for (int i = 1; i < nilai.length; i++) {
            totalNilai += nilai[i][2] * nilai[i][1];
        }
        double totalIP = totalNilai / sks;

        System.out.println("Hasil Konversi Nilai");
        System.out.printf("%-40s %-14s  %-14s  %s\n", mataKuliah[0][0], mataKuliah[0][1], mataKuliah[0][2], mataKuliah[0][3]);
        for (int i = 1; i < nilai.length; i++) {
            System.out.printf("%-40s %-19s  %-13s  %s\n", mataKuliah[i][0], nilai[i][0], mataKuliah[i][2], nilai[i][2]);
        }

        totalIP = Math.round(totalIP * 100) / 100d;
        System.out.println("IP Semester : " + totalIP);
    }
}