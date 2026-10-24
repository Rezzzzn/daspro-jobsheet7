
import java.util.Scanner;

public class TugasBioskop25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int tiket;
        int total_tiket = 0;
        int total_penjualan = 0;
        int harga_tiket = 50000;
        double diskon = 0;
        double total_harga = 0;

        while (true) {
            System.out.print("Masukan jumlah tiket :");
            tiket = sc.nextInt();

            if (tiket == 0) {
                break;
            }

            if (tiket > 0 && tiket <= 4){
                total_harga = tiket * harga_tiket;
            }
            else if (tiket > 4 && tiket <= 10){
                diskon = 0.1;
                total_harga = tiket * (harga_tiket - (harga_tiket * diskon));
            }
            else if (tiket > 10 ){
                diskon = 0.15;
                total_harga = tiket * (harga_tiket - (harga_tiket * diskon));
            }
            else {
                System.out.println("Jumlah tiket tidak valid, inputkan ulang");
                continue;
            }
            System.out.println("Diskon yang di dapat : " + (int) (diskon * 100) + "%");
            System.out.println("Total harga yang harus dibayar : " + (int) total_harga);

            total_tiket += tiket;
            total_penjualan += total_harga;

        }
        System.out.println("==============================");
        System.out.println("Total tiket yang terjual : " + total_tiket);
        System.out.println("Total penjualan tiket selama 1 hari : Rp. " + total_penjualan);
    }
}
