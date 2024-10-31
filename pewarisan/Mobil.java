package pewarisan;

public class Mobil extends Kendaraan {
    private final int jumlahPintu;
    private final String jenisBahanBakar;

    public Mobil(final String merek, final String model, final int tahunProduksi, final int jumlahPintu, final String jenisBahanBakar) {
        super(merek, model, tahunProduksi);
        this.jumlahPintu = jumlahPintu;
        this.jenisBahanBakar = jenisBahanBakar;
    }

    public void infoMobil() {
        super.infoKendaraan();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
        System.out.println("Jenis Bahan Bakar: " +jenisBahanBakar);
    }
}