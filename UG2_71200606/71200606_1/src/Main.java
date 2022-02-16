import java.util.Scanner;

public class Main {
    Mobil M_71200606 = new Mobil();
    PejalanKaki P_71200606 = new PejalanKaki();

    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Kode lampu lalu lintas saat ini: ");
        int kodeLampu = inp.nextInt();
        if kodeLampu == 1{
            System.out.println("-----Lampu hijau-----");
            Mobil.jalan();
            PejalanKaki.tunggu();}
        if kodeLampu == 2{
            System.out.println("-----Lampu kuning-----");
            Mobil.pelan();
            PejalanKaki.bersiap();}
        if kodeLampu == 3{
            System.out.println("-----Lampu merah-----");
            Mobil.stop();
            PejalanKaki.jalan();}
        }
    }
}
