package pekan2_2511531012;

import java.util.ArrayList;
import java.util.Scanner;

public class Playlist_2511531012 {

    public static void tampilkanMenu() {
        System.out.println("\n=== Playlist Musik NIM: 2511531012 ===");
        System.out.println("1. Tambah Lagu");
        System.out.println("2. Lihat Playlist");
        System.out.println("3. Hapus Lagu");
        System.out.println("4. Cek Jumlah Lagu");
        System.out.println("5. Keluar");
        System.out.print("Pilihan: ");
    }

    public static void tambahLagu(ArrayList<Musik_2511531012> list, Scanner sc) {
        System.out.print("Masukkan Judul: ");
        String judul = sc.nextLine();

        System.out.print("Masukkan Penyanyi: ");
        String penyanyi = sc.nextLine();

        System.out.print("Masukkan Durasi (detik): ");
        int durasi = sc.nextInt();
        sc.nextLine();

        list.add(new Musik_2511531012(judul, penyanyi, durasi));
        System.out.println("Data berhasil ditambahkan!");
    }

    public static void lihatPlaylist(ArrayList<Musik_2511531012> list) {
        if (list.isEmpty()) {
            System.out.println("Playlist kosong.");
        } else {
            System.out.println("\nDaftar Lagu:");
            for (int i = 0; i < list.size(); i++) {
                System.out.println((i + 1) + ". " + list.get(i));
            }
        }
    }

    public static void hapusLagu(ArrayList<Musik_2511531012> list, Scanner sc) {
        lihatPlaylist(list);
        if (!list.isEmpty()) {
            System.out.print("Masukkan nomor lagu yang akan dihapus: ");
            int index = sc.nextInt();
            sc.nextLine();

            if (index > 0 && index <= list.size()) {
                list.remove(index - 1);
                System.out.println("Lagu berhasil dihapus.");
            } else {
                System.out.println("Nomor tidak valid.");
            }
        }
    }

    public static void cekJumlah(ArrayList<Musik_2511531012> list) {
        System.out.println("Jumlah lagu dalam playlist: " + list.size());
    }

    public static void main(String[] args) {
        ArrayList<Musik_2511531012> playlist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            tampilkanMenu();
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    tambahLagu(playlist, sc);
                    break;
                case 2:
                    lihatPlaylist(playlist);
                    break;
                case 3:
                    hapusLagu(playlist, sc);
                    break;
                case 4:
                    cekJumlah(playlist);
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 5);

        sc.close();
    }
}