package pertemuan7;

public class TranskripMain {
    public static void main(String[] args) {
        //create objek matakuliah
        MataKuliah mk1 = new MataKuliah("001", "Algoritma dan pemrograman 1", "A", 3);
        MataKuliah mk2 = new MataKuliah("002", "Algoritma dan pemrograman 2", "BC", 3);
        MataKuliah mk3 = new MataKuliah("003", "Pemrograman Beroritentasi Objek", "B", 3);

        //create objek mahasiswa
        KartuHasilStudi khs = new KartuHasilStudi("2020");
        khs.addMataKuliah(mk1);
        khs.addMataKuliah(mk2);
        khs.addMataKuliah(mk3);

        //create objek mahasiswa
        Mahasiswa mhs = new Mahasiswa("223040119", "DudungRiyadi");

        //Create objek TranskripNilai
        TranskripNilai transkrip = new TranskripNilai(mhs);
        transkrip.addKHS(khs);
        transkrip.display();
    }
}