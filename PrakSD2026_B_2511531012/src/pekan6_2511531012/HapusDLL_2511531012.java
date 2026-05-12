package pekan6_2511531012;

public class HapusDLL_2511531012 {
	
	public static NodeDLL_2511531012 delHead_1012(NodeDLL_2511531012 head_1012) {
		if(head_1012 == null) {
			return null; }
		head_1012 = head_1012.next_1012;
		if(head_1012 != null) {
			head_1012.prev_1012 = null; }
		return head_1012; 
	}
	
	public static NodeDLL_2511531012 delLast_1012(NodeDLL_2511531012 head_1012) {
		if(head_1012 == null ) {
			return null; }
		if(head_1012.next_1012 == null) {
			return null; }
		NodeDLL_2511531012 curr_1012 = head_1012;
		while (curr_1012.next_1012 != null) {
			curr_1012 = curr_1012.next_1012;
		}
		
		if(curr_1012.prev_1012 != null) {
			curr_1012.prev_1012.next_1012 = null;}
		return head_1012;
	}
	
	public static NodeDLL_2511531012 delPos_1012(NodeDLL_2511531012 head_1012, int pos_1012) {
		if (head_1012 == null) {
			return head_1012; }
		NodeDLL_2511531012 curr_1012 = head_1012;
		for (int i = 1; curr_1012 != null && i < pos_1012;i++) {
			curr_1012 = curr_1012.next_1012;
		}
		if (curr_1012 == null) {
			return head_1012;}
		
		if (curr_1012.prev_1012 != null) {
			curr_1012.prev_1012.next_1012 = curr_1012.next_1012;}
		if(curr_1012.next_1012 != null) {
			curr_1012.next_1012.prev_1012 = curr_1012.prev_1012;}
		
		if (head_1012 == curr_1012) {
			head_1012 = curr_1012.next_1012;
		}
		return head_1012;
	}
	public static void printList_1012(NodeDLL_2511531012 head_1012) {
		NodeDLL_2511531012 curr_1012 = head_1012;
		while (curr_1012 != null) {
			System.out.print(curr_1012.data_1012 + " <-> ");
			curr_1012 = curr_1012.next_1012;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		NodeDLL_2511531012 head_1012 = new NodeDLL_2511531012(1);
		head_1012.next_1012 = new NodeDLL_2511531012(2);
		head_1012.next_1012.prev_1012 = head_1012;
		head_1012.next_1012.next_1012 = new NodeDLL_2511531012(3);
		head_1012.next_1012.next_1012.prev_1012 = head_1012.next_1012;
		head_1012.next_1012.next_1012.next_1012 = new NodeDLL_2511531012(4);
		head_1012.next_1012.next_1012.next_1012.prev_1012 = head_1012.next_1012.next_1012;
		head_1012.next_1012.next_1012.next_1012.next_1012 = new NodeDLL_2511531012(5);
		head_1012.next_1012.next_1012.next_1012.next_1012.prev_1012 = head_1012.next_1012.next_1012.next_1012;
		
		System.out.print("DLL Awal: ");
		printList_1012(head_1012);
		
		System.out.print("Setelah head dihapus: ");
		head_1012 = delHead_1012(head_1012);
		printList_1012(head_1012);
		
		System.out.print("Setelah node terakhir dihapus: ");
		head_1012 = delLast_1012(head_1012);
		printList_1012(head_1012);
		
		System.out.print("menghapus node ke 2: ");
		head_1012 = delPos_1012(head_1012,2);
		printList_1012(head_1012);
	}

}
