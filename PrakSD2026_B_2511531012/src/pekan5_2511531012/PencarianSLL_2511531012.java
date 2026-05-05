package pekan5_2511531012;

public class PencarianSLL_2511531012 {
	static boolean searchKey_1012(NodeSLL_2511531012 head_1012, int key_1012) {
		NodeSLL_2511531012 curr_1012 = head_1012;
		while (curr_1012 != null) {
			if(curr_1012.data_1012 == key_1012)
				return true;
			curr_1012 = curr_1012.next_1012;
			}
		return false;
	}
	public static void traversal_1012(NodeSLL_2511531012 head_1012) {
		
		NodeSLL_2511531012 curr_1012 = head_1012;
		
		while (curr_1012 != null) {
			System.out.print(" "+ curr_1012.data_1012);
			curr_1012 = curr_1012.next_1012;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		NodeSLL_2511531012 head_1012 = new NodeSLL_2511531012(14);
		head_1012.next_1012 = new NodeSLL_2511531012(21);
		head_1012.next_1012.next_1012 = new NodeSLL_2511531012(13);
		head_1012.next_1012.next_1012.next_1012 = new NodeSLL_2511531012(30);
		head_1012.next_1012.next_1012.next_1012.next_1012 = new NodeSLL_2511531012(10);
		System.out.print("Penelusuran SLL");
		traversal_1012(head_1012);
		
		int key_1012=30;
		System.out.print("cari data "+key_1012+" = ");
		if (searchKey_1012(head_1012, key_1012))
			System.out.println("ketemu");
		else System.out.println("tidak ada");

	}

}
