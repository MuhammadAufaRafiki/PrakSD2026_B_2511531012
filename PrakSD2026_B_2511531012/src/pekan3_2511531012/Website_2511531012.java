package pekan3_2511531012;

public class Website_2511531012 {
    private String judul_1012;
    private String url_1012;

    // Constructor
    public Website_2511531012(String judul, String url) {
        this.judul_1012 = judul;
        this.url_1012 = url;
    }

    // Getter
    public String getJudul_1012() {
        return judul_1012;
    }

    public String getUrl_1012() {
        return url_1012;
    }

    // Setter
    public void setJudul_1012(String judul) {
        this.judul_1012 = judul;
    }

    public void setUrl_1012(String url) {
        this.url_1012 = url;
    }

    // Menampilkan data
    public String toString() {
        return "Judul: " + judul_1012 + "\nURL: " + url_1012;
    }
}