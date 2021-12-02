package home.chapter04classes.task00;

public class Short {

	private short var;
	public static final short S_MAX;
	public static final short S_MIN;
	
	static {
		
		S_MAX = java.lang.Short.MAX_VALUE;
		S_MIN = java.lang.Short.MIN_VALUE;
		
	}
	
	public Short () {}
	
	public Short (short var) {
		
		this.var = var;
	}
	
	public short getVar () {
		
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
