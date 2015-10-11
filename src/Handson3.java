//pull request
public class Handson3 {
public  int multiply (int d,int e)
{
	int sum;
	sum=d*e;
	return sum;
	
	}
	
public  double multiply (double x,double y)
{
	double sum;
	sum=x*y;
	return sum;
	
	}
	public static void main(String[]args){
Handson3 h3=new Handson3();
	int sum=h3.multiply(4,5);
	double sum1=h3.multiply(4.5,6.9);
	System.out.println(" Sum"+sum);
	System.out.println(" Sum"+sum1);		
	}

}
