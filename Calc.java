import java.util.Arrays;

public class Calc{
	public static void main(String[] args){
		//Создать одномерный массив a типа long. Заполнить его числами от 2 до 19 включительно в порядке убывания. 
		long[] longArray = new long[18];
		int s = 0;
		for(long i = 19; i >= 2; i--){
			longArray[s] = i;
			s++;
		}
		
		//Создать одномерный массив x типа float. Заполнить его 20-ю случайными числами в диапазоне от -13.0 до 15.0.
		float[] randomFloatArray = new float[20];
		for(s = 0; s < 20; s++){
			randomFloatArray[s] = (float) (Math.random()*28);
			randomFloatArray[s] -= 13.0;
		}
		
		//Создать двумерный массив a размером 18x20. 
		float[][] outputArray = new float[18][20];
		
		//Вычислить его элементы по формулам.
		for(int i = 0; i < 18; i++){
			if(longArray[i] == 2) {;
				for(int j = 0; j < 20; j++) {
					double dividingNum = Math.pow(1.0f / 2.0f - ((1.0f / 4.0f) / 
					Math.pow((1.0f - randomFloatArray[j]) / randomFloatArray[j], 3)), 3);
					
					double dividedBy = Math.cos(Math.pow(randomFloatArray[j], Math.PI * (randomFloatArray[j] + 0.25f)));
					
					outputArray[i][j] = (float) Math.pow(dividingNum / dividedBy, 2);
				}
			} else if(Arrays.asList(3l, 6l, 7l, 10l, 11l, 15l, 16l, 17l, 18l).contains(longArray[i])) {
				for(int j = 0; j < 20; j++) {

					double arcsin = Math.asin((2.0f / 3.0f) * ((randomFloatArray[j] + 1.0f) / 28.0f));

					outputArray[i][j] = (float) Math.tan(arcsin);
				}
			} else {
				for(int j = 0; j < 20; j++) {
					double arcsin = Math.asin(Math.pow(1.0f/Math.pow(Math.E, Math.abs(randomFloatArray[j])), 2));
					
					outputArray[i][j] = (float) Math.tan(arcsin);
				}
			}
		}
		
		//Напечатать полученный в результате массив в формате с пятью знаками после запятой.
		for (float[] row: outputArray) {
			for (float number: row) {
				System.out.printf("|%8.5f|", number);
			}
			System.out.println();
		}
	}
}