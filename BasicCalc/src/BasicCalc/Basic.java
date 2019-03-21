package BasicCalc;
public class Basic {
	
	public int add(int x,int y){
		return(x+y);
	}
	public int divide(int x,int y){
		if(y==0)
			throw new IllegalArgumentException("denominator cannot be zero");
		else
			return(x/y);
	}
	public int multiply(int x,int y){
		return(x*y);
	}
	

}
