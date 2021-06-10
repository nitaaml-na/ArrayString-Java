

public class DataMahasiswa {
    
    public static void main(String[] args) {
       int maxSize = 100;
       ManageMahasiswa obj = new ManageMahasiswa (maxSize);
       obj.insert("119705000", "Andre", 24);
       obj.insert("119705001", "Parto", 29);
       obj.insert("119705002", "Sule", 27);
       obj.insert("119705003", "Aziz", 20);
       obj.insert("119705004", "Nunung", 20);
       System.out.println("Data Mahasiswa : ");
       obj.display();
    }
}
