import java.util.Scanner;
public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==========================================");
        System.out.println("Program Menghitung Keuntungan Total Perusahaan (Satuan Juta, Misal 5,9)");
        System.out.print("Masukkan jumlah perusahaan: ");
        int numCompanies = sc.nextInt();

        double totalProfitAllCompanies = 0;

        for (int c = 1; c <= numCompanies; c++) {
            System.out.println("==========================================");
            System.out.println("Perusahaan ke-" + c);
            System.out.print("Masukkan jumlah bulan untuk perusahaan ke-" + c + ": ");
            int numMonths = sc.nextInt();

            Sum sm = new Sum(numMonths);
            System.out.println("==========================================");
            for (int i = 0; i < sm.elemen; i++) {
                System.out.print("Masukkan keuntungan bulan ke-" + (i + 1) + " (Perusahaan ke-" + c + ") = ");
                sm.keuntungan[i] = sc.nextDouble();
            }
            System.out.println("==========================================");
            System.out.println("Algoritma Brute Force");
            double totalBF = sm.totalBF(sm.keuntungan);
            System.out.println("Total keuntungan perusahaan ke-" + c + " selama " + sm.elemen + " bulan adalah = " + totalBF);

            totalProfitAllCompanies += totalBF;
        }

        System.out.println("==========================================");
        System.out.println("Total keuntungan dari semua perusahaan adalah = " + totalProfitAllCompanies);
        sc.close();
    }
}