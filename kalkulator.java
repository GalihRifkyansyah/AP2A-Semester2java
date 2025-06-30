public class kalkulator {
    // Metode untuk menjumlahkan dua angka
    public int tambah(int a, int b) {
        return a + b;
    }

    // Metode untuk mengurangkan dua angka
    public int kurang(int a, int b) {
        return a - b;
    }

    // Metode untuk mengalikan dua angka
    public int kali(int a, int b) {
        return a * b;
    }

    // Metode untuk membagi dua angka
    public double bagi(int a, int b) {
        if (b != 0) {
            return (double) a / b; // Mengembalikan hasil pembagian
        } else {
            System.out.println("Tidak bisa membagi dengan nol!");
            return 0; // Mengembalikan 0 jika pembagi nol
        }
    }

    public static void main(String[] args) {
        // Membuat objek dari kelas kalkulator
        kalkulator kalkulator = new kalkulator();

        // Memanggil metode dan menampilkan hasil
        System.out.println("Penjumlahan: " + kalkulator.tambah(7, 3));
        System.out.println("Pengurangan: " + kalkulator.kurang(10, 5));
        System.out.println("Perkalian: " + kalkulator.kali(13, 7));
        System.out.println("Pembagian: " + kalkulator.bagi(15, 5)); // Contoh pembagian dengan nol
        System.out.println("Pembagian: " + kalkulator.bagi(20, 2));
    }
}