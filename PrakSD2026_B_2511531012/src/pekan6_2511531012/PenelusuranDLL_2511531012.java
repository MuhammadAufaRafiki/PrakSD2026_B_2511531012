package pekan6_2511531012;

public class PenelusuranDLL_2511531012 {
	//fungsi penelusuran maju
	static void forwardTraversal_1012(NodeDLL_2511531012 head_1012) {
		// memulai penelusuran dari head
		NodeDLL_2511531012 curr_1012 = head_1012;
		//lanjutkan sampai akhir
		while (curr_1012 != null) {
			//print data
			System.out.print(curr_1012.data_1012 + " <-> ");
			//pindah ke node berikutnya
			curr_1012= curr_1012.next_1012;
		}
		//print spasi
		System.out.println();
	}
	//fungsi penelusuran mundur
	static void backwardTraversal_1012(NodeDLL_2511531012 tail_1012) {
		//mulai dari akhir
		NodeDLL_2511531012 curr_1012 = tail_1012;
		//lanjutkan sampai head
		while (curr_1012 != null) {
			//cetak data
			System.out.print(curr_1012.data_1012 + " <-> ");
			//pindah ke node berikutnya
			curr_1012= curr_1012.prev_1012;
		}
		//cetak spasi
		System.out.println();
	}
	
	public static void main(String[]args) {
		//cetak dll
		NodeDLL_2511531012 head_1012 = new NodeDLL_2511531012(1);
		NodeDLL_2511531012 second_1012 = new NodeDLL_2511531012(2);
		NodeDLL_2511531012 third_1012 = new NodeDLL_2511531012(3);
		
		head_1012.next_1012 = second_1012;
		second_1012.prev_1012 = head_1012;
		second_1012.next_1012 = third_1012;
		third_1012.prev_1012 = second_1012;
		
		System.out.println("Penelusuran maju: ");
		forwardTraversal_1012(head_1012);
		
		System.out.println("Penelusuran mundur: ");
		backwardTraversal_1012(third_1012);
	}

}
