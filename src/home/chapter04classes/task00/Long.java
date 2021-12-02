package home.chapter04classes.task00;

public class Long {
	
	private long var;
	public static final long L_MAX;
	public static final long L_MIN;
	
	static {
		
		L_MAX = java.lang.Long.MAX_VALUE;
		L_MIN = java.lang.Long.MIN_VALUE;
		
	}
	
	public Long () {}
	
	public Long (long var) {
		
		this.var = var;
	}
	
	public long getVar () {
		
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
