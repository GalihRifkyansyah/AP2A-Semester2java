import java.io.*;

class tambah{
    public static void main (String[]args) throws Exception{
        // Deklarasi objek input dari kelas BufferedReader
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan Jumlah Ordo Matriks n*n = ");
        int n = Integer.parseInt(input.readLine()); //1

        // Deklarasi variabel yang digunakan
        int [][] matriksA = new int [n][n];
        int [][] matriksB = new int [n][n];
        int [][] matriksC = new int [n][n];

        System.out.println("Matriks A : ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("Elemen ["+(i+1)+","+(j+1)+"] = ");
                // Input elemen matriks (i,j) ke dalam matriks A
                matriksA[i][j] = Integer.parseInt(input.readLine()); //2
            }
        }

        System.out.println("\nMatriks B : ");
        for(int i=0; i<n; i++){ //3
            for(int j=0; j<n; j++){
                System.out.print("Elemen ["+(i+1)+","+(j+1)+"] = ");
                // Input elemen matriks (i,j) ke dalam matriks B
                matriksB[i][j] = Integer.parseInt(input.readLine());
            }
        }

        System.out.println("\nMatriks C = Matriks A + Matriks B");
        System.out.print("Matriks C = \n");
        for(int i=0; i<n; i++){ //4
            System.out.print("|");
            for(int j=0; j<n; j++){
                // Matriks C merupakan penjumlahan antara Matriks A dan Matriks B
                matriksC[i][j] = matriksA[i][j] + matriksB[i][j]; //5
                System.out.print(matriksC[i][j]+" ");
            }
            System.out.println("|");
        }
    }
}