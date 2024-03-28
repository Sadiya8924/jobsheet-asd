public class showroomMain {
    public static void main(String[] args) {
        showroom[] arrMobil = {
            new showroom("BMW", "M2 Coupe", 2016, 6816, 728),
            new showroom("Ford", "Fiesta ST", 2014, 3921, 575),
            new showroom("Nissan", "370Z", 2009, 4360, 657),
            new showroom("Subaru", "BRZ", 2014, 4058, 609),
            new showroom("Subaru", "Impreza WRX STI", 2013, 6255, 703),
            new showroom("Toyota", "AE86 Trueno", 1986, 3700, 553),
            new showroom("Toyota", "86/GT86", 2014, 4180, 609),
            new showroom("Volkswagen", "Golf GTI", 2014, 4180, 631)
        };

        int accTertinggi = cariAccTertinggi(arrMobil, 0, arrMobil.length - 1);
        System.out.println("Top Acceleration Tertinggi: " + accTertinggi);

        int accTerendah = cariAccTerendah(arrMobil, 0, arrMobil.length - 1);
        System.out.println("Top Acceleration Terendah: " + accTerendah);

        int totalPower = 0;
        for (showroom showroom : arrMobil) {
            totalPower += showroom.topPower;
        }
        double averagePower = (double) totalPower / arrMobil.length;
        System.out.println("Rata-rata Top Power: " + averagePower);
    }

    public static int cariAccTertinggi(showroom[] arrMobil, int start, int end) {
        if (start == end) {
            return arrMobil[start].topAcceleration;
        }

        int mid = (start + end) / 2;
        int kiriTertinggi = cariAccTertinggi(arrMobil, start, mid);
        int kananTertinggi = cariAccTertinggi(arrMobil, mid + 1, end);

        return Math.max(kiriTertinggi, kananTertinggi);
    }

    public static int cariAccTerendah(showroom[] arrMobil, int start, int end) {
        if (start == end) {
            return arrMobil[start].topAcceleration;
        }

        int mid = (start + end) / 2;
        int kiriTerendah = cariAccTerendah(arrMobil, start, mid);
        int kananTerendah = cariAccTerendah(arrMobil, mid + 1, end);

        return Math.min(kiriTerendah, kananTerendah);
    }
}