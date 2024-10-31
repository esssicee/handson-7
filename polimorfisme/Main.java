package polimorfisme;

public class Main {
    private static double v;
    private static String persegi;

    public static void main(String[] args) {
        BangunDatar bangunDatar;

        bangunDatar = new Persegi(4);
        tampilkanPerhitungan(bangunDatar.hitungLuas(), bangunDatar.hitungKeliling(), "Persegi");

        bangunDatar = new SegitigaSamaSisi(4,5);
        tampilkanPerhitungan(bangunDatar.hitungLuas(), bangunDatar.hitungKeliling(), "Segitiga Sama Sisi");

        bangunDatar = new Lingkaran(4);
        tampilkanPerhitungan(bangunDatar.hitungLuas(), bangunDatar.hitungKeliling(), "Lingkaran");

    }

    private static void tampilkanPerhitungan(double v, double v1, String persegi) {
        Main.v = v;
        Main.persegi = persegi;
    }
}