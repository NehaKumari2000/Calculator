import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,c,d;
System.out.println("enter any two number");
Scanner s = new Scanner(System.in);
a=s.nextInt();
b=s.nextInt();
System.out.print("Select Operation");
c=s.nextInt();
if(c==1) {
	d=a+b;
	System.out.print("ADDITION:"+d);
}
else if(c==2) {
	d=a-b;
	System.out.print("SUBTRACTION:"+d);
}
else if(c==3) {
	d=a*b;
	System.out.print("MULTIPLICATION:"+d);
}
else if(c==4) {
	d=a/b;
	System.out.print("Division:"+d);
}
else {
	d=a%b;
	System.out.print("REMAINDER:"+d);
}
	}
	

}
