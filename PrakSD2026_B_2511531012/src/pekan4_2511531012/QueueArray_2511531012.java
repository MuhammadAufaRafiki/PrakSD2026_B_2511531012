package pekan4_2511531012;

public class QueueArray_2511531012 {
	int front_1012, rear_1012, size_1012;
	int capacity_1012;
	int array[];
	
	public QueueArray_2511531012(int capacity_1012) {
		this.capacity_1012 = capacity_1012;
		front_1012 = this.size_1012 = 0;
		rear_1012 = capacity_1012 - 1;
		array = new int[this.capacity_1012];
	}
	
	boolean isFull_1012(QueueArray_2511531012 queue) {
		return (queue.size_1012 == queue.capacity_1012);
	}
	
	boolean isEmpty_1012(QueueArray_2511531012 queue) {
		return (queue.size_1012 == 0);
	}
	
	void enqueue_1012(int item) {
		if (isFull_1012(this))
			return;
		this.rear_1012 = (this.rear_1012 + 1) % this.capacity_1012;
		this.array[this.rear_1012]= item;
		this.size_1012 = this.size_1012 + 1;
		System.out.println(item + "enqueue to queue");
		
	}
	int dequeue_1012() {
		if(isEmpty_1012(this))
			return Integer.MIN_VALUE;
		int item = this.array[this.front_1012];
		this.front_1012= (this.front_1012 + 1) % this.capacity_1012;
		this.size_1012= this.size_1012 - 1;
		return item;
	}
	int front_1012() {
		if(isEmpty_1012(this))
			return Integer.MIN_VALUE;
		return this.array[this.front_1012];
	}
	int rear_1012() {
		if (isEmpty_1012(this))
			return Integer.MIN_VALUE;
		return this.array[this.rear_1012];
	}
	
	void display_1012() {
		int i;
		if (size_1012 == 0) {
			System.out.printf("\nAntrian Kosong\n");
			return;
		}
		
		for (i= front_1012; i< rear_1012; i++) {
			System.out.printf("%d <-- ",array[i]);
		}
		return;
	}

}
