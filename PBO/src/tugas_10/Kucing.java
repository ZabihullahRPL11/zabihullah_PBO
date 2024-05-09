package tugas_10;

public class Kucing extends Binatang {
    private String nama;

    public Kucing(String nama, String jenis, int umur) {
        super(jenis, umur);
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}
