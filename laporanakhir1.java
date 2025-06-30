import java.io.*;

class laporanakhir1{
    public static void main (String[] args) throws IOException{
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));

        int [] jum = new int[10];
        int [] v1 = new int[10];
        int [] v2 = new int[10];

        System.out.print("Masukkan jumlah elemen vektor\t: ");
        int n = Integer.parseInt(input.readLine());

        System.out.println("Vektor 1");
        for(int i=0; i<n; i++){
            System.out.print("Elemen [1, "+(i+1)+"] = ");
            v1[i] = Integer.parseInt(input.readLine());
        }

        System.out.println("\nVektor 2");
        for(int i=0; i<n; i++){
            System.out.print("Elemen [2, "+(i+1)+"] = ");
            v2[i] = Integer.parseInt(input.readLine());
        }

        System.out.print("\nNilai Skalar : ");
        int skalar = Integer.parseInt(input.readLine());

        // penjumlahan vektor
        System.out.print("\nPenjumlahan Vektor\t: [");
        for(int i=0; i<n; i++){
            jum[i] = v1[i] + v2[i];
            System.out.print(jum[i]);
            if(i != n-1){
                System.out.print(", ");
            }
        }
        System.out.print("]");

        // pengurangan vektor
        System.out.print("\nPengurangan Vektor\t: [");
        for(int i=0; i<n; i++){
            jum[i] = v1[i] - v2[i];
            System.out.print(jum[i]);
            if(i != n-1){
                if(jum[i] < 0){
                    System.out.print(".. (vektor berlawanan arah)");
                }
                System.out.print(", ");
            }
        }
        System.out.print("]");

        // perkalian vektor
        System.out.print("\nPerkalian Vektor\t: [");
        for(int i=0; i<n; i++){
            jum[i] = skalar * v1[i];
            System.out.print(jum[i]);
            if(i != n-1){
                if(jum[i] < 0){
                    System.out.print(".. (vektor berlawanan arah)");
                }
                System.out.print(", ");
            }
        }
        System.out.print("]");

        // pembagian vektor
        System.out.print("\nPembagian Vektor\t: [");
        for(int i=0; i<n; i++){
            jum[i] = v1[i] / v2[i];
            System.out.print(jum[i]);
            if(i != n-1){
                System.out.print(", ");
            }
        }
        System.out.print("]");

    }
}