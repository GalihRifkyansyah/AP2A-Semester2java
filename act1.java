import java.util.Scanner;

public class act1 {
    public static void main(String[] args) {
        @SuppressWarnings("Resources")
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int n = input.nextInt();

        System.out.println("Bilangan prima dari 2 sampai " + n + " adalah:");
        for (int i = 2; i <= n; i++) {
            if (isPrima(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static boolean isPrima(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }   
}