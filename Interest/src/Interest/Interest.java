package Interest;
public class Interest {
	public double simpleInterest(int p,int t,int r){
		return((p*t*r)/100);
	}
	public double compoundInterest(int p,int t, int r){
		return((p *(Math.pow((1 + r / 100), t))));
	}
}
