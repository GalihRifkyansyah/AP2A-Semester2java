import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StrukBelanja {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        PrintWriter fileWriter = new PrintWriter("struk_galih.txt");

        String nama, barang;
        int harga, jumlah, total;

        System.out.print("Masukkan Nama   : ");
        nama = input.nextLine();
        System.out.print("Masukkan Barang : ");
        barang = input.nextLine();
        System.out.print("Masukkan Harga  : ");
        harga = input.nextInt();
        System.out.print("Masukkan Jumlah : ");
        jumlah = input.nextInt();

        total = harga * jumlah;

        fileWriter.println("Nama        : " + nama);
        fileWriter.println("Barang      : " + barang);
        fileWriter.println("Harga       : " + harga);
        fileWriter.println("Jumlah      : " + jumlah);
        fileWriter.println("Total Bayar : " + total);

        System.out.println("\nStruk telah disimpan di 'struk_galih.txt'.");

        input.close();
        fileWriter.close();
    }
}