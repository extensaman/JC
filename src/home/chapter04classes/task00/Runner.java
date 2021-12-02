package home.chapter04classes.task00;

/**
* Занятие №03
* Раздел "Статические поля и методы".
* Задача №03.
* 
* 2 Написать программу, которая будет выводить на экра минимальное и максимальное значение целочисленного простого типа (byte, short. int, long).
* Детали:
* Для каждого целочисленного простого типа реализовать свой класс, 
* в котором будет одна переменная для хранения значения данного целочисленного простого типа, 
* также две статические переменные для хранения максимального и минимального значения данного простого типа.
* Также методы:
* 1 метод который будет увеличивать значение переменной класса на 1
* 2 метод который будет уменьшать значение переменной класса на 1
* 3 метод который будет возвращать значение переменной класса
* Инициализацию класса производить через конструктор, посредством передачи значения через параметр: например
* public class MyInteger {
* private int value;
* public MyInteger(int value) {
* this.value = value;
* }
* ....
* }
* Создать отдельный класс с методом " public static void main", в котором реализовать логику работы программы:
* 1 Создать объекты с максимальным и минимальным значением для целочисленных простых типов, используюя написаные классы для них, 
* инициализацию производить через конструктор используя статические переменные..
* 2 Вывести значения на экран
* 3 Увеличить максимальное значение на 1 и уменьшить минимальное значение на 1, используя методы класса для протых типов, которые создали.
* 4 Вывести значения на экран
* По шагам в main нарисовть представление в памяти
* К своей карточке прикрепить исходник(java класс) и картинку представления работы программы в пямяти.
* 
* @author Yusikau Aliaksandr
* @version 1.0
*/

public class Runner {

	public static void main(String[] args) {
		
		// ************ Byte *******************
		
		Byte objMinByte = new Byte (Byte.B_MIN); // 1
		Byte objMaxByte = new Byte (Byte.B_MAX);
		
		System.out.println("*** \'Byte\' object initialized by MIN-value is ***\n" + objMinByte); // 2
		System.out.println("*** \'Byte\' object initialized by MAX-value is ***\n" + objMaxByte);
		
		objMinByte.decrementVar(); // 3
		objMaxByte.incrementVar();
		
		System.out.println("*** Decremented MIN-\'Byte\' object is ***\n" + objMinByte); // 4
		System.out.println("*** Incremented MAX-\'Byte\' object is ***\n" + objMaxByte);
		
		// ************ Short *******************
		
		Short objMinShort = new Short (Short.S_MIN); 
		Short objMaxShort = new Short (Short.S_MAX);
		
		System.out.println("*** \'Short\' object initialized by MIN-value is ***\n" + objMinShort); 
		System.out.println("*** \'Short\' object initialized by MAX-value is ***\n" + objMaxShort);
		
		objMinShort.decrementVar(); 
		objMaxShort.incrementVar();
		
		System.out.println("*** Decremented MIN-\'Short\' object is ***\n" + objMinShort); 
		System.out.println("*** Incremented MAX-\'Short\' object is ***\n" + objMaxShort);
		
		// ************ Integer *******************
		
		Integer objMinInteger = new Integer (Integer.I_MIN); 
		Integer objMaxInteger = new Integer (Integer.I_MAX);
		
		System.out.println("*** \'Integer\' object initialized by MIN-value is ***\n" + objMinInteger); 
		System.out.println("*** \'Integer\' object initialized by MAX-value is ***\n" + objMaxInteger);
		
		objMinInteger.decrementVar(); 
		objMaxInteger.incrementVar();
		
		System.out.println("*** Decremented MIN-\'Integer\' object is ***\n" + objMinInteger); 
		System.out.println("*** Incremented MAX-\'Integer\' object is ***\n" + objMaxInteger);
		
		// ************ Long *******************
		
		Long objMinLong = new Long (Long.L_MIN); 
		Long objMaxLong = new Long (Long.L_MAX);
		
		System.out.println("*** \'Long\' object initialized by MIN-value is ***\n" + objMinLong); 
		System.out.println("*** \'Long\' object initialized by MAX-value is ***\n" + objMaxLong);
		
		objMinLong.decrementVar(); 
		objMaxLong.incrementVar();
		
		System.out.println("*** Decremented MIN-\'Long\' object is ***\n" + objMinLong); 
		System.out.println("*** Incremented MAX-\'Long\' object is ***\n" + objMaxLong);
	}

}
