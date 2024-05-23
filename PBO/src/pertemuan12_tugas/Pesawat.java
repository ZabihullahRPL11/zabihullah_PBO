package pertemuan12_tugas;

public class Pesawat extends Transportasi {
    public Pesawat(String nama, String jadwal) {
        super(nama, jadwal);
    }

    @Override
    public boolean pesanTiket() {
        System.out.println("Memesan tiket pesawat: " + getNama() + " dengan jadwal: " + getJadwal());
        // Logika pemesanan tiket pesawat
        return true;
    }
}