package pertemuan10;

public class InheritanceMain {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("1001", "Aan Setiawan", "Bandung");
        System.out.println(mhs.getNrp() + "-" + mhs.getNama() + "_" + mhs.getAlamat());
    }
}