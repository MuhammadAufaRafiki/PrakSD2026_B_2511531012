package pekan4_2511531012;

import java.util.Iterator;
import java.util.Queue;
import java.util.LinkedList;

public class IterasiQueue_2511531012 {

	public static void main(String[] args) {
		Queue<String> q_1012 = new LinkedList<>();
		q_1012.add("Praktikum");
		q_1012.add("Struktur");
		q_1012.add("Data");
		q_1012.add("Dan");
		q_1012.add("Algoritma");
		Iterator<String> iterator = q_1012.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next()+ " ");
		}

	}
}
