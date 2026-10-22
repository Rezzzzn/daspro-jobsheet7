
import java.util.Scanner;

/**
 * SiakadFor25
 */
public class SiakadFor25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi Variabel
        double nilai;
        double tertinggi = 0;
        double terendah = 100;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukan nilai mahasiswa ke-" + i + ":");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
        }
        System.out.println("Nilai Tertinggi :" + tertinggi);
        System.out.println("Nilai Terendah :" + terendah);
    }
}