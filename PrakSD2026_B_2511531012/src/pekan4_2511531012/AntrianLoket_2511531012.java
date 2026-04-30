package pekan4_2511531012;

public class AntrianLoket_2511531012 {
    int front_1012, rear_1012, size_1012;
    int capacity_1012;
    String queue_1012[];

    public AntrianLoket_2511531012(int capacity_1012) {
        this.capacity_1012 = capacity_1012;
        front_1012 = this.size_1012 = 0;
        rear_1012 = capacity_1012 - 1;
        queue_1012 = new String[this.capacity_1012];
    }

    boolean isFull_1012(AntrianLoket_2511531012 queue) {
        return (queue.size_1012 == queue.capacity_1012);
    }

    boolean isEmpty_1012(AntrianLoket_2511531012 queue) {
        return (queue.size_1012 == 0);
    }

    void enqueue_1012(String nama_1012) {
        if (isFull_1012(this)) {
            System.out.println("Antrian penuh");
            return;
        }
        this.rear_1012 = (this.rear_1012 + 1) % this.capacity_1012;
        this.queue_1012[this.rear_1012] = nama_1012;
        this.size_1012 = this.size_1012 + 1;
        System.out.println("Data berhasil ditambahkan ke antrian");
    }

    void dequeue_1012() {
        if (isEmpty_1012(this)) {
            System.out.println("Antrian kosong");
            return;
        }
        String nama_1012 = this.queue_1012[this.front_1012];
        this.front_1012 = (this.front_1012 + 1) % this.capacity_1012;
        this.size_1012 = this.size_1012 - 1;
        System.out.println(nama_1012 + " telah dilayani");
    }

    void display_1012() {
        if (isEmpty_1012(this)) {
            System.out.println("Antrian kosong");
            return;
        }

        System.out.println("Isi antrian:");
        int i = front_1012;
        int nomor = 1;

        for (int count = 0; count < size_1012; count++) {
            System.out.println(nomor + ". " + queue_1012[i]);
            i = (i + 1) % capacity_1012;
            nomor++;
        }
    }

    void reverse_1012() {
        if (isEmpty_1012(this)) {
            System.out.println("Antrian kosong");
            return;
        }

        String temp_1012[] = new String[capacity_1012];
        int i = front_1012;

        for (int j = 0; j < size_1012; j++) {
            temp_1012[j] = queue_1012[i];
            i = (i + 1) % capacity_1012;
        }

        int k = size_1012 - 1;
        i = front_1012;

        for (int j = 0; j < size_1012; j++) {
            queue_1012[i] = temp_1012[k];
            i = (i + 1) % capacity_1012;
            k--;
        }

        System.out.println("Antrian berhasil dibalik");
    }
}