class Mahasiswa {

    String name, kelas, npm;
    int uts, uas, akhir;

    public Mahasiswa(String name, String kelas, String npm, int uts, int uas, int akhir) {
        this.name = name;
        this.kelas = kelas;
        this.npm = npm;
        this.uts = uts;
        this.uas = uas;
        this.akhir = akhir;
    }

    public void iniPerkenalan() {
        System.out.println("Nama :" + name);
        System.out.println("Kelas :" + kelas);
        System.out.println("NPM :" + npm);
    }

    public void iniNilai() {
        System.out.println("Nilai UTS :" + uts );
        System.out.println("Nilai UAS :" + uas );
        System.out.println("Nilai Akhir :" + akhir );
    }
}

public class ActU {
    public static void main(String[] args) {
        Mahasiswa person1 = new Mahasiswa("Galih", "1IA16", "50424947", 80, 85, 90);
        Mahasiswa person2 = new Mahasiswa("Adit", "1IA19", "51467712", 75, 100, 92);
        Mahasiswa person3 = new Mahasiswa("Sheva", "1IA17", "50424479", 85, 95, 87);
        person1.iniPerkenalan();
        person1.iniNilai();

        person2.iniPerkenalan();
        person2.iniNilai();

        person3.iniPerkenalan();
        person3.iniNilai();
    }
} 