
public class Mahasiswa {
    private String nimMhs;
    private String namaMhs;
    private int umurMhs;

    public Mahasiswa() {
        nimMhs = "";
        namaMhs = "";
        umurMhs = 0;
    }

    public Mahasiswa(String nim, String nama, int umur) {
        nimMhs = nim;
        namaMhs = nama;
        umurMhs = umur;
    }

    public void displayMhs() {
        System.out.print("NIM : " + nimMhs);
        System.out.print("\tNama : " + namaMhs);
        System.out.println("\tUmur : " + umurMhs);
    }

    public String getNimMhs() {
        return nimMhs;
    }

    public void setNimMhs(String n) {
        nimMhs = n;
    }

    public String getNamaMhs() {
        return namaMhs;
    }

    public String setNamaMhs(String n) {
        namaMhs = n;
    }

    public String getUmurMhs() {
        return umurMhs;
    }

    public String setUmurMhs(String n) {
        umurMhs = n;
    }
}
