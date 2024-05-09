package tugas_10;

public class Binatang {
    protected String jenis;
    protected int umur;

    public Binatang(String jenis, int umur) {
        this.jenis = jenis;
        this.umur = umur;
    }

    public String getJenis() {
        return jenis;
    }

    public int getUmur() {
        return umur;
    }
}
