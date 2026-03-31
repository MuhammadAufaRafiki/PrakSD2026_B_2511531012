package pekan1_2511531012;
import java.util.Scanner;

public class JamDriver2_2511531012 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("=== Program Driver Objek Jam ===");
		//1.input 1
		System.out.println("\n--- Input Jam 1 ---");
		Jam_2511531012 j1 = buatJamDariInput(input);
		
		//2
		System.out.println("\n--- Input Jam 2 ---");
		Jam_2511531012 j2 = buatJamDariInput(input);
		
		//3.menampilkan data
		System.out.println("\n--- Hasil Operasi ---");
		System.out.println("Jam 1 (String)      :"+j1.toString());
		System.out.println("Jam 2 (String)      :"+j2.toString());
		System.out.println("Jam 1 dalam deti    :"+j1.toSeconds());
		System.out.println("Jam 2 dalam deti    :"+j2.toSeconds());
		
		//4.operasi
		int perbandingan = j1.compareTo(j2);
		if (perbandingan >0) {
			System.out.println("Status                                : Jam 1 lebih lambat (setelah) jam 2");
		} else if (perbandingan <0) {
			System.out.println("Status                                : Jam 1 lebih awal (sebelum) jam 2");
		} else {
			System.out.println("Status                                : Jam 1 dan jam 2 sama persis");
		}
		
		//5
		System.out.println("Durasi (J1 ke J2)      : " + Jam_2511531012.durasiDetik(j1, j2) + " detik");
		
		Jam_2511531012 jNext = j1.nextSecond();
		System.out.println("Jam 1 Detik Berikutnya : " + jNext);
		
		Jam_2511531012 jPrev = j1.prevSecond();
		System.out.println("Jam 1 Detik Sebelumnya : " + jPrev);
		
		//6
		Jam_2511531012 jHasilPlus = j1.plus(j2);
		System.out.println("Hasil J1 + J2          : " + jHasilPlus);
		
		input.close();
		System.out.println("\nProgram Selesai.");

	}
	private static Jam_2511531012 buatJamDariInput(Scanner sc) {
		int h, m, s;
		while (true) {
			System.out.print("Masukkan Jam (0-23)    : ");
			h = sc.nextInt();
			System.out.print("Masukkan Menit (0-59)  : ");
			m = sc.nextInt();
			System.out.print("Masukkan Detik (0-59)  : ");
			s = sc.nextInt();
			
			if (Jam_2511531012.isValid(h,  m, s)) {
				return new Jam_2511531012(h, m, s);
			} else {
				System.out.println("[Error] Input tidak valid! Silakan ulangi.\n");
			}
		}
	}
	

}
