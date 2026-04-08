package pekan3_2511531012;

public class stackArray_2511531012 {
	static final int MAX = 1000;
	int top;
	int a[]= new int[MAX];
	boolean isEmpty_2511531012()
	{
		return (top<0);
	}
	stackArray_2511531012()
	{
		top=-1;
	}
	boolean push_2511531012(int x)
	{
		if(top >=(MAX - 1)) {
			System.out.println("Stack Oveflow");
			return false;
		}
		else {
			a[++top]=x;
			System.out.println(x +" dimasukkan dalam satck");
			return true;
		}
	}
	int pop_2511531012()
	{
		if(top<0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int x = a[top--];
			return x;
		}
		
	}
	int peek_2511531012()
	{
		if(top<0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int x = a[top];
			return x;
		}
	}
	void print_2511531012() {
		for(int i=top;i>-1;i--) {
			System.out.print(" "+ a[i]);
		}
	}

}
