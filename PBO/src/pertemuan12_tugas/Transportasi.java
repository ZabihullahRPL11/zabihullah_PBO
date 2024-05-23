package pertemuan12_tugas;

public abstract class Transportasi implements PemesananTiket {
    private String nama;
    private String jadwal;

    public Transportasi(String nama, String jadwal) {
        this.nama = nama;
        this.jadwal = jadwal;
    }

    public String getNama() {
        return nama;
    }

    public String getJadwal() {
        return jadwal;
    }

    @Override
    public abstract boolean pesanTiket();
}