package pekan1_2511531012;

import java.util.Scanner;

public class MobilDriver_2511531012 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // tambah mobil
        System.out.println("=== Input Data Mobil ===");
        System.out.print("Nama  : ");
        String nama = input.nextLine();

        System.out.print("Tahun : ");
        int tahun = input.nextInt();

        System.out.print("CC    : ");
        int cc = input.nextInt();

        System.out.print("Harga : ");
        int harga = input.nextInt();
        input.nextLine(); // buang enter

        System.out.print("Merk  : ");
        String merk = input.nextLine();

        Mobil_2511531012 m1 = Mobil_2511531012.tambahMobil(nama, tahun, cc, harga, merk);

        // tampilkan
        System.out.println("\nData Mobil:");
        System.out.println(m1);

        // ubah data (mutator)
        m1.setHarga(m1.getHarga() + 10000000);
        System.out.println("\nSetelah harga dinaikkan:");
        System.out.println(m1);

        // hapus mobil
        Mobil_2511531012.hapusMobil(m1);

        input.close();
    }
}