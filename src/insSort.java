import java.util.Random;
public class insSort {

	public static void main(String[] args)
	{
		Random rnd=new Random();
	int[] dizi= new int[100000];
	
	
	
	for(int i=0; i<dizi.length; i++)
	{
		dizi[i]=rnd.nextInt(100000);
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

	long start = System.currentTimeMillis();
	

	insertionSort(dizi);
	
	
	long end = System.currentTimeMillis();
	
 
	 System.out.println("Time: " + (end-start) + " milisaniye");
}


private static void insertionSort(int[] array) {
	for (int i = 1; i < array.length; i++) {
		int siralanacakDeger = array[i];
		int j = i;
		while (j > 0 && array[j - 1] > siralanacakDeger) {
			array[j] = array[j - 1];
			j--;
		}
		array[j] = siralanacakDeger;
	}

	}

}
