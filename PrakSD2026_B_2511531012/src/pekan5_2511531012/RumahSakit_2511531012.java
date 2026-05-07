package pekan5_2511531012;

import java.util.Scanner;

public class RumahSakit_2511531012 {
    private static Pasien_2511531012 head_1012 = null;//node pertama (pasien terdepan)
    private static Pasien_2511531012 tail_1012 = null;//node terakhir (pasien paling belakang)
    private static int counter_1012 = 0;//menyimpan nomor antrian (auto increment)

    // Method untuk menambah pasien (Insert at Tail / FIFO)
    public static void daftarPasien_1012(String namaPasien_1012, String penyakit_1012) {
        // Menambah nomor antrian secara otomatis
        counter_1012++;

        // Membuat node baru
        Pasien_2511531012 pasienBaru_1012 = new Pasien_2511531012(namaPasien_1012, penyakit_1012, counter_1012);
        // Jika list kosong, node baru jadi head dan tail
        if (head_1012 == null) {
            head_1012 = tail_1012 = pasienBaru_1012;
        } else {
            // Menghubungkan node terakhir ke node baru
            tail_1012.setNext_1012(pasienBaru_1012);
            // Memindahkan tail ke node baru
            tail_1012 = pasienBaru_1012;
        }
        System.out.println("Pasien berhasil didaftarkan! Nomor Antrian: "
                + pasienBaru_1012.getNomorAntrian_1012());
    }
    
    // Method untuk memanggil pasien (Delete Head)
    public static void panggilPasien_1012() {
        // Jika list kosong, tidak ada pasien
        if (head_1012 == null) {
            System.out.println("Antrian kosong!");
            return;
        }
        // Menampilkan data pasien terdepan
        System.out.println("Memanggil pasien:");
        System.out.println("No: " + head_1012.getNomorAntrian_1012());
        System.out.println("Nama: " + head_1012.getNamaPasien_1012());
        System.out.println("Keluhan: " + head_1012.getPenyakit_1012());

        // Menggeser head ke node berikutnya (hapus node depan)
        head_1012 = head_1012.getNext_1012();

        // Jika setelah dihapus list kosong, tail juga harus null
        if (head_1012 == null) {
            tail_1012 = null;
        }
    }

    // Method untuk menampilkan semua antrian (Traversal)
    public static void tampilkanAntrian_1012() {

        // Jika list kosong
        if (head_1012 == null) {
            System.out.println("Antrian kosong!");
            return;
        }

        Pasien_2511531012 temp_1012 = head_1012;
        int posisi_1012 = 1;

        // Menelusuri linked list dari head sampai null
        while (temp_1012 != null) {
            System.out.println("Posisi: " + posisi_1012 +
                    " | No: " + temp_1012.getNomorAntrian_1012() +
                    " | Nama: " + temp_1012.getNamaPasien_1012() +
                    " | Keluhan: " + temp_1012.getPenyakit_1012());

            // Pindah ke node berikutnya
            temp_1012 = temp_1012.getNext_1012();
            posisi_1012++;
        }
    }

    // Method untuk mencari pasien (Search)
    public static void cariPasien_1012(String namaPasien_1012) {
        Pasien_2511531012 temp_1012 = head_1012;
        boolean ditemukan_1012 = false;
        // Traversal untuk mencari data
        while (temp_1012 != null) {
            // Perbandingan tanpa membedakan huruf besar/kecil
            if (temp_1012.getNamaPasien_1012().equalsIgnoreCase(namaPasien_1012)) {

                System.out.println("Pasien ditemukan!");
                System.out.println("No: " + temp_1012.getNomorAntrian_1012() +
                        " | Nama: " + temp_1012.getNamaPasien_1012() +
                        " | Keluhan: " + temp_1012.getPenyakit_1012());
                ditemukan_1012 = true;
                break;
            }
            // Pindah ke node berikutnya
            temp_1012 = temp_1012.getNext_1012();
        }
        // Jika tidak ditemukan
        if (!ditemukan_1012) {
            System.out.println("Pasien tidak ditemukan!");
        }
    }

    // Method untuk cek status antrian
    public static void cekStatusAntrian_1012() {
        // Jika list kosong
        if (head_1012 == null) {
            System.out.println("Antrian kosong!");
            return;
        }
        int jumlah_1012 = 0;
        Pasien_2511531012 temp_1012 = head_1012;
        // Menghitung jumlah node dalam linked list
        while (temp_1012 != null) {
            jumlah_1012++;
            temp_1012 = temp_1012.getNext_1012();
        }
        // Menampilkan hasil
        System.out.println("Jumlah pasien: " + jumlah_1012);
        System.out.println("Pasien terdepan:");
        System.out.println("No: " + head_1012.getNomorAntrian_1012() +
                " | Nama: " + head_1012.getNamaPasien_1012() +
                " | Keluhan: " + head_1012.getPenyakit_1012());
    }

    public static void main(String[] args) {
        Scanner input_1012 = new Scanner(System.in);
        int pilihan_1012;

        do {
            System.out.println("\n=== Antrian Rumah Sakit NIM: 2511531012 ===");
            System.out.println("1. Daftarkan Pasien");
            System.out.println("2. Panggil Pasien");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Cari Pasien");
            System.out.println("5. Cek Status Antrian");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            pilihan_1012 = input_1012.nextInt();
            input_1012.nextLine();

            switch (pilihan_1012) {
                case 1:
                    System.out.print("Masukkan Nama Pasien : ");
                    String nama_1012 = input_1012.nextLine();
                    System.out.print("Masukkan Keluhan     : ");
                    String keluhan_1012 = input_1012.nextLine();
                    daftarPasien_1012(nama_1012, keluhan_1012);
                    break;
                case 2:
                    panggilPasien_1012();
                    break;
                case 3:
                    tampilkanAntrian_1012();
                    break;
                case 4:
                    System.out.print("Masukkan nama pasien: ");
                    String cari_1012 = input_1012.nextLine();
                    cariPasien_1012(cari_1012);
                    break;
                case 5:
                    cekStatusAntrian_1012();
                    break;
                case 6:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan_1012 != 6);
        
        input_1012.close();
    }
}