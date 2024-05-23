package pertemuan12_tugas;

public class Bus extends Transportasi {
    public Bus(String nama, String jadwal) {
        super(nama, jadwal);
    }

    @Override
    public boolean pesanTiket() {
        System.out.println("Memesan tiket bus: " + getNama() + " dengan jadwal: " + getJadwal());
        // Logika pemesanan tiket bus
        return true;
    }
}