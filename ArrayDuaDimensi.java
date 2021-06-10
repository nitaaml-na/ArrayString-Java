package arrayDuaDimensi;

public class ArrayDuaDimensi {

	public static void main (String[] args) {
		
		int a[][]= {{1,3,4},{3,4,5}};
		int b[][]= {{1,3,4},{3,4,5}};
		int c[][] = new int[2][3]; //inisiasi hasil pertambahan/penjumlahan dengan 2 baris dan 3 kolom
		
		for(int i=0; i<a.length; i++)// biar setiap index terhitung
		{
			for(int j=0; j<a[i].length; j++ )
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+"  ");
			}
			System.out.println();
		}
		
	}
}
