package pekan5_2511531012;

public class TambahSLL_2511531012 {
	public static NodeSLL_2511531012 insertAtFront_1012(NodeSLL_2511531012 head_1012, int value_1012) {
		NodeSLL_2511531012 new_node_1012 = new NodeSLL_2511531012(value_1012);
		new_node_1012.next_1012 = head_1012;
		return new_node_1012;
	}
	//fungsi menambahkan node di akhir SLL
	public static NodeSLL_2511531012 insertAtEnd_1012(NodeSLL_2511531012 head_1012, int value_1012) {
	    // buat sebuah node dengan nilai
		NodeSLL_2511531012 newNode_1012 = new NodeSLL_2511531012(value_1012);
		// jika list kosong maka node jadi head
		if (head_1012 == null) {
			return newNode_1012;
		}
		//simpan head ke variabel sementara
		NodeSLL_2511531012 last_1012 = head_1012;
		//telusuri ke node akhir
		while (last_1012.next_1012 != null) {
			last_1012 = last_1012.next_1012;
		}
		//ubah pointer
		last_1012.next_1012 = newNode_1012;
		return head_1012;
	}
	static NodeSLL_2511531012 GetNode_1012(int data_1012) {
		return new NodeSLL_2511531012(data_1012);
	}
	static NodeSLL_2511531012 insertPos_1012(NodeSLL_2511531012 headNode_1012, int position_1012, int value_1012) {
		NodeSLL_2511531012 head_1012 = headNode_1012;
		if(position_1012 < 1)
			System.out.print("Invalid position");
		if(position_1012 == 1) {
			NodeSLL_2511531012 new_node_1012 = new NodeSLL_2511531012(value_1012);
			new_node_1012.next_1012 = head_1012;
			return new_node_1012;
		}else {
			while (position_1012-- != 0) {
				if(position_1012 == 1) {
					NodeSLL_2511531012 newNode_1012 = GetNode_1012(value_1012);
					newNode_1012.next_1012 = headNode_1012.next_1012;
					headNode_1012.next_1012 = newNode_1012;
					break;
				}
				headNode_1012 = headNode_1012.next_1012;
			}
		}
		if (position_1012 != 1) 
			System.out.print("Posisi di luar jangkauan");
			return head_1012;
		
	}
		public static void printList_1012(NodeSLL_2511531012 head_1012) {
			NodeSLL_2511531012 curr_1012 = head_1012;
			while (curr_1012.next_1012 != null) {
				System.out.print(curr_1012.data_1012+"-->");
				curr_1012 = curr_1012.next_1012;
			}
			if (curr_1012.next_1012 == null) {
				System.out.print(curr_1012.data_1012);
				System.out.println();
			}
		}
		public static void main(String[] args) {
			//buat linked list 2->3->5->6
			NodeSLL_2511531012 head_1012 = new NodeSLL_2511531012(2);
			head_1012.next_1012 = new NodeSLL_2511531012(3);
			head_1012.next_1012.next_1012 = new NodeSLL_2511531012(5);
			head_1012.next_1012.next_1012.next_1012 = new NodeSLL_2511531012(6);
			//cetak list asli
			System.out.print("Senarai berantai awal: ");
			printList_1012(head_1012);
			//tambahkan node baru di depan
			System.out.print("Tambah 1 simpul di depan: ");
			int data_1012 = 1;
			head_1012 = insertAtFront_1012(head_1012, data_1012);
			
			printList_1012(head_1012);
			
			System.out.print("tambah 1 simpul di belakang: ");
			int data2_1012 = 7;
			head_1012 = insertAtEnd_1012(head_1012, data2_1012);
			
			printList_1012(head_1012);
			
			System.out.print("tambah 1 simpul ke data ke 4: ");
			int data3_1012 = 4;
			int pos_1012 = 4;
			head_1012 = insertPos_1012(head_1012, pos_1012, data3_1012);
			
			printList_1012(head_1012);
		}
}
