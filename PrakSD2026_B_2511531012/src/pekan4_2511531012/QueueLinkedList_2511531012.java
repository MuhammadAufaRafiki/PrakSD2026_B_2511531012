package pekan4_2511531012;

import java.util.Queue;
import java.util.LinkedList;

public class QueueLinkedList_2511531012 {

	public static void main(String[] args) {
		Queue<Integer> q_1012 = new LinkedList<>();
		for (int i=0; i<6; i++)
			q_1012.add(i);
		System.out.println("Elemen Antrian " + q_1012);
		
		int hapus_1012 = q_1012.remove();
		System.out.println("Hapus Elemen = " + hapus_1012);
		System.out.println(q_1012);
		
		int depan_1012 = q_1012.peek();
		System.out.println("Kepala Antrian = " + depan_1012);
		
		int banyak_1012 = q_1012.size();
		System.out.println("Size Antrian = " + banyak_1012);

	}

}
