package oopsproject;
import java.util.Scanner;
public class as1 {
static int n,j=1,j1=1;
static int s=0, s1=1, s2=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner inp = new Scanner(System.in);
System.out.println("enter a number:");
n= inp.nextInt();
inp.close(); 
for(int i=1;i<=n;i++) {
	if(i%2==0) {
	System.out.println("all the even number are " +i);	
	}
}
for(int i=0;i<=n;i++) {
	if(i%2!=0) {
		
	System.out.println("all the odd number are " +i);	
	}
}

for(int i=1;i<=n;i++) {
	s2=s1;
	s1=s;
	s= s1+s2;
	}
System.out.println("fibnoci value of the number u hav choosen is="+s);
for(int i=1;i<=n;i++) {
	j1=j;
	j=i*j1;
}
System.out.println("factorial of number is" +j);

}
}
