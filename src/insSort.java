import java.util.Random;
public class insSort {

	public static void main(String[] args)
	{
		Random rastgele=new Random();
	int[] dizi= new int[100000];
	
	
	
	for(int i=0; i<dizi.length; i++)
	{
		dizi[i]=rastgele.nextInt(100000);
	}
	
//Diziyi büyükten küçüğe sıralama

	for (int i = 1; i < dizi.length; i++) {
		int siralanacakDeger = dizi[i];
		int j = i;
		while (j > 0 && dizi[j - 1] < siralanacakDeger) {
			dizi[j] = dizi[j - 1];
			j--;
		}
		dizi[j] = siralanacakDeger;
	}
// Büyükten küçüğe sıralanan diziyi insertionSort metoduna gönderme

	long basla = System.currentTimeMillis();
	

	insertionSort(dizi);
	
	
	long bitir = System.currentTimeMillis();
	
 
	 System.out.println("Sure: " + (bitir-basla) + " milisaniye");
}


private static void insertionSort(int[] dizi) {
	for (int i = 1; i < dizi.length; i++) {
		int siralanacakDeger = array[i];
		int j = i;
		while (j > 0 && dizi[j - 1] > siralanacakDeger) {
			dizi[j] = dizi[j - 1];
			j--;
		}
		dizi[j] = siralanacakDeger;
	}

	}

}
