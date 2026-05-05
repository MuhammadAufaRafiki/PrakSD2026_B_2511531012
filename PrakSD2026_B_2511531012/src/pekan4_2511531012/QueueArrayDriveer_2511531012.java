package pekan4_2511531012;

public class QueueArrayDriveer_2511531012 {

	public static void main(String[] args) {
		QueueArray_2511531012 queue_1012 =new QueueArray_2511531012(1000);
		queue_1012.enqueue_1012(10);
		queue_1012.enqueue_1012(20);
		queue_1012.enqueue_1012(30);
		queue_1012.enqueue_1012(40);
		
		System.out.println("Item di depan "+ queue_1012.front_1012());
		System.out.println("Item paling belakang "+queue_1012.rear_1012());
		System.out.println("Tampilan Queue");
		queue_1012.display_1012();
		System.out.println();
		
		System.out.println(queue_1012.dequeue_1012() +" dihapus dari Queue");
		System.out.println("item di depan    : "+queue_1012.front_1012());
		System.out.println("item di belakang : "+queue_1012.rear_1012());
		System.out.println("Tampilan Queue setelah satu Data dihapus");
		queue_1012.display_1012();
	}
}
