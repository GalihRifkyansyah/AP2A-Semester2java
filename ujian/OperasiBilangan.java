import java.util.Scanner;

public class OperasiBilangan {

    // Method penjumlahan
    public int tambah(int a, int b) {
        return a + b;
    }

    // Method pengurangan
    public int kurang(int a, int b) {
        return a - b;
    }

    // Method perkalian
    public int kali(int a, int b) {
        return a * b;
    }

    // Method pembagian
    public double bagi(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Error: Pembagi tidak boleh nol!");
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        OperasiBilangan kalkulator = new OperasiBilangan();

        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = input.nextInt();

        System.out.println("Pilih operasi:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");

        System.out.print("Masukkan pilihan Anda: ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Hasil penjumlahan: " + kalkulator.tambah(angka1, angka2));
                break;
            case 2:
                System.out.println("Hasil pengurangan: " + kalkulator.kurang(angka1, angka2));
                break;
            case 3:
                System.out.println("Hasil perkalian: " + kalkulator.kali(angka1, angka2));
                break;
            case 4:
                System.out.println("Hasil pembagian: " + kalkulator.bagi(angka1, angka2));
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        input.close();
    }
}
