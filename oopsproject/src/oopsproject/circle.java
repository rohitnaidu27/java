package oopsproject;



public class circle{
	public void area1(double  radius)
	{
	double r= ((3.14)*radius*radius);
	
	System.out.println(r);
	}
	public void area1(int length, int height)
	{
		double r= (0.5)*length*height;
		System.out.println(r);
	}

   public static void main(String[] args) {
  
circle a=new circle();
a.area1(20.5);
a.area1(20, 25);


    }
	
	
	
}


