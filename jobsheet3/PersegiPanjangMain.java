import java.util.Scanner;

public class PersegiPanjangMain {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan jumlah persegi panjang: ");
    int length = sc.nextInt();
    PersegiPanjang[] ppArray = new PersegiPanjang[length];
    
    for (int i = 0; i < length; i++){
        ppArray[i] = new PersegiPanjang();
        System.out.println("Persegi panjang ke-" + (i+1) );
        System.out.print("Masukkan panjang: ");
        ppArray[i].panjang = sc.nextInt();
        System.out.print("Masukkan lebar: ");
        ppArray[i].lebar = sc.nextInt();
    }
    for (int i = 0; i < 3; i++){
        System.out.println("Persegi panjang ke-" + i);
        System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
    }
    sc.close();
    }
}