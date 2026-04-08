package pekan3_2511531012;

public class stackArrayDriver_2511531012 {

	public static void main(String[] args) {
		stackArray_2511531012 s= new stackArray_2511531012();
		s.push_2511531012(10);
		s.push_2511531012(20);
		s.push_2511531012(30);
		System.out.println(s.pop_2511531012() +" dikeluarkan dari stack");
		System.out.println("Elemen teratas adalah :" + s.peek_2511531012());
		System.out.print("Elemen pada stack:");
		s.print_2511531012();

	}

}
