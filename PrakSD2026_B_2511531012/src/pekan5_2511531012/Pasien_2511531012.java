package pekan5_2511531012;

public class Pasien_2511531012 {
    private String namaPasien_1012;
    private String penyakit_1012;
    private int nomorAntrian_1012;
    private Pasien_2511531012 next_1012;

    public Pasien_2511531012(String namaPasien_1012, String penyakit_1012, int nomorAntrian_1012) {
        this.namaPasien_1012 = namaPasien_1012;
        this.penyakit_1012 = penyakit_1012;
        this.nomorAntrian_1012 = nomorAntrian_1012;
        this.next_1012 = null;
    }

    // Getter
    public String getNamaPasien_1012() { return namaPasien_1012; }
    public String getPenyakit_1012() { return penyakit_1012; }
    public int getNomorAntrian_1012() { return nomorAntrian_1012; }
    public Pasien_2511531012 getNext_1012() { return next_1012; }

    // Setter
    public void setNamaPasien_1012(String namaPasien_1012) { this.namaPasien_1012 = namaPasien_1012; }
    public void setPenyakit_1012(String penyakit_1012) { this.penyakit_1012 = penyakit_1012; }
    public void setNomorAntrian_1012(int nomorAntrian_1012) { this.nomorAntrian_1012 = nomorAntrian_1012; }
    public void setNext_1012(Pasien_2511531012 next_1012) { this.next_1012 = next_1012; }
}
