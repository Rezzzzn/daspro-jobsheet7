
import java.util.Scanner;

public class TugasParkir25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int jenis, durasi, total = 0;

        while (true) {
            System.out.print("Masukan jenis (1 : Mobil , 2 : Motor , 0 : Keluar) :");
            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukan durasi :");
                durasi = sc.nextInt();
                if (jenis == 1) {
                    total += durasi * 3000;
                }else {
                    total+= durasi * 2000;
                }
            } else if (jenis == 0 ) {
                break;
            } else {
                System.out.println("Jenis kenadaraan tidak valid, silahkan coba lagi");
            }
        }
        System.out.println("Total pembayaran kendaraan : Rp." + total);
    }
}
