
public class ManageMahasiswa {
    private Mahasiswa[] data;
    private int n;

    public ManageMahasiswa(int max) {
        data = new Mahasiswa [max];
        n = 0;
    }

    public void insert (String nim, String nama, int umur) {
        for(int j=0; j<n; j++) {
            System.out.print((j+1) + ".");
            data[j].displayMhs();
        }
        System.out.println("");
    }
}