package pekan2_2511531012;

public class Musik_2511531012 {
    // Atribut (pakai 4 digit terakhir NIM = 1012)
    private String judul_1012;
    private String penyanyi_1012;
    private int durasi_1012;

    // Constructor
    public Musik_2511531012(String judul, String penyanyi, int durasi) {
        this.judul_1012 = judul;
        this.penyanyi_1012 = penyanyi;
        this.durasi_1012 = durasi;
    }

    // Getter
    public String getJudul_1012() {
        return judul_1012;
    }
    public String getPenyanyi_1012() {
        return penyanyi_1012;
    }
    public int getDurasi_1012() {
        return durasi_1012;
    }

    // Setter
    public void setJudul_1012(String judul) {
        this.judul_1012 = judul;
    }
    public void setPenyanyi_1012(String penyanyi) {
        this.penyanyi_1012 = penyanyi;
    }
    public void setDurasi_1012(int durasi) {
        this.durasi_1012 = durasi;
    }

    // toString
    public String toString() {
        return "Judul: " + judul_1012 +
               ", Penyanyi: " + penyanyi_1012 +
               ", Durasi: " + durasi_1012 + " detik";
    }
}
