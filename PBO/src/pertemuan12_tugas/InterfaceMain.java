package pertemuan12_tugas;

public class InterfaceMain {
    public static void main(String[] args) {
        Transportasi pesawat = new Pesawat("Garuda Indonesia", "10:00 AM");
        Transportasi kereta = new Kereta("Argo Bromo", "12:00 PM");
        Transportasi bus = new Bus("Trans Jakarta", "02:00 PM");

        // Contoh pemesanan tiket pesawat
        System.out.println("Pemesanan Tiket Pesawat: " + pesawat.pesanTiket());

        // Contoh pemesanan tiket kereta
        System.out.println("Pemesanan Tiket Kereta: " + kereta.pesanTiket());

        // Contoh pemesanan tiket bus
        System.out.println("Pemesanan Tiket Bus: " + bus.pesanTiket());
    }
}