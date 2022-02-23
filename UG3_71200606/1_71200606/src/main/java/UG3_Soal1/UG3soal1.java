import java.util.Scanner;

public class UG3soal1 {
    public static void main(String[] args) {
        String food;
        Date expired;
        int q, g;

        Scanner a = new Scanner(System.in);
        System.out.println("====================Data Product====================");
        System.out.println("Masukan Data Product Makanan Anda");
        System.out.println("Nama Makanan: ");
        food = a.nextLine();
        System.out.println("Tanggal kadaluarsa: ");
        expired = a.nextLine();
        System.out.println("Jumlah (quantity): ");
        q = a.nextLine();
        System.out.println("Berat (gram): ");
        g = a.nextLine();

        System.out.println("====================Data Product====================");
        System.out.println("Nama makanan: " + food);
        System.out.println("Tanggal kadaluarsa: " + expired);
        System.out.println("Jumlah(quantity): " + q);
        System.out.println("Berat: " + g);
        System.out.println("====================================================");
    }
}
