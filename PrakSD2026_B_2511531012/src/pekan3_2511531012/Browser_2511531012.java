package pekan3_2511531012;

import java.util.Scanner;
import java.util.Stack;

public class Browser_2511531012 {

    public static void main(String[] args) {
        Stack<Website_2511531012> history = new Stack<>();
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Browser History NIM: 2511531012 ===");
            System.out.println("1. Kunjungi Website (Push)");
            System.out.println("2. Tombol Back (Pop)");
            System.out.println("3. Lihat Halaman Aktif (Peek)");
            System.out.println("4. Cek Status History");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();
            input.nextLine(); // buffer

            switch (pilihan) {

                case 1:
                    // PUSH
                    System.out.print("Masukkan Judul: ");
                    String judul = input.nextLine();

                    System.out.print("Masukkan URL: ");
                    String url = input.nextLine();

                    Website_2511531012 web = new Website_2511531012(judul, url);
                    history.push(web);

                    System.out.println("Berhasil mengunjungi halaman!");
                    break;

                case 2:
                    // POP
                    if (!history.isEmpty()) {
                        Website_2511531012 removed = history.pop();
                        System.out.println("Kembali dari halaman:");
                        System.out.println(removed);
                    } else {
                        System.out.println("History kosong! Tidak bisa kembali.");
                    }
                    break;

                case 3:
                    // PEEK
                    if (!history.isEmpty()) {
                        System.out.println("Halaman aktif:");
                        System.out.println(history.peek());
                    } else {
                        System.out.println("Tidak ada halaman yang dibuka.");
                    }
                    break;

                case 4:
                    // CEK STATUS
                    if (history.isEmpty()) {
                        System.out.println("History kosong.");
                    } else {
                        System.out.println("Jumlah history: " + history.size());
                    }
                    break;

                case 5:
                    System.out.println("Keluar dari program...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 5);

        input.close();
    }
}