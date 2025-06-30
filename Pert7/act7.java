import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class actu7 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String nama, npm, grade, keterangan;
        int pilih, nilai = 0;

        PrintStream diskWriter = new PrintStream("patah.txt"); // Untuk File .txt gunakan nama dan npm masing - masing
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("===========Universitas Gunadarma===========");
            System.out.println("1. Input Nilai");
            System.out.println("2. Keluar");
            System.out.println("===========================================");
            System.out.print("=> Pilihan : ");
            pilih = input.nextInt();
            System.out.println("");

            switch (pilih) {
                case 1:
                    System.out.print("Nama : ");
                    nama = input.next();
                    System.out.print("NPM : ");
                    npm = input.next();
                    System.out.print("Nilai : ");
                    nilai = input.nextInt();

                    if (nilai >= 80) {
                        grade = "A";
                        keterangan = "Selamat Anda Lulus";
                    } else if (nilai >= 70) {
                        grade = "B";
                        keterangan = "Selamat Anda Lulus";
                    } else if (nilai >= 60) {
                        grade = "C";
                        keterangan = "Selamat Anda Lulus";
                    } else if (nilai >= 50) {
                        grade = "D";
                        keterangan = "Anda Harus Mengulang";
                    } else {
                        grade = "E";
                        keterangan = "Anda Harus Mengulang";
                    }

                    System.out.println("\nNama: " + nama + "\nNPM: " + npm + "\nNilai: " + nilai + "\nGrade: " + grade + "\nKeterangan: " + keterangan + "\n");
                    diskWriter.println("Nama: " + nama + "\nNPM: " + npm + "\nNilai: " + nilai + "\nGrade: " + grade + "\nKeterangan: " + keterangan);
                    diskWriter.println("");
                    break;

                case 2:
                    System.out.println("Terima Kasih");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Pilihan Tidak Tersedia");
            }

        } while (pilih != 2);

        input.close();
        diskWriter.close();
    }
}
