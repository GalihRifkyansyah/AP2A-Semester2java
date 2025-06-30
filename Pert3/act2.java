import java.util.Scanner;

public class act2 {
    public static void main(String[] args) {
        @SuppressWarnings("Resources")
        Scanner input = new Scanner(System.in);
        String nama = "", npm = "", kelas = "", jurusan = "";
        int pilihan;
        boolean running = true;

        while (running) {
            System.out.println("================Menu Utama================");
            System.out.println("1. Input Biodata");
            System.out.println("2. Segitiga siku-siku");
            System.out.println("3. Menentukan Bilangan Ganjil atau Genap");
            System.out.println("4. Tampilkan Biodata");
            System.out.println("5. Keluar");
            System.out.print("Pilihan : ");
            pilihan = input.nextInt();
            input.nextLine(); // membersihkan buffer

            switch (pilihan) {
                case 1:
                    System.out.println("==============Input Biodata===============");
                    System.out.print("Masukkan Nama : ");
                    nama = input.nextLine();
                    System.out.print("Masukkan NPM : ");
                    npm = input.nextLine();
                    System.out.print("Masukkan Kelas : ");
                    kelas = input.nextLine();
                    System.out.print("Masukkan Jurusan : ");
                    jurusan = input.nextLine();
                    break;

                case 2:
                    System.out.println("==============Segitiga Siku-Siku===============");
                    System.out.print("Masukkan tinggi segitiga : ");
                    int tinggi = input.nextInt();
                    for (int i = 1; i <= tinggi; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("=============Menentukan Bilangan Ganjil atau Genap=============");
                    System.out.print("Masukkan bilangan : ");
                    int bilangan = input.nextInt();
                    if (bilangan % 2 == 0) {
                        System.out.println(bilangan + " adalah bilangan genap");
                    } else {
                        System.out.println(bilangan + " adalah bilangan ganjil");
                    }
                    break;

                case 4:
                    System.out.println("=============Tampilkan Biodata=============");
                    System.out.println("Nama    : " + nama);
                    System.out.println("NPM     : " + npm);
                    System.out.println("Kelas   : " + kelas);
                    System.out.println("Jurusan : " + jurusan);
                    break;

                case 5:
                    running = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

            if (running) {
                System.out.print("\nKembali ke menu utama? (1= ya, 0= tidak) : ");
                int kembali = input.nextInt();
                if (kembali == 0) {
                    running = false;
                }
            }
        }

        System.out.println("Program selesai.");
        input.close();
    }
}
