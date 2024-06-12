import java.util.Scanner;
public class GraphMain24{

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        Graph24 gedung = new Graph24(6);
        
        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2,3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        gedung.degree(0);
        gedung.printGraph();

        gedung.removeEdge(1, 3);
        gedung.printGraph();

        GraphMatriks24 gdg = new GraphMatriks24(4);
        gdg.makeEdge(0, 1, 50);
        gdg.makeEdge(1, 0, 60);
        gdg.makeEdge(1, 2, 70);
        gdg.makeEdge(2, 1, 80);
        gdg.makeEdge(2, 3, 40);
        gdg.makeEdge(3, 0, 90);
        gdg.printGraph();
        System.out.println("Hasil setelah penghapusan edge");
        gdg.removeEdge(2, 1);
        gdg.printGraph();

        System.out.println();

        for (int i = 0; i < 4; i++){
            gdg.degree(i);
        }

        System.out.println();

        while (true) {
            System.out.print("Masukkan gedung asal (-1 untuk keluar)        : ");
            int asal = sc.nextInt();
            if (asal == -1) {
                break;
            }
            System.out.print("Masukkan gedung tujuan (-1 untuk keluar)     : " );
            int tujuan = sc.nextInt();
            if (tujuan == -1) {
                break;
            }
            gedung.tetangga(asal, tujuan);
            System.out.println();
        }
    }   
}