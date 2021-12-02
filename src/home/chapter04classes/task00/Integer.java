package home.chapter04classes.task00;

public class Integer {
	
	private int var;
	public static final int I_MAX;
	public static final int I_MIN;
	
	static {
		
		I_MAX = java.lang.Integer.MAX_VALUE;
		I_MIN = java.lang.Integer.MIN_VALUE;
		
	}
	
	public Integer () {}
	
	public Integer (int var) {
		
		this.var = var;
	}
	
	public int getVar () {
		
		return this.var;
	}
	
	public void incrementVar () {
		
		this.var++;
	}
	
	public void decrementVar () {
		
		this.var--;
	}
	
	@Override
	public String toString () {
	
		return super.toString() + "\n\'b\' = " + this.var + '\n';
		
	}
}
