package pekan6_2511531012;

public class Lagu_2511531012 {
    String judul_1012;
    String penyanyi_1012;
    Lagu_2511531012 next_1012;
    Lagu_2511531012 prev_1012;

    // constructor
    public Lagu_2511531012(String judul_1012, String penyanyi_1012) {
        this.judul_1012 = judul_1012;
        this.penyanyi_1012 = penyanyi_1012;
        this.next_1012 = null;
        this.prev_1012 = null;
    }

    // GETTER
    public String getJudul_1012() { return judul_1012; }
    public String getPenyanyi_1012() { return penyanyi_1012; }
    public Lagu_2511531012 getNext_1012() { return next_1012; }
    public Lagu_2511531012 getPrev_1012() { return prev_1012; }
    
    // SETTER
    public void setJudul_1012(String judul_1012) { this.judul_1012 = judul_1012; }
    public void setPenyanyi_1012(String penyanyi_1012) { this.penyanyi_1012 = penyanyi_1012; }
    public void setNext_1012(Lagu_2511531012 next_1012) { this.next_1012 = next_1012; }
    public void setPrev_1012(Lagu_2511531012 prev_1012) { this.prev_1012 = prev_1012; }
}
