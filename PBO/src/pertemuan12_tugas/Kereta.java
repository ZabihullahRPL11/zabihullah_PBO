package pertemuan12_tugas;

public class Kereta extends Transportasi {
    public Kereta(String nama, String jadwal) {
        super(nama, jadwal);
    }

    @Override
    public boolean pesanTiket() {
        System.out.println("Memesan tiket kereta: " + getNama() + " dengan jadwal: " + getJadwal());
        // Logika pemesanan tiket kereta
        return true;
    }
}