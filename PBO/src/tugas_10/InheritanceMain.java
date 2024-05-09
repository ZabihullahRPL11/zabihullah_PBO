package tugas_10;

public class InheritanceMain {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("MILO", "Himalaya", 8);
        System.out.println("Nama: " + kucing.getNama());
        System.out.println("Jenis: " + kucing.getJenis());
        System.out.println("Umur: " + kucing.getUmur() + " tahun");
    }
}
