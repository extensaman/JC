package by.home.lesson02.task02;

/**
* Занятие №02
* Раздел "Типы данных. Переменные. Операторы".
* Задача №02.
* 
* 1 Написать программу, которая будет выводить на экран минимальное и максимальное значение простого типа (byte, short. int, long, float, double).
* Детали:
* Использовать класс, переменные хранить в локальных переменных класса.
* Написать метод в классе, который будет увеличивать значение на 1 у целочисленных переменных максимального значения(к максимальному значению добавить 1).
* Написать метод в классе, который будет уменьшать значение на 1 у целочисленных переменных минимального значения(от минимального значения отнять 1)..
* Написать метод в классе, который будет выводить переменные на экран.
* В main:
* 1 вывести на экран минимальное и максимальное значение простого типа
* 2 вызвать метод, который будет увеличивать значение на 1 у целочисленных переменных максимального значения.
* 3 вывести эти значения на экран
* 4 вызвать метод, который будет уменьшать значение на 1 у целочисленных переменных минимального значения.
* 5 вывести эти значения на экран
* 
* @author Yusikau Aliaksandr
* @version 1.0
*/	

public class Task02 {

	private byte bMax;
	private byte bMin;
	private short sMax;
	private short sMin;
	private int iMax;
	private int iMin;
	private long lMax;
	private long lMin;
	private float fMax;
	private float fMin;
	private double dMax;
	private double dMin;
	
	public Task02 () {
		
		bMax = 0b01111111; // or Byte.MAX_VALUE
				
		bMin = (byte) 0b10000000; // or Byte.MIN_VALUE
				
		sMax = 0b01111111_11111111; // or Short.MAX_VALUE
				
		sMin = (short) 0b10000000_00000000; // or Short.MIN_VALUE
				
		iMax = 0b01111111_11111111_11111111_11111111; // or Integer.MAX_VALUE
				
		iMin = 0b10000000_00000000_00000000_00000000; // or Integer.MIN_VALUE
				
		lMax = 0b01111111_11111111_11111111_11111111_11111111_11111111_11111111_11111111L; // or Long.MAX_VALUE
				
		lMin = 0b10000000_00000000_00000000_00000000_00000000_00000000_00000000_00000000L; // or Long.MIN_VALUE
				
		fMax = 0x1.fffffep127f; // or Float.MAX_VALUE
				
		fMin = -0x1.fffffep127f; // or -Float.MAX_VALUE
				
		dMax = 0x1.fffffffffffffp1023; // or Double.MAX_VALUE;
				
		dMin = -0x1.fffffffffffffp1023; // or -Double.MAX_VALUE;
		
	}
	
	public void addOneToMaxInteger () {
		
		this.bMax++;
		this.sMax++;
		this.iMax++;
		this.lMax++;
		
	}
	
	public void subOneFromMinInteger () {
		
		this.bMin--;
		this.sMin--;
		this.iMin--;
		this.lMin--;
			
	}
	
	public void print (String message) {
		
		if (message == null) {
			
			System.out.println("Bad reference in method \'void print (String message)\'");
			return;
		}
		
		System.out.println(message);
		
		System.out.printf("\'bMax\' (maximum \'byte\') is %d\n", bMax);
		System.out.printf("\'bMin\' (minimal \'byte\') is %d\n", bMin);
		
		System.out.printf("\'sMax\' (maximum \'short\') is %d\n", sMax);
		System.out.printf("\'sMin\' (minimal \'short\') is %d\n", sMin);

		System.out.printf("\'iMax\' (maximum \'int\') is %d\n", iMax);
		System.out.printf("\'iMin\' (minimal \'int\') is %d\n", iMin);

		System.out.printf("\'lMax\' (maximum \'long\') is %d\n", lMax);
		System.out.printf("\'lMin\' (minimal \'long\') is %d\n", lMin);
		
		System.out.printf("\'fMax\' (maximum \'float\') is %.5f\n", fMax);
		System.out.printf("\'fMin\' (minimal \'float\') is %.5f\n", fMin);
		
		System.out.printf("\'dMax\' (maximum \'double\') is %.5f\n", dMax);
		System.out.printf("\'dMin\' (minimal \'double\') is %.5f\n\n", dMin);
		
	}
	
	public static void main(String[] args) {
		
		Task02 obj = new Task02 (); // 0
		
		obj.print("Original object is"); // 1
		
		obj.addOneToMaxInteger(); // 2
		
		obj.print("Object with one added to MAX-integer fields"); // 3
		
		obj.subOneFromMinInteger(); // 4
		
		obj.print("Object with one subtracted from MIN-integer fields"); // 5
		
	}

}
