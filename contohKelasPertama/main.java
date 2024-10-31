package contohKelasPertama;

public class Main {
    public static void main(String[] args) {
        Mobil mobilAvanza = new Mobil("Pink", "Toyota", 120);
        mobilAvanza.tampilkanInfo();
        mobilAvanza.berhenti();
        mobilAvanza.berjalan();
    }
}