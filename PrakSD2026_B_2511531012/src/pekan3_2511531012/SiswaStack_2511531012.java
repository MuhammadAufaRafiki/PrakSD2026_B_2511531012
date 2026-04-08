package pekan3_2511531012;
import java.util.ArrayList;

class Siswa_2511531012 {
	String nama;
	int nim;
	public Siswa_2511531012(String nama, int nim) {
		this.nama = nama;
		this.nim = nim;
	}
	public String toString() {
		return "Nim: "+nim + ",Nama: "+ nama;
	}
}
public class SiswaStack_2511531012 {
	private ArrayList<Siswa_2511531012> stack;
	
	public SiswaStack_2511531012() {
		stack = new ArrayList<>();
	}
	public void push_2511531012(Siswa_2511531012 mhs) {
		stack.add(mhs);
	}
	public Siswa_2511531012 pop() {
		if (!isEmpty()) {
			return stack.remove(stack.size() - 1);
		}
		return null;
	}
	public Siswa_2511531012 peek() {
		if(!isEmpty()) {
			return stack.get(stack.size() - 1);
		}
		return null;
	}
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	public void tampilkanSiswa_2511531012() {
		for (int i= stack.size()-1; i>=0; i--) {
			System.out.println(stack.get(i));
		}
	}
	public static void main(String[] args) {
		SiswaStack_2511531012 studentStack = new SiswaStack_2511531012();
		
		Siswa_2511531012 mhs1 = new Siswa_2511531012("Ali", 1);
		Siswa_2511531012 mhs2 = new Siswa_2511531012("Boby", 2);
		Siswa_2511531012 mhs3 = new Siswa_2511531012("Charles", 3);
		
		studentStack.push_2511531012(mhs1);
		studentStack.push_2511531012(mhs2);
		studentStack.push_2511531012(mhs3);
		
		System.out.println("Siswa di dalam stack:");
		studentStack.tampilkanSiswa_2511531012();
		
		System.out.println("Siswa teratas "+ studentStack.peek());
		System.out.println("mengeluarkan siswa teratas dari stack: "+ studentStack.pop());
		System.out.println("daftar siswa setekah di pop :");
		studentStack.tampilkanSiswa_2511531012();
		
		
	}

}
