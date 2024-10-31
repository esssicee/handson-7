package abstraksi;

public class Kendaraan {
    String warna;

    public Kendaraan(final String warna) {
        this.warna = warna;
    }

    void bergerak() {

    }

    void info() {
        System.out.println("Warna Kendaraan: " + warna);
    }
}