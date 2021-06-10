public class ArrayExample {

	public static void main (String[] args) {
		String[] dataprodi = new String[10]; 
		dataprodi [0] = "administrasi";
		dataprodi [1] = "agroteknologi";
		dataprodi [2] = "teknik elektro";
		dataprodi [3] = "bahasa arab";
		dataprodi [4] = "bahasa inggris";
		dataprodi [5] = "teknik informatika";
		dataprodi [6] = "fisika";
		dataprodi [7] = "kimia";
		dataprodi [8] = "biologi";
		dataprodi [9] = "management";
		
		for (int x=0; x<dataprodi.length; x++) {
			if(dataprodi[x].equals("teknik elektro"))
				break;
			System.out.println(dataprodi[x]);
		}
		
		for (int x=0; x<dataprodi.length; x++) {
			if(dataprodi[x].equals("bahasa arab"))
				continue;
			System.out.println(dataprodi[x]);
		}
		
	}
}