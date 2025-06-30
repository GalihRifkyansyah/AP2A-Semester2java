import java.util.Scanner;

public class programarray{
    public static void main(String[] args) {
        @SuppressWarnings("Resources")
        int baris1, baris2, jumlah, jumlah2, total_jumlah, total_kurang;

        Scanner input = new Scanner(System.in);
        boolean running = true;
        while (running){

            System.out.print("Masukkan Jumlah indeks Array Pertama: ");
            baris1 = input.nextInt();
            int [] array1 = new int[baris1];
            
            System.out.print("Masukkan Jumlah indeks Array Kedua: ");
            baris2 = input.nextInt();
            int [] array2 = new int [baris2];

            for(int i=0; i<array1.length; i++){
                System.out.print("Masukkan Jumlah Array pertama indeks ke " + i + " : ");
                array1[i] = input.nextInt();
            }

            for(int i=0; i<array2.length; i++){
                System.out.print("Masukkan Jumlah Array kedua indeks ke " + i + " : ");
                array2[i] = input.nextInt();
            }

            System.out.print(" ");
            System.out.print("Masukkan indeks pertama pada array pertama yang ingin dijumlahkan: ");
            jumlah = input.nextInt();
            System.out.print("Masukkan indeks kedua pada array pertama yang ingin dijumlahkan: ");
            jumlah2 = input.nextInt();
            
            total_jumlah = array1[jumlah] + array2[jumlah2];
            total_kurang = array1[jumlah] - array2[jumlah2];

            System.out.println("Hasil perjumlahan adalah: " + total_jumlah);
            System.out.print("Hasil selisihnya adalah: " + total_kurang);

            if (running) {
                System.out.print("\n Masih ingin gunakan program ini? (1= ya, 0= tidak) : ");
                int kembali = input.nextInt();
                    if (kembali == 0) {
                    running = false;
                }
            }
        }
    }
}