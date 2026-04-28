package pekan4_2511531012;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseData_2511531012 {

	public static void main(String[] args) {
		Queue<Integer> q_1012= new LinkedList<Integer>();
		q_1012.add(1);
		q_1012.add(2);
		q_1012.add(3);
		System.out.println("sebelum reverse" + q_1012);
		Stack<Integer> s = new Stack<Integer>();
		while (!q_1012.isEmpty()) {
			s.push(q_1012.remove());
		}
		while (!s.isEmpty()) {
			q_1012.add(s.pop());
		}
		System.out.println("sesudah reverse = " + q_1012);

	}

}
