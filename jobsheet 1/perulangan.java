/**
 * perulangan
 */
import java.util.Scanner;
public class perulangan {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Masukkan NIM anda : ");
        String nim = sc.nextLine();

        int n = Integer.parseInt(nim.substring(nim.length() - 2));
        sc.close();

        if (n < 10) {
            n += 10;
        }

        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            } else if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }
    }
}