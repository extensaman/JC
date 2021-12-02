package home.chapter06inheritance.task00;

/**
* Занятие №04
* Раздел "Наследование".
* Задача №04.
* 
* 1 Реализовать класс "Юридическое лицо".
* Поля класса:
* - процент налогооблажения выручки за год (например 20 %, целое число от 0 до 100)
* - выручка за год (например 200 рублей, целое число)
* Методы:
* - установить выручку за год
* - посчитать выручка за год после налогооблажения (например 160рублей, вещественный тип, пример расчета: 200 - (200/100)20 = 160рублей)
* - посчитать значение налога за год ( (200/100)20 = 40 рублей)
* Параметры конструктора:
* - процент налогооблажения выручки за год
* 
* @author Yusikau Aliaksandr
* @version 1.0
*/

public class Entity {
	
	public static final int DEFAULT_YEAR_TAX_PERCENT = 20;
	
	private int yearTaxPercent = DEFAULT_YEAR_TAX_PERCENT;
	private long proceeds;
	
	public Entity () {}
	
	public Entity (int yearTaxPercent) {
		
		this.yearTaxPercent = yearTaxPercent;
	}
	
	public void setProceeds (long procceds) {
		
		this.proceeds = procceds;
	}
	
	public long getProcceds() {
		
		return this.proceeds;
	}
	
	public double calculateIncome () {
		
		return proceeds - proceeds * ((double) yearTaxPercent / 100.0);
	}
	
	public double calculateYearTax () {
		
		return proceeds * ((double) yearTaxPercent / 100.0);
	}

}
