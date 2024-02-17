/**
 * fungsi
 */
public class fungsi {

    private static int[][] stockBunga = {
            {1, 10, 5, 15, 7},
            {2, 6, 11, 9, 12},
            {3, 2, 10, 10, 5},
            {4, 5, 7, 12, 9}
    };

    private static int[] hargaBunga = {75000, 50000, 60000, 10000};

    public static void main(String[] args) {
        // Fungsi untuk menampilkan pendapatan setiap cabang jika semua bunga habis terjual
        System.out.println("Pendapatan Setiap Cabang Jika Semua Bunga Habis Terjual:");
        for (int i = 0; i < stockBunga.length; i++) {
            int pendapatan = hitungPendapatan(stockBunga[i]);
            System.out.println("Cabang " + stockBunga[i][0] + ": Rp " + pendapatan);
        }

        // Fungsi untuk mengetahui jumlah Stock setiap jenis bunga pada cabang royalgarden 4
        System.out.println("\nJumlah Stock Setiap Jenis Bunga pada Cabang RoyalGarden 4:");
        for (int i = 1; i < stockBunga[3].length; i++) {
            System.out.println(getNamaBunga(i) + ": " + stockBunga[3][i]);
        }

        // Informasi tambahan: Pengurangan stock karena bunga tersebut mati
        penguranganStock(4, 1, 2, 0, 5); // Menurunkan stock Aglonema sebanyak 1, Keladi sebanyak 2, dan Mawar sebanyak 5 pada cabang 4

        System.out.println("\nSetelah Pengurangan Stock karena Bunga Mati:");
        for (int i = 1; i < stockBunga[3].length; i++) {
            System.out.println(getNamaBunga(i) + ": " + stockBunga[3][i]);
        }
    }

    private static int hitungPendapatan(int[] stock) {
        int pendapatan = 0;
        for (int i = 1; i < stock.length; i++) {
            pendapatan += stock[i] * hargaBunga[i - 1];
        }
        return pendapatan;
    }

    private static String getNamaBunga(int index) {
        switch (index) {
            case 1:
                return "Aglonema";
            case 2:
                return "Keladi";
            case 3:
                return "Alocasia";
            case 4:
                return "Mawar";
            default:
                return "";
        }
    }

    private static void penguranganStock(int cabang, int aglonema, int keladi, int alocasia, int mawar) {
        stockBunga[cabang - 1][1] -= aglonema;
        stockBunga[cabang - 1][2] -= keladi;
        stockBunga[cabang - 1][3] -= alocasia;
        stockBunga[cabang - 1][4] -= mawar;
    }
}