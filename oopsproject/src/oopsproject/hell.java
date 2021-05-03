package oopsproject;

public class hell {
	
	int v;
	int r;
	int o;
	hell(){
		v=10;
	}
	hell(int value){
		this.v=value;
	
	}
	
	hell(int value, int radius){
		this(value,radius,30);
	}
	hell(int value, int radius, int obj){
		this.v=value;
		this.r=radius;
		this.o=obj;
		
	}
	
	public float add (int a, int c) {
		int result = a+c;
		return result;
	}
	
	public float add (int a, int c, int b) {
		int result = a+c+b;
		return result;
		

	}
	public float add (int a, int c, int b, int d) {
		int result = a+c+d+b;
		return result;
		

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
hell clsk1 = new hell(30,40);
hell clsk2 = new hell(30,40);
hell clsk3 = new hell();


float result = clsk1.add(clsk1.v,clsk1.r);
System.out.println("add should print method overloading and construction overloding 2 variables  "+result);
float result1 = clsk2.add(clsk2.v,clsk2.r,clsk2.o);
System.out.println("add should print method overloading and construction chaining 3 variables with 2 variables "+result1);
float result2 = clsk3.add(12,14,50,80);
System.out.println("hello world"+result2);

	}
	
}
