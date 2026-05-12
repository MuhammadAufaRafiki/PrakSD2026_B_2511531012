package pekan6_2511531012;

public class InsertDLL_2511531012 {
	//menambahkan node di awal dll
	static NodeDLL_2511531012 insertBegin_1012(NodeDLL_2511531012 head_1012,int data_1012) {
		//buat node baru
		NodeDLL_2511531012 new_node_1012 = new NodeDLL_2511531012(data_1012);
		//jadikan pointer nextnya head
		new_node_1012.next_1012 = head_1012;
		//jadikan pointer prev heaad ke new_node
		if(head_1012 != null) {
			head_1012.prev_1012 = new_node_1012;
		}
		return new_node_1012;
	}
	//fungsi menambahkan node di akhir
	public static NodeDLL_2511531012 insertEnd_1012(NodeDLL_2511531012 head_1012, int newData_1012) {
		//buat node baru 
		NodeDLL_2511531012 newNode_1012 = new NodeDLL_2511531012(newData_1012);
		//jika dll null jadikan head 
		if(head_1012 == null) {
			head_1012 = newNode_1012;
		}
		else {
			NodeDLL_2511531012 curr_1012 = head_1012;
			while (curr_1012.next_1012 != null) {
				curr_1012 = curr_1012.next_1012;
			}
			curr_1012.next_1012 = newNode_1012;
			newNode_1012.prev_1012 = curr_1012;
		}
		return head_1012;
	}
	//fungsi menambahkan node di posisi tertentu
	public static NodeDLL_2511531012 insertAtPosition(NodeDLL_2511531012 head_1012, int pos_1012, int new_data_1012) {
		// buat node baru
		NodeDLL_2511531012 new_node_1012 = new NodeDLL_2511531012(new_data_1012);
		if(pos_1012 == 1) {
			new_node_1012.next_1012 = head_1012;
			if (head_1012 != null) {
				head_1012.prev_1012 = new_node_1012;}
				return head_1012;
			}
			NodeDLL_2511531012 curr_1012 = head_1012;
			for (int i = 1; i < pos_1012 - 1 && curr_1012 != null;i++ ) {
				curr_1012 = curr_1012.next_1012; }
			if (curr_1012 == null) {
				System.out.println("Posisi tidak ada");
				return head_1012; }
			new_node_1012.prev_1012 = curr_1012;
			new_node_1012.next_1012 = curr_1012.next_1012;
			curr_1012.next_1012 = new_node_1012;
			if(new_node_1012.next_1012 != null) {
				new_node_1012.next_1012.prev_1012 = new_node_1012;}
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
	public static void main(String[]args) {
		//membuat dll 2<->3<->5<->
		NodeDLL_2511531012 head_1012 = new NodeDLL_2511531012(2);
		head_1012.next_1012 = new NodeDLL_2511531012(3);
		head_1012.next_1012.prev_1012 = head_1012;
		head_1012.next_1012.next_1012 = new NodeDLL_2511531012(5);
		head_1012.next_1012.prev_1012.prev_1012 = head_1012;
		
		System.out.print("DLL Awal: ");
		printList_1012(head_1012);
		
		head_1012 = insertBegin_1012(head_1012,1);
		System.out.print("simpul 1 ditambahkan di awal: ");
		printList_1012(head_1012);
		
		System.out.print("simpul 6 ditambahkan di akhir: ");
		int data_1012=6;
		head_1012 = insertEnd_1012(head_1012, data_1012);
		printList_1012(head_1012);
		
		System.out.print("tambahkan node 4 di posisi 4: ");
		int data2_1012 = 4;
		int pos_1012 = 4;
		head_1012 = insertAtPosition(head_1012, pos_1012, data2_1012);
		printList_1012(head_1012);
	}
	

}
