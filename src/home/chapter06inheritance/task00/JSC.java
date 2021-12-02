package home.chapter06inheritance.task00;

/**
* Занятие №04
* Раздел "Наследование".
* Задача №04.
* 
* Реализовать класс "OAO", который будет унаследован от "Юридическое лицо".
* Дополнительные поля класса "OAO":
* - процент дорожного налога выручки за год (например 5 %, целое число от 0 до 100)
* Переопределенные методы:
* - посчитать выручка за год после налогооблажения (например 160рублей, вещественный тип, пример расчета: 200 - (200/100)20 - (200/100)5) = 150рублей)
* - посчитать значение налога за год ( (200/100)20 + (200/100)5 = 50 рублей)
* Параметры конструктора:
* - процент налогооблажения выручки за год
* - процент дорожного налога выручки за год
* родительский контструктор "Юридическое лицо" использовать в конструкторе "OAO" через ключевое слово super (например:
* public OAO((int tax, int roadTax) {
* super(tax);
* this.roadTax = tax;
* }
* )
* 
* @author Yusikau Aliaksandr
* @version 1.0
*/

public class JSC extends Entity {
	
	public static final int DEFAULT_YEAR_ROAD_TAX_PERCENT = 5;
	
	private int yearRoadTaxPercent = DEFAULT_YEAR_ROAD_TAX_PERCENT;
	
	public JSC() {
		
		super ();
	}
	
	public JSC (int yearTaxPercent, int yearRoadTaxPercent) {
		
		super (yearTaxPercent);
		this.yearRoadTaxPercent = yearRoadTaxPercent;
		
	}
	
	@Override 
	public double calculateIncome() {
		return super.calculateIncome() - super.getProcceds() * ((double) this.yearRoadTaxPercent / 100.0);
	}
	
	@Override
	public double calculateYearTax() {
		
		return super.calculateYearTax() + super.getProcceds() * ((double) this.yearRoadTaxPercent / 100.0);
		
	}
	
}
