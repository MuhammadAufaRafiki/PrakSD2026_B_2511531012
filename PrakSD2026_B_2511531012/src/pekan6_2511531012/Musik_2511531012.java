package pekan6_2511531012;

import java.util.Scanner;

public class Musik_2511531012 {
    Lagu_2511531012 head_1012 = null;
    Lagu_2511531012 tail_1012 = null;

    // tambah lagu di akhir
    void tambahLagu_1012(String judul_1012, String penyanyi_1012) {
        Lagu_2511531012 newLagu_1012 = new Lagu_2511531012(judul_1012, penyanyi_1012);
        if (head_1012 == null) {
            head_1012 = tail_1012 = newLagu_1012;
        } else {
            tail_1012.setNext_1012(newLagu_1012);
            newLagu_1012.setPrev_1012(tail_1012);
            tail_1012 = newLagu_1012;
        }
        System.out.println("Lagu berhasil ditambahkan!");
    }

    // hapus lagu awal (head)
    void hapusLaguAwal_1012() {
        if (head_1012 == null) {
            System.out.println("Playlist kosong!");
            return; }
        head_1012 = head_1012.getNext_1012();

        if (head_1012 != null) {
            head_1012.setPrev_1012(null);
        } else {
            tail_1012 = null;
        }
        System.out.println("Lagu pertama berhasil dihapus!");
    }

    // tampil maju
    void tampilMaju_1012() {
        Lagu_2511531012 curr_1012 = head_1012;

        if (curr_1012 == null) {
            System.out.println("Playlist kosong!");
            return;
        }

        while (curr_1012 != null) {
            System.out.println(curr_1012.getJudul_1012() + " - " + curr_1012.getPenyanyi_1012());
            curr_1012 = curr_1012.getNext_1012();
        }
    }

    // tampil mundur
    void tampilMundur_1012() {
        Lagu_2511531012 curr_1012 = tail_1012;

        if (curr_1012 == null) {
            System.out.println("Playlist kosong!");
            return;
        }

        while (curr_1012 != null) {
            System.out.println(curr_1012.getJudul_1012() + " - " + curr_1012.getPenyanyi_1012());
            curr_1012 = curr_1012.getPrev_1012();
        }
    }

    // cari lagu
    void cariLagu_1012(String judul_1012) {
        Lagu_2511531012 curr_1012 = head_1012;
        boolean ketemu_1012 = false;

        while (curr_1012 != null) {
            if (curr_1012.getJudul_1012().equalsIgnoreCase(judul_1012)) {
                System.out.println("Lagu ditemukan: " + curr_1012.getJudul_1012() + " - " + curr_1012.getPenyanyi_1012());
                ketemu_1012 = true;
                break;
            }
            curr_1012 = curr_1012.getNext_1012();
        }

        if (!ketemu_1012) {
            System.out.println("Lagu tidak ditemukan!");
        }
    }

    // main program
    public static void main(String[] args) {
        Scanner input_1012 = new Scanner(System.in);
        Musik_2511531012 musik_1012 = new Musik_2511531012();

        int pilihan;

        do {
            System.out.println("\n=== Playlist Musik NIM: 2511531012 ===");
            System.out.println("1. Tambah Lagu");
            System.out.println("2. Hapus Lagu Pertama");
            System.out.println("3. Lihat Playlist (Maju)");
            System.out.println("4. Lihat Playlist (Mundur)");
            System.out.println("5. Cari Lagu");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input_1012.nextInt();
            input_1012.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Judul: ");
                    String judul = input_1012.nextLine();
                    System.out.print("Penyanyi: ");
                    String penyanyi = input_1012.nextLine();
                    musik_1012.tambahLagu_1012(judul, penyanyi);
                    break;
                case 2:
                    musik_1012.hapusLaguAwal_1012();
                    break;
                case 3:
                    musik_1012.tampilMaju_1012();
                    break;
                case 4:
                    musik_1012.tampilMundur_1012();
                    break;
                case 5:
                    System.out.print("Masukkan judul lagu: ");
                    String cari = input_1012.nextLine();
                    musik_1012.cariLagu_1012(cari);
                    break;
                case 6:
                    System.out.println("Keluar...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 6);
        input_1012.close();
    }
}