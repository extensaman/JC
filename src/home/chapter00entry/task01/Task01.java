package by.home.lesson01.task01;

/**
* Занятие №01
* Раздел "Типы данных. Переменные. Операторы".
* Задача №01.
* Написать программу, которая будет выводить на экран минимальное и максимальное значение 
* простого типа (byte, short. int, long, float, double). 
* @author Yusikau Aliaksandr
* @version 1.0
*/

public class Task01 {

	public static void main(String[] args) {

		byte bMax = (byte) 0b01111111; // or Byte.MAX_VALUE
		System.out.println("Maximum value of \'byte\' type is " + bMax);
		
		byte bMin = (byte) 0b10000000; // or Byte.MIN_VALUE
		System.out.println("Minimum value of \'byte\' type is " + bMin +'\n');
		
		short sMax = (short) 0b01111111_11111111; // or Short.MAX_VALUE
		System.out.println("Maximum value of \'short\' type is " + sMax);
		
		short sMin = (short) 0b10000000_00000000; // or Short.MIN_VALUE
		System.out.println("Minimum value of \'short\' type is " + sMin +'\n');
		
		int iMax = 0b01111111_11111111_11111111_11111111; // or Integer.MAX_VALUE
		System.out.println("Maximum value of \'int\' type is " + iMax);
		
		int iMin = 0b10000000_00000000_00000000_00000000; // or Integer.MIN_VALUE
		System.out.println("Minimum value of \'int\' type is " + iMin +'\n');
		
		long lMax = 0b01111111_11111111_11111111_11111111_11111111_11111111_11111111_11111111L; // or Long.MAX_VALUE
		System.out.println("Maximum value of \'long\' type is " + lMax);
		
		long lMin = 0b10000000_00000000_00000000_00000000_00000000_00000000_00000000_00000000L; // or Long.MIN_VALUE
		System.out.println("Minimum value of \'long\' type is " + lMin +'\n');
		
		float fMax = 0x1.fffffep127f; // or Float.MAX_VALUE
		System.out.println("Maximum value of \'float\' type is " + fMax);
		
		float fMin = -0x1.fffffep127f; // or -Float.MAX_VALUE
		System.out.println("Minimum value of \'float\' type is " + fMin +'\n');
		
		double dMax = 0x1.fffffffffffffp1023; // or Double.MAX_VALUE;
		System.out.println("Maximum value of \'double\' type is " + dMax);
		
		double dMin = -0x1.fffffffffffffp1023; // or -Double.MAX_VALUE;
		System.out.println("Minimum value of \'double\' type is " + dMin);

	}
	
}
