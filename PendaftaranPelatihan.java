import java.util.Scanner;

public class PendaftaranPelatihan {
    public static void main(String[] args) {
        @SuppressWarnings("Resources")
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama peserta: ");
        String nama = input.nextLine();

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        String kategori = "";
        if (umur <= 12) {
            kategori = "Anak-anak";
        } else if (umur < 18) {
            kategori = "Remaja";
        } else if (umur <= 50) {
            kategori = "Dewasa";
        } else {
            kategori = "Lansia";
        }

        System.out.println("\nPilih Pelatihan :");
        System.out.println("1. Menari");
        System.out.println("2. Coding Dasar");
        System.out.println("3. Bahasa Inggris");
        System.out.println("4. Public Speaking");

        System.out.print("Masukkan pilihan (1-4): ");
        int pilihan = input.nextInt();

        String pelatihan = "";
        switch (pilihan) {
            case 1:
                pelatihan = "Menari";
                break;
            case 2:
                pelatihan = "Coding Dasar";
                break;
            case 3:
                pelatihan = "Bahasa Inggris";
                break;
            case 4:
                pelatihan = "Public Speaking";
                break;
            default:
                pelatihan = "Pilihan tidak tersedia";
        }

        System.out.println("\n=== RINGKASAN ===");
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Kategori Usia: " + kategori);
        System.out.println("Pelatihan Dipilih: " + pelatihan);
    }
}