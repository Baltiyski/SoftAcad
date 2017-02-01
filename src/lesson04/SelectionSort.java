package lesson04;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] array = {9,8,7,6,5};
		int buffer;
		int min;
		int index;
		//int count = 0;
		
		for(int i= 0; i<array.length; i++){
			min = array[i];
			index = i;
			for(int j=i;j<array.length;j++){
				//count++;
				if(min > array[j]){
					min = array[j];// Min element
					index = j;
				}
			}
			buffer = array[index];// Swap elements
			array[index] = array[i];
			array[i] = buffer;
		}
		//System.out.println(count);
		for(int i =0;i<array.length;i++){
			System.out.print(array[i]+",");
		}
	}
}
