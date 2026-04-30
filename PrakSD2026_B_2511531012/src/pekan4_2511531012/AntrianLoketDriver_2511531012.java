package pekan4_2511531012;

import java.util.Scanner;

public class AntrianLoketDriver_2511531012 {
    public static void main(String[] args) {
        Scanner input_1012 = new Scanner(System.in);
        AntrianLoket_2511531012 antrian_1012 = new AntrianLoket_2511531012(10);

        int pilih_1012;

        do {
            System.out.println("\n=== PROGRAM ANTRIAN LOKET ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Hapus Antrian");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Reverse");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih_1012 = input_1012.nextInt();
            input_1012.nextLine();

            switch (pilih_1012) {
                case 1:
                    System.out.print("Masukkan nama pelanggan: ");
                    String nama_1012 = input_1012.nextLine();
                    antrian_1012.enqueue_1012(nama_1012);
                    break;

                case 2:
                    antrian_1012.dequeue_1012();
                    break;

                case 3:
                    antrian_1012.display_1012();
                    break;

                case 4:
                    antrian_1012.reverse_1012();
                    antrian_1012.display_1012();
                    break;

                case 5:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
            }

        } while (pilih_1012 != 5);
    }
}