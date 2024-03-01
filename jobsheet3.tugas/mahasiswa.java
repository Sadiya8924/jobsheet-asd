public class mahasiswa{
    String  nama, nim, jenisKelamin;
    double ipk;

    public static double hitungRataRataIPK(mahasiswa[] mahasiswaArray) {
        double totalIPK = 0;
        for (mahasiswa mhs : mahasiswaArray) {
            totalIPK += mhs.ipk;
        }
        return totalIPK / mahasiswaArray.length;
    }

    public static mahasiswa cariIPKTertinggi(mahasiswa[] mahasiswaArray) {
        mahasiswa maxIPKStudent = mahasiswaArray[0];
        for (mahasiswa mhs : mahasiswaArray) {
            if (mhs.ipk > maxIPKStudent.ipk) {
                maxIPKStudent = mhs;
            }
        }
        return maxIPKStudent;
    }
}