package home.chapter03arrays.task19;

/**
 * Раздел "Массивы"
 * Задание №19
 *
 * Создать отдельный класс с методом, который делает:
 * Создайте переменную для массива из 10 элементов.
 * Заполните его произвольными значениями целочисленного типа (разными способами напримерер используя Math.random() ) и 
 * выведите на экран элементы, стоящие на четных позициях.
 */

public class Storage {

	public static final int DEFAULT_ARRAY_SIZE = 10; 

	int size;
	int[] array;
	
	public Storage () {
		
		size = DEFAULT_ARRAY_SIZE;
		array = new int[size];
	}
	
	public Storage (int size) {
		
		this.size = size;
		array = new int [size];
	}
	
	public void fillRandomArray (int limit) {
		
		for (int i = 0; i < array.length; i++) {
			
			array[i] = (int) (Math.random() * limit * 2.0) - limit;
		}
	}
	
	public void fillSequentialArray () {
		
		for (int i = 0; i < array.length; i++) {
			
			array[i] = i + 1;
		}
	}
	
	public void printAllArrayElements () {
		
		System.out.println("All array's elements are ");
		
		for (int number : array) {
			
			System.out.printf("%+4d", number);
		}
	}
	
	public void printEvenArrayElements () {
		
		System.out.println("\nEven array's elements are ");
		
		for (int i = 0; i < array.length; i += 2) { // такая реализация, если в условии задачи под словосочетанием "стоящие на четных позициях" имеется ввиду "стоящие на четных позициях индексов"
													 
			System.out.printf("%+4d", array[i]);
		}
	}
	
	
}
