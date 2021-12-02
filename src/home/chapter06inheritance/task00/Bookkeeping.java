package home.chapter06inheritance.task00;

/**
* Занятие №04
* Раздел "Наследование".
* Задача №04.
* 
* в классе "Бугалтерия" реализовать один метод :
* - посчитать баланс фирмы, который выводит на экран
* 1 Вывести на экран значение выручка за год
* 2 Вывести на экран значение налога за год
* 3 Вывести на экран значение выручка за год после налогооблажения
* 
* @author Yusikau Aliaksandr
* @version 1.0
*/

public class Bookkeeping {
	
	public static void printEntityBalance (Entity instance) {
		
		System.out.println("Instance: " + instance);
		System.out.println("Выручка за год: " + instance.getProcceds());
		System.out.println("Налог за год: " + instance.calculateIncome());
		System.out.println("Выручка за год после налогооблажения: " + instance.calculateYearTax());
		
	}
}
