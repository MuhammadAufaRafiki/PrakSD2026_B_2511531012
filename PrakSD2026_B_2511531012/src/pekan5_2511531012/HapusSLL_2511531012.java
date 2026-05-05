package pekan5_2511531012;

public class HapusSLL_2511531012 {
	
	public static NodeSLL_2511531012 deleteHead_1012(NodeSLL_2511531012 head_1012) {
		
		if (head_1012 == null)
			return null;
		head_1012 = head_1012.next_1012;
		
		return head_1012;
	}
	public static NodeSLL_2511531012 removeLastNode_1012(NodeSLL_2511531012 head_1012) {
		
		if (head_1012 == null) {
			return null;
		}
		if (head_1012.next_1012 == null) {
			return null;
		}
		
		NodeSLL_2511531012 secondLast_1012 = head_1012;
		while (secondLast_1012.next_1012.next_1012 != null) {
			secondLast_1012 = secondLast_1012.next_1012;
		}
		
		secondLast_1012.next_1012 = null;
		return head_1012;
	}
	
	public static NodeSLL_2511531012 deleteNode_1012(NodeSLL_2511531012 head_1012, int position_1012) {
		NodeSLL_2511531012 temp_1012 = head_1012;
		NodeSLL_2511531012 prev_1012 = null;
		
		if (temp_1012 == null)
			return head_1012;
		
		if (position_1012 == 1) {
			head_1012 = temp_1012.next_1012;
			return head_1012;
		}
		
		for (int i = 1; temp_1012 != null && i<position_1012; i++) {
			prev_1012 = temp_1012;
			temp_1012 = temp_1012.next_1012;
		}
		
		if (temp_1012 != null) {
			prev_1012.next_1012 = temp_1012.next_1012;
		} else 
			System.out.println("Data tidak ada");
			return head_1012;
		}
	
	public static void printList_1012(NodeSLL_2511531012 head_1012) {
		NodeSLL_2511531012 curr_1012 = head_1012;
		while (curr_1012.next_1012 != null) {
			System.out.print(curr_1012.data_1012+ "-->");
			curr_1012 = curr_1012.next_1012;
		}
		if (curr_1012.next_1012 == null) {
			System.out.print(curr_1012.data_1012);
		}
		System.out.println();
		
	}
	public static void main (String[] args) {
		
		NodeSLL_2511531012 head_1012 = new NodeSLL_2511531012(1);
		head_1012.next_1012 = new NodeSLL_2511531012(2);
		head_1012.next_1012.next_1012 = new NodeSLL_2511531012(3);
		head_1012.next_1012.next_1012.next_1012 = new NodeSLL_2511531012(4);
		head_1012.next_1012.next_1012.next_1012.next_1012 = new NodeSLL_2511531012(5);
		head_1012.next_1012.next_1012.next_1012.next_1012.next_1012 = new NodeSLL_2511531012(6);
		
		System.out.println("List awal: ");
		printList_1012(head_1012);
		
		head_1012 = deleteHead_1012(head_1012);
		System.out.println("List setelah head dihapus: ");
		printList_1012(head_1012);
		
		head_1012 = removeLastNode_1012(head_1012);
		System.out.println("List setelah simpul terakhir di hapus: ");
		printList_1012(head_1012);
		
		int position_1012 = 2;
		head_1012 = deleteNode_1012(head_1012, position_1012);
		System.out.println("List setelah posisi 2 dihapus:  ");
		printList_1012(head_1012);
		
	}

}
