package oopsproject;


public class managerclass {
	int enu;
	Name name;
	double page;
		
	managerclass(int no, Name name,double phr){
		this.name= name;
		this.enu= no;
		this.page= phr;		
	}
	
	
	
	void demo() {
		System.out.println("employee  "+name.first+" "+name.last);
		System.out.print("is  with employee number "+enu+" has a pay rate of  "+page);
	}
	
	public static void main(String[] args) {
		Name name= new Name("rohit", "naidu");
		managerclass m1= new managerclass(2,name,27.4);
		
	m1.demo();
	}

}