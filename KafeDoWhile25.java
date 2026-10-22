
import java.util.Scanner;

/**
 * KafeDoWhile25
 */
public class KafeDoWhile25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Deklarasi Variabel 
        int kopi, teh, roti;
        int hargaKopi = 12000;
        int hargaTeh = 7000;
        int hargaRoti = 20000;
        int totalHarga;
        String namaPelanggan;

        do {
            System.out.print("Masukan nama pelanggan (ketik 'batal' untuk keluar) :");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi Dibatalkan.");
                break;
            }
            System.out.print("Jumlah Kopi :");
            kopi = sc.nextInt();
            System.out.print("Jumlah Teh :");
            teh = sc.nextInt();
            System.out.print("Jumlah roti :");
            roti = sc.nextInt();

            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar adalah : Rp." + totalHarga);
            sc.nextLine();
        } while (true);

        System.out.println("Semua transaksi selesai");
    }
}
