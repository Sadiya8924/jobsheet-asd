public class mahasiswa{
    String  nama, nim, jenisKelamin;
    double ipk;

    public static double hitungRataRataIPK(mahasiswa[] mhsArray) {
        double totalIPK = 0;
        for (mahasiswa mhs : mhsArray) {
            totalIPK += mhs.ipk;
        }
        return totalIPK / mhsArray.length;
    }

    public static mahasiswa cariIPKTertinggi(mahasiswa[] mhsArray) {
        mahasiswa IPKTertinggi = mhsArray[0];
        for (mahasiswa mhs : mhsArray) {
            if (mhs.ipk > IPKTertinggi.ipk) {
                IPKTertinggi = mhs;
            }
        }
        return IPKTertinggi;
    }
}