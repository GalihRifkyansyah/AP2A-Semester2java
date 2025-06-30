import java.util.Scanner;

public class Act2 {
    public static void main(String[] args) {
        @SuppressWarnings("Resources")
        Scanner input = new Scanner(System.in);

        // Input nilai dari pengguna
        System.out.print("Masukan Nilai Ujian Tertulis: ");
        int nilaiTertulis = input.nextInt();

        System.out.print("Masukan Nilai Ujian Praktek: ");
        int nilaiPraktek = input.nextInt();

        // Hitung nilai rata-rata (integer)
        int rataRata = (nilaiTertulis + nilaiPraktek) / 2;

        // Tentukan status kelulusan
        if (rataRata >= 75) {
            System.out.println("Status: Selamat Anda Lulus");
        } else if (rataRata >= 60) {
            System.out.println("Status: Anda Lulus Bersyarat");
        } else {
            System.out.println("Status: Maaf, Anda Tidak Lulus");
        }

        // Tampilkan rata-rata nilai
        System.out.println("Nilai Anda Adalah: " + rataRata);
    }
}