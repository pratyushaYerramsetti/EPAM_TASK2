package Construction;
public class Construction {
	public double cost(int type,double feet){
		if(type == 1)
			return(feet*1200);
		else if(type == 2)
			return(feet*1500);
		else if(type == 3)
			return(feet*1800);
		else
			return(feet*2500);
	}
}
