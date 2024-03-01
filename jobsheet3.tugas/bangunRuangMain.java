import java.util.Scanner;
public class bangunRuangMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Masukkan jumlah bangun ruang kerucut: ");
		int kerucut = sc.nextInt();
		System.out.println("Masukkan jumlah bangun ruang limas segi empat: ");
		int limas = sc.nextInt();
		System.out.println("Masukkan jumlah bangun ruang bola:");
		int bola = sc.nextInt();

		kerucut[] krArray = new kerucut[kerucut];
		limasSegiEmpat[] lmArray = new limasSegiEmpat[limas];
		bola[] blArray = new bola[bola];

		//kerucut
		for (int i = 0; i < kerucut; i++){
			krArray[i] = new kerucut();
			System.out.println("Kerucut ke-" + (i+1));
			System.out.println("Masukkan panjang jari-jari: ");
			krArray[i].jariJari = sc.nextInt();
			System.out.println("Masukkan panjang sisi miring: ");
			krArray[i].sisiMiring = sc.nextInt();
		}
		for (int i = 0; i < kerucut; i++){
			System.out.println("kerucut ke-" + (i+1));
			System.out.println("Volume: " + krArray[i].hitungVolKerucut());
			System.out.println("Luas permukaan: " + krArray[i].hitungLPKerucut());
		}

		//limas
		for (int i = 0; i < limas; i++){
			lmArray[i] = new limasSegiEmpat();
			System.out.println("Limas segi empat sama sisi ke-" + (i+1));
			System.out.println("Masukkan panjang sisi: ");
			lmArray[i].sisiAlas = sc.nextInt();
			System.out.println("Masukkan tinggi: ");
			lmArray[i].tinggi = sc.nextInt();
		}
		for (int i = 0; i < limas; i++){
			System.out.println("Limas segi empat sama sisi ke-" + (i+1));
			System.out.println("Volume: " + lmArray[i].hitungVolLimas());
			System.out.println("Luas permukaan: " + lmArray[i].hitungLPLimas());
		}

		//bola
		for (int i = 0; i < bola; i++){
			blArray[i] = new bola();
			System.out.println("Bola ke-" + (i+1));
			System.out.println("Masukkan jari-jari: ");
			blArray[i].jariJari = sc.nextInt();
		}
		for (int i = 0; i < bola; i++){
			System.out.println("Bola ke-" + (i+1));
			System.out.println("Volume: " + blArray[i].hitungVolBola());
			System.out.println("Luas permukaan: " + blArray[i].hitungLPBola());
		}
		sc.close();
	}	
}